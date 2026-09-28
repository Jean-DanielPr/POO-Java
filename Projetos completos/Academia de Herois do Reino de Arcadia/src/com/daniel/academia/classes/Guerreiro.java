package com.daniel.academia.classes;

import com.daniel.academia.classes.superclasse.Heroi;

public class Guerreiro extends Heroi {
    private int resistencia;
    private int energia;
    private int forca;

    public Guerreiro(String nome, int nivel, int vida, int mana, int resistencia, int energia, int forca) {
        super(nome, nivel, vida, mana);
        this.resistencia = resistencia;
        this.energia = energia;
        this.forca = forca;
    }

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
        this.resistencia = resistencia;
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
}
