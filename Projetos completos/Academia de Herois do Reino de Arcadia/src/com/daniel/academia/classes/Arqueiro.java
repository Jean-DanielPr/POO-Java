package com.daniel.academia.classes;
import com.daniel.academia.classes.superclasse.Heroi;

public class Arqueiro extends Heroi {
    private int precisao;
    private int agilidade;
    private int concentracao;

    public Arqueiro(String nome, int nivel, int vida, int mana, int precisao, int agilidade, int concentracao) {
        super(nome, nivel, vida, mana);
        this.precisao = precisao;
        this.agilidade = agilidade;
        this.concentracao = concentracao;
    }

    @Override
    public void listarHerois() {
        System.out.println("------ARQUEIRO------");
        super.listarHerois();
        System.out.println("Precisao: " + this.precisao + "%");
        System.out.println("Agilidade: " + this.agilidade);
        System.out.println("Concentração: " + this.concentracao);
    }
    public int getPrecisao() {
        return precisao;
    }
    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getAgilidade() {
        return agilidade;
    }
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getConcentracao() {
        return concentracao;
    }
    public void setConcentracao(int concentracao) {
        this.concentracao = concentracao;
    }
}
