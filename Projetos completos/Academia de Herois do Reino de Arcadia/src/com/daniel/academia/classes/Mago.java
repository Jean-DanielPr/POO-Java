package com.daniel.academia.classes;

import com.daniel.academia.classes.superclasse.Heroi;

public class Mago extends Heroi {
    private String poderMagico;
    private int inteligencia;

    public Mago(String nome, int nivel, int vida, int mana, String poderMagico, int inteligencia) {
        super(nome, nivel, vida, mana);
        this.poderMagico = poderMagico;
        this.inteligencia = inteligencia;
    }

    @Override
    public void listarHerois(){

    }

    public String getPoderMagico() {
        return poderMagico;
    }
    public void setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}
