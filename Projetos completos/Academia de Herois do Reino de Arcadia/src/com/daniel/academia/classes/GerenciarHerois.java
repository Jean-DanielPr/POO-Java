package com.daniel.academia.classes;

import com.daniel.academia.classes.superclasse.Heroi;
import com.daniel.academia.classes.*;
import com.daniel.academia.interfaces.Cadastro;
import java.util.Scanner;

public class GerenciarHerois implements Cadastro {

    private Heroi[] listadeHeroi = new Heroi[20];
    private static int contadorHeroi = 0;
    Scanner scanner = new Scanner(System.in);
    private int opcao;

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
        System.out.println("Escolha: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

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
            System.out.println("Arqueiro cadastrado com sucesso!");


        } else if (tipo == 2) {
            System.out.print("Poder Mágico: ");
            String poderMagico = scanner.nextLine();
            System.out.print("Inteligência: ");
            int inteligencia = scanner.nextInt();
            scanner.nextLine();
            listadeHeroi[contadorHeroi] = new Mago(nome, nivel, vida, mana, poderMagico, inteligencia);
            contadorHeroi++;
            System.out.println("Mago cadastrado!");

        } else if (tipo == 3) {
            System.out.print("Precisão: ");
            int resistencia = scanner.nextInt();
            System.out.print("Agilidade: ");
            int energia = scanner.nextInt();
            System.out.print("Concentração: ");
            int forca = scanner.nextInt();
            scanner.nextLine();
            listadeHeroi[contadorHeroi] = new Guerreiro(nome, nivel, vida, mana, resistencia, energia, forca);
            contadorHeroi++;
            System.out.println("Arqueiro cadastrado com sucesso!");

        } else {
            System.out.println("Opção inválida.");
        }
    }

    @Override
    public void exibirHerois() {
        if (contadorHeroi ==0 ) {
            System.out.println("Nenhum heroi cadastrado ainda.");
        }
        for(int i = 0; i < contadorHeroi; i++ ) {
            listadeHeroi[i].listarHerois();
        }
    }

    @Override
    public void buscarHeroi() {
        System.out.println("Informe o nome do heroi abaixo:");
        String nome = scanner.nextLine();
        for(int i = 0; i < contadorHeroi; i++ ) {
            if (nome.equals(listadeHeroi[i].getNome())) {
                System.out.println("HEROI ENCONTRADO.");
                listadeHeroi[i].listarHerois();
            } else {
                System.out.println("Heroi nao encontrado.");
            }
        }
    }

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
}
