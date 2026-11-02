package com.daniel.estoque.executavel;

import com.daniel.estoque.tela.TelaPrincipal;

import javax.swing.*;

public class IniciaSoftware {
    public static void main(String[] args) {

        try {
            SwingUtilities.invokeLater(() ->
                    new TelaPrincipal()
            );
        } catch (Error e) {
            System.out.println("Ops! Algo inesperado aconteceu!");
        } finally {
            System.out.println("Finalizando...");
        }
    }
}
