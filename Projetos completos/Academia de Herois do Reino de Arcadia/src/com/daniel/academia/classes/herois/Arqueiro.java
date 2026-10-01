package com.daniel.academia.classes.herois;
import com.daniel.academia.classes.superclasse.Heroi;

public class Arqueiro extends Heroi {
    private int precisao;
    private int agilidade;
    private int concentracao;
    private static int qtdArqueiros = 0;

    /*Eu coloque os os setters dentro do metodo construtor para ele validar a regra que coloquei de não aceitar valores
      maiores do que 100 */
    public Arqueiro(String nome, int nivel, int vida, int mana, int precisao, int agilidade, int concentracao) {
        super(nome, nivel, vida, mana);
        setPrecisao(precisao);
        setAgilidade(agilidade);
        setConcentracao(concentracao);
        qtdArqueiros++;
    }
    /** Metodo listarHerois sobrescrito da classe Heroi utilizando a palavra super e adicionando
     * as particularidades da classe Arqueiro.*/
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
        if (precisao > 100) {
            throw new IllegalArgumentException("O limite máximo de precisão é 100%.");
        } else {
            this.precisao = precisao;
        }
    }

    public int getAgilidade() {
        return agilidade;
    }
    public void setAgilidade(int agilidade) {
        if (agilidade > 100) {
            throw new IllegalArgumentException("O limite máximo de agilidade é 100.");
        } else {
            this.agilidade = agilidade;
        }
    }

    public int getConcentracao() {
        return concentracao;
    }
    public void setConcentracao(int concentracao) {
        if (concentracao > 100) {
            throw new IllegalArgumentException("O limite máximo de concentração é 100.");
        } else {
            this.concentracao = concentracao;
        }
    }

    public static int getQtdArqueiros() {
        return qtdArqueiros;
    }
    public static void setQtdArqueiros(int qtdArqueiros) {
        Arqueiro.qtdArqueiros = qtdArqueiros;
    }
}
