package com.daniel.academia;

import com.daniel.academia.classes.classeutil.UtilClasse;
import com.daniel.academia.classes.gerenciadora.GerenciarHerois;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciarHerois heroi = new GerenciarHerois();
        int opcao;

        do {
            opcao = heroi.menu();
            switch (opcao) {
                case 1:
                    heroi.cadastrarHeroi();
                    UtilClasse.pausa();
                    UtilClasse.limpaTela();
                    break;
                case 2:
                    heroi.exibirHerois();
                    UtilClasse.pausa();
                    UtilClasse.limpaTela();
                    break;
                case 3:
                    heroi.buscarHeroi();
                    UtilClasse.pausa();
                    UtilClasse.limpaTela();
                    break;
                case 4:
                    heroi.caracteristicasGerais();
                    UtilClasse.pausa();
                    UtilClasse.limpaTela();
                    break;
                case 5:
                    heroi.exibirRelatorio();
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    UtilClasse.pausa();
                    break;
            }
        } while (opcao != 5);

    }

}