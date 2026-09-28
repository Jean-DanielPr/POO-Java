package com.daniel.academia.classes.herois;

import com.daniel.academia.classes.superclasse.Heroi;

public class Guerreiro extends Heroi {
    private int resistencia;
    private int energia;
    private int forca;
    private static int qtdGuerreiro = 0;

    public Guerreiro(String nome, int nivel, int vida, int mana, int resistencia, int energia, int forca) {
        super(nome, nivel, vida, mana);
        this.resistencia = resistencia;
        this.energia = energia;
        this.forca = forca;
        qtdGuerreiro++;
    }

    /** Metodo listarHerois sobrescrito da classe Heroi utilizando a palavra super e adicionando
     * as particularidades da classe Guerreiro.*/
    @Override
    public void listarHerois() {
        System.out.println("------GUERREIRO------");
        super.listarHerois();
        System.out.println("Resistência: " + this.resistencia);
        System.out.println("Energia: " + this.energia);
        System.out.println("Força: " + this.forca);
    }

// Métodos especiais
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        if (resistencia > 100) {
            throw new IllegalArgumentException("O limite máximo é 100.");
        } else {
            this.resistencia = resistencia;
        }    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        if (energia > 100) {
            throw new IllegalArgumentException("O limite máximo é 100.");
        } else {
            this.energia = energia;
        }
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        if (forca > 100) {
            throw new IllegalArgumentException("O limite máximo é 100.");
        } else {
            this.forca = forca;
        }
    }

    public static int getQtdGuerreiro() {
        return qtdGuerreiro;
    }
    public static void setQtdGuerreiro(int qtdGuerreiro) {
        Guerreiro.qtdGuerreiro = qtdGuerreiro;
    }
}
