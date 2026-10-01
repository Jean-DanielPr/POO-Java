package com.daniel.academia.classes.gerenciadora;

import com.daniel.academia.classes.herois.*;
import com.daniel.academia.classes.missoes.Missao;
import com.daniel.academia.classes.superclasse.Heroi;
import com.daniel.academia.interfaces.Cadastro;
import java.util.Scanner;

/** A classe GerenciarHerois é a classe mais importante do projeto, atraves dessa classe que
 * todo o programa funciona.
 * Essa classe importa a superclasse Heroi e todas as classes filhas de Heroi e implementa a interface Cadastro.*/

public class GerenciarHerois implements Cadastro {
    /** Aqui eu declarei um array de 20 posições, para que o nosso programa não tenha que chegar na excessão
     * e pare de funcionar, então é uma segunda camada de proteção e não deixa de seguir a regra de negócio.
     * O scanner vai ler todas as entradas do teclado. opcao vai ser utilizado no switch-case
     * Os metodos estaticos vao contar as quantidades de cada heroi cadastrado de cada classe ao final do
     * cadastro de cada 1 deles*/
    private Heroi[] listadeHeroi = new Heroi[20];
    private static int contadorHeroi = 0;
    Scanner scanner = new Scanner(System.in);
    private int opcao;
    private static int qtdMagos;
    private static int qtdArqueiros;
    private static int qtdGuerreiros;
    private static double mediaNivel;

    private Missao[] missao = new Missao[20];
    private static int contadorMissao = 0;
    private static int missoesConcluidas = 0;

    /**Menu principal que vai aparecer na tela toda vez que uma operação for finalizada.*/
    public int menu() {
        int opcao;
        System.out.println("====================");
        System.out.println(" Academia de Herois ");
        System.out.println("  Reino de Arcadia  ");
        System.out.println("====================\n");
        System.out.println("Esolha uma opção:");
        System.out.println("[1] Cadastrar herói");
        System.out.println("[2] Listar herois");
        System.out.println("[3] Buscar heroi");
        System.out.println("[4] Exibir estatisticas");
        System.out.println("[5] Missões");
        System.out.println("[6] Sair");
        System.out.print("Sua escolha: ");
        opcao = scanner.nextInt();
        System.out.println("====================");
        scanner.nextLine();
        return opcao;
    }

    /**Aqui ocorre o cadastro de herois. Primeiramente ele verifica se a academia não está lotada
     * e depois pergunta qual vai ser a classe do heroi a ser cadastrado.
     * Com a resposta ele entra em um if e faz o cadastro de 1 heroi. Somando 1 no contador de herois.
     * E também limpando o buffer após cada cadastro*/

    /** Nesse metodo em específico eu tratei as exceções dos meus metodos construtores para nao aceitarem
     * valores maiores do que 100 para não permitir valores abusurdos e o tratamento não finaliza o programa.
     *
     */
    @Override
    public void cadastrarHeroi() {
        if (contadorHeroi >= 20) {
            System.out.println("A academia está lotada.");
            return;
        }

        System.out.println("Escolha a classe do heroi a ser cadastrado.");
        System.out.println("[1] Arqueiro");
        System.out.println("[2] Mago");
        System.out.println("[3] Guerreiro");
        System.out.print("Sua escolha: ");
        int tipo = scanner.nextInt();
        System.out.println("====================");
//      Limpa o buffer
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Nivel ");
        int nivel = scanner.nextInt();
        mediaNivel += nivel;
        System.out.print("Vida: ");
        int vida = scanner.nextInt();
        System.out.print("Mana: ");
        int mana = scanner.nextInt();
//      Limpa o buffer
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Agilidade: ");
            int agilidade = scanner.nextInt();
            System.out.print("Concentraçao: ");
            int concentracao = scanner.nextInt();
            System.out.print("Precisao: ");
            int precisao = scanner.nextInt();
            scanner.nextLine();

            try {
                listadeHeroi[contadorHeroi] = new Arqueiro(nome, nivel, vida, mana, agilidade, concentracao, precisao);
                contadorHeroi++;
                qtdArqueiros++;
                System.out.println("Arqueiro cadastrado com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println("===============================");
                System.out.println("    ARQUEIRO NÃO CADASTRADO    ");
                System.out.println("Erro: " + e.getMessage());
                System.out.println("===============================");
            }

        } else if (tipo == 2) {
            System.out.print("Poder Mágico: ");
            String poderMagico = scanner.nextLine();
            System.out.print("Inteligência: ");
            int inteligencia = scanner.nextInt();
            scanner.nextLine();
            try {
                listadeHeroi[contadorHeroi] = new Mago(nome, nivel, vida, mana, poderMagico, inteligencia);
                contadorHeroi++;
                qtdMagos++;
                System.out.println("Mago cadastrado com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println("===============================");
                System.out.println("       MAGO NÃO CADASTRADO     ");
                System.out.println("Erro: " + e.getMessage());
                System.out.println("===============================");
            }

        } else if (tipo == 3) {
            System.out.print("Resistencia: ");
            int resistencia = scanner.nextInt();
            System.out.print("Energia: ");
            int energia = scanner.nextInt();
            System.out.print("Força: ");
            int forca = scanner.nextInt();
            scanner.nextLine();
            try {
                listadeHeroi[contadorHeroi] = new Guerreiro(nome, nivel, vida, mana, resistencia, energia, forca);
                contadorHeroi++;
                qtdGuerreiros++;
                System.out.println("Guerreiro cadastrado com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println("===============================");
                System.out.println("    GUERREIRO NÃO CADASTRADO    ");
                System.out.println("Erro: " + e.getMessage());
                System.out.println("===============================");
            }

        } else {
            System.out.println("Opção inválida.");
        }
    }

    /** Aqui eu conferi se o total de herois não era 0 para ter o que mostrar na tela
     * E logo depois eu faço um for utilizando o contadorHeroi como parametro para saber aonde parar
     * Em cada volta do for eu pego o array na posição (i) e coloco ele para exibir o metodo listarHerois que
     * eu sobreescrevi nas classes filhas de Heroi.
     * Dentro das classes filhas eu coloquei para exibir a classe do heroi, e isso deu um charme a mais no terminal*/
    @Override
    public void exibirHerois() {
        if (contadorHeroi == 0) {
            System.out.println("Nenhum heroi cadastrado ainda.");
        }
        for(int i = 0; i < contadorHeroi; i++ ) {
            listadeHeroi[i].listarHerois();
        }
    }

    /** Nesse metodo de busca eu faço uma comparação do nome digitado com o
     * getNome() de cada posição do nosso array de herois. Tudo dentro de um for igual ao de cima
     * para rodar todos os herois cadastrados. Quando o nome for igual ele printa na tela que achou e mostra
     * as caracteristicas daquele heroi encontrado.*/
    @Override
    public String buscarHeroi() {
        System.out.println("Informe o nome do heroi abaixo:");
        String nome = scanner.nextLine();
        for(int i = 0; i < contadorHeroi; i++ ) {
            if (nome.equals(listadeHeroi[i].getNome())) {
                System.out.println("HEROI ENCONTRADO.");
                listadeHeroi[i].listarHerois();
                return listadeHeroi[i].getNome();
            }
        }
        System.out.println("Heroi nao encontrado.");
        return null;
    }

    public void menuMissao() {
        System.out.println("[1] Cadastrar missão");
        System.out.println("[2] Fazer missao");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch (opcao) {
            case 1:
                System.out.print("Nome missao: ");
                String nomeMissao = scanner.nextLine();
                System.out.println("Dificuldade: ");
                System.out.println("[1] Fácil");
                System.out.println("[2] Médio");
                System.out.println("[3] Difícil");
                System.out.print("Sua escolha: ");
                int dificuldade = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                try {
                    missao[contadorMissao] = new Missao(nomeMissao, dificuldade);
                    contadorMissao++;
                    System.out.println("Missão cadastrada com sucesso!");
                } catch (IllegalArgumentException e) {
                    System.out.println("===========================");
                    System.out.println("   Missão nao cadastrada   ");
                    System.out.println("Erro: " + e.getMessage());
                    System.out.println("===========================");
                }
                break;

            case 2:
                if (contadorMissao == 0) {
                    System.out.println("Nenhuma missao foi cadastrada ainda.");
                    break; // Interrompe para não tentar buscar se não houver missões
                }

                System.out.println("Informe o nome da missão que deseja fazer:");
                String buscaNomeMissao = scanner.nextLine();

                Missao missaoEscolhida = null;

                // Procura a missão pelo nome no array
                for (int i = 0; i < contadorMissao; i++) {
                    if (missao[i].getNome().equalsIgnoreCase(buscaNomeMissao)) {
                        missaoEscolhida = missao[i];
                        break;
                    }
                }

                // Se não encontrar a missão, avisa e sai
                if (missaoEscolhida == null) {
                    System.out.println("Missão não encontrada.");
                    break;
                }

                System.out.println("Missão encontrada! Agora escolha o herói para realizá-la.");
                String nomeHeroi = buscarHeroi();

                // Se encontrar o herói (buscarHeroi retornar diferente de null), inicia a missão
                if (nomeHeroi != null) {
                    System.out.println("===========================");
                    missaoEscolhida.iniciarMissao(nomeHeroi);
                    missoesConcluidas++;
                    System.out.println("===========================");
                } else {
                    System.out.println("Não é possível iniciar a missão sem um herói válido.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    /** Metodo para falar um breve resumo sobre a academia de herois de arcadia*/
    @Override
    public void caracteristicasGerais() {
        System.out.println("A academia de herois foi criada para salvar o reino de Arcadia.");
        System.out.println("Na academia nós suportamos 3 tipos de classes de herois.");
        System.out.println("1 Arqueiros");
        System.out.println("2 Magos");
        System.out.println("3 Guerreiros");
        System.out.println("\nMas infelizmente só temos espaço para 20 bravos herois.");
        System.out.println("Venha conosco nessa jornada. \nOs 20 primeiros serão selecionados para salvar o reino de ARCADIA.");
    }

    /**
     * Retorna a média do nível de todos os heróis cadastrados.
     * Como eu já somei os níveis na variável mediaNivel durante o cadastro,
     * basta dividir pelo total de heróis.
     */
    public double calcularMediaNivel() {
        if (contadorHeroi == 0) {
            return 0.0;
        }
        return mediaNivel / contadorHeroi;
    }

    /**
     * Retorna o nome do herói com o nível mais alto.
     * Percorre o array comparando os níveis para achar o maior.
     */
    public String buscarHeroiNivelMaisAlto() {
        if (contadorHeroi == 0) {
            return "Nenhum herói cadastrado.";
        }

        String nomeMaisForte = listadeHeroi[0].getNome();
        int maiorNivel = listadeHeroi[0].getNivel();

        for (int i = 1; i < contadorHeroi; i++) {
            if (listadeHeroi[i].getNivel() > maiorNivel) {
                maiorNivel = listadeHeroi[i].getNivel();
                nomeMaisForte = listadeHeroi[i].getNome();
            }
        }
        return nomeMaisForte;
    }

    /** Metodo para exibir um relatorio final toda vez que o usuário digitar 5 que é para sair do programa
     * Esse metodo apenas mostra algumas informações sobre a academia*/

    @Override
    public void exibirRelatorio() {
        System.out.println("==========RELATÒRIO==========");
        Heroi.exibirNumHerois();
        System.out.println("\n\nQuantidade de Magos: " + qtdMagos);
        System.out.println("Quantidade de Guerreiros: " + qtdGuerreiros);
        System.out.println("Quantidade de Arqueiros: " + qtdArqueiros);
        System.out.println("\n\nMédia de nível:" + calcularMediaNivel());
        System.out.println("Heroi mais forte:" + buscarHeroiNivelMaisAlto());
        System.out.println("\n\nQuantidade de missões feitas: " +  missoesConcluidas);
        System.out.println("=============================");

    }
}
