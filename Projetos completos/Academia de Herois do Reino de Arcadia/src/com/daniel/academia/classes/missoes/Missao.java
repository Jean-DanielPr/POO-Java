package com.daniel.academia.classes.missoes;

import com.daniel.academia.classes.herois.*;
import com.daniel.academia.classes.superclasse.Heroi;

public class Missao {
    private String nome;
    private String dificuldade;
    private double recompensaOuro;
    private Heroi[] fazMissao;
    private int contador = 0;
    private static final int limite = 20;

    public Missao (String nome, String dificuldade, double recompensaOuro) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.recompensaOuro = recompensaOuro;
    }

    public void iniciarMissao() {

    }

    public void concluirMissao() {

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
    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public double getRecompensaOuro() {
        return recompensaOuro;
    }
    public void setRecompensaOuro(double recompensaOuro) {
        this.recompensaOuro = recompensaOuro;
    }
}
