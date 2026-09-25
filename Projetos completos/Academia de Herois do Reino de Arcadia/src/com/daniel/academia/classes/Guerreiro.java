package com.daniel.academia.classes;

import com.daniel.academia.classes.superclasse.Heroi;

public class Guerreiro extends Heroi {
    private int resistencia;
    private int energia;

    public Guerreiro(String nome, int nivel, int vida, int mana, int resistencia, int energia) {
        super(nome, nivel, vida, mana);
        this.resistencia = resistencia;
        this.energia = energia;
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
}
