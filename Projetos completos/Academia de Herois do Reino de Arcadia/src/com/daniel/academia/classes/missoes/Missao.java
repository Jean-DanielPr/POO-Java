package com.daniel.academia.classes.missoes;

import com.daniel.academia.classes.herois.*;
import com.daniel.academia.classes.superclasse.Heroi;

public class Missao {
    private String nome;
    private String dificuldade;
    private double recompensaOuro;
    private String fazMissao;
    private static int contador = 0;

    public Missao (String nome, int dificuldade) {
        this.nome = nome;
        setDificuldade(dificuldade);
    }

    public void iniciarMissao(String nome) {
        System.out.println("Heroi: " + nome);
        this.fazMissao = nome;
        System.out.println("Missão: " + getNome());
        System.out.println("Dificuldade: " + getDificuldade());
        System.out.println("Recompensa: " + getRecompensaOuro());
        System.out.println("===========================");
        concluirMissao();
    }

    public void concluirMissao() {
        System.out.println("Missão concluida.");
        System.out.println("Recompensa: " + getRecompensaOuro() + " moedas de ouro.");
        contador++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(int dificuldade) {
        if (dificuldade == 1) {
            this.dificuldade = "Fácil";
            this.recompensaOuro = 100;
        } else if (dificuldade == 2) {
            this.dificuldade = "Médio";
            this.recompensaOuro = 200;
        } else if (dificuldade == 3) {
            this.dificuldade = "Difícil";
            this.recompensaOuro = 200;
        } else {
            throw new IllegalArgumentException("Dificuldade de missão inválida");
        }
    }

    public double getRecompensaOuro() {
        return recompensaOuro;
    }

    public String getFazMissao() {
        return fazMissao;
    }
    public void setFazMissao(String fazMissao) {
        this.fazMissao = fazMissao;
    }

    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Missao.contador = contador;
    }
}
