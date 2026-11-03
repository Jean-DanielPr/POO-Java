package com.daniel.estoque.model;

import com.daniel.estoque.view.TelaPrincipal;

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

    /* Eu fiz as minhas exceções personalizadas herdando de RunTimeException que são exceções não checadas.
    Fiz assim porque eu não quis poluir os meus métodos dizendo que eles poderiam lançar uma exceção checada,
    caso eu tivesse herdado de Exception.
    Como são muitas exceções eu preferi fazer assim e também porque os erros que tratam que aquelas exceções tratam
    são erros que podem acontecer em tempo de execução e não na compilação.
    O caso de um usuário deixar um campo em branco ou digitar letras aonde é para por número etc.
    Por esse motivo achei melhor trabalhar com exceções não checadas.
     */
}
