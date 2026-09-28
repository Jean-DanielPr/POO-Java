package com.daniel.academia.classes.herois;

import com.daniel.academia.classes.superclasse.Heroi;

public class Mago extends Heroi {
    private String poderMagico;
    private int inteligencia;
    private static int qtdMago = 0;

    public Mago(String nome, int nivel, int vida, int mana, String poderMagico, int inteligencia) {
        super(nome, nivel, vida, mana);
        this.poderMagico = poderMagico;
        this.inteligencia = inteligencia;
        qtdMago++;
    }

    /** Metodo listarHerois sobrescrito da classe Heroi utilizando a palavra super e adicionando
     * as particularidades da classe Mago.*/
    @Override
    public void listarHerois() {
        System.out.println("---------MAGO---------");
        super.listarHerois();
        System.out.println("Poder mágico: " + this.poderMagico);
        System.out.println("Inteligencia: " + this.inteligencia);
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
        if (inteligencia > 100) {
            throw new IllegalArgumentException("O limite máximo é 100.");
        } else {
            this.inteligencia = inteligencia;
        }
    }

    public static int getQtdMago() {
        return qtdMago;
    }
    public static void setQtdMago(int qtdMago) {
        Mago.qtdMago = qtdMago;
    }
}
