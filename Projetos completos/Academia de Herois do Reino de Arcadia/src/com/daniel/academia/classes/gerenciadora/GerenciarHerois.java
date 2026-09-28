package com.daniel.academia.classes.gerenciadora;

import com.daniel.academia.classes.herois.*;
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
        System.out.println("[5] Sair");
        System.out.print("Sua escolha: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    /**Aqui ocorre o cadastro de herois. Primeiramente ele verifica se a academia não está lotada
     * e depois pergunta qual vai ser a classe do heroi a ser cadastrado.
     * Com a resposta ele entra em um if e faz o cadastro de 1 heroi. Somando 1 no contador de herois.
     * E também limpando o buffer após cada cadastro*/
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
        int tipo = scanner.nextInt();
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
            listadeHeroi[contadorHeroi] = new Arqueiro(nome, nivel, vida, mana, agilidade, concentracao, precisao);
            contadorHeroi++;
            qtdArqueiros++;
            System.out.println("Arqueiro cadastrado com sucesso!");


        } else if (tipo == 2) {
            System.out.print("Poder Mágico: ");
            String poderMagico = scanner.nextLine();
            System.out.print("Inteligência: ");
            int inteligencia = scanner.nextInt();
            scanner.nextLine();
            listadeHeroi[contadorHeroi] = new Mago(nome, nivel, vida, mana, poderMagico, inteligencia);
            contadorHeroi++;
            qtdMagos++;
            System.out.println("Mago cadastrado!");

        } else if (tipo == 3) {
            System.out.print("Resistencia: ");
            int resistencia = scanner.nextInt();
            System.out.print("Energia: ");
            int energia = scanner.nextInt();
            System.out.print("Força: ");
            int forca = scanner.nextInt();
            scanner.nextLine();
            listadeHeroi[contadorHeroi] = new Guerreiro(nome, nivel, vida, mana, resistencia, energia, forca);
            contadorHeroi++;
            qtdGuerreiros++;
            System.out.println("Arqueiro cadastrado com sucesso!");

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
    public void buscarHeroi() {
        System.out.println("Informe o nome do heroi abaixo:");
        String nome = scanner.nextLine();
        for(int i = 0; i < contadorHeroi; i++ ) {
            if (nome.equals(listadeHeroi[i].getNome())) {
                System.out.println("HEROI ENCONTRADO.");
                listadeHeroi[i].listarHerois();
                return;
            }
        }
        System.out.println("Heroi nao encontrado.");
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

    /** Metodo para exibir um relatorio final toda vez que o usuário digitar 5 que é para sair do programa
     * Esse metodo apenas mostra algumas informações sobre a academia*/
    @Override
    public void exibirRelatorio() {
        System.out.println("==========RELATÒRIO==========");
        Heroi.exibirNumHerois();
        System.out.println("Quantidade de Magos: " + qtdMagos);
        System.out.println("Quantidade de Guerreiros: " + qtdGuerreiros);
        System.out.println("Quantidade de Arqueiros: " + qtdArqueiros);


    }
}
