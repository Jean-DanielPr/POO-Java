package com.daniel.academia.classes;

import java.util.Scanner;

public class UtilClasse {

    //Uma pausa com scanner para melhorar a dinamica do programa.
    public static void pausa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presisone enter para continuar...");
        scanner.nextLine();
    }

    //Gambiarra para limpar a tela ele dá um print várias vezes com a tela limpa.
    public static void limpaTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
