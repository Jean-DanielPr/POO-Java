package com.daniel.academia.classes.superclasse;

public abstract class Heroi {
    private String nome;
    private int nivel;
    private int vida;
    private int mana;
    private static int qtdHerois = 0;
    private static final int limiteHerois = 20;
// Método construtor

    public Heroi(String nome, int nivel, int vida, int mana) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        qtdHerois++;
        if (qtdHerois > limiteHerois){
            throw new IllegalStateException("Apenas 20 herois podem ser cadastrados.");
        }
    }

    // Métodos específicos
    public void cadastrarHeroi() {

    }
    public void listarHerois() {

    }

    public static void exibirNumHerois() {
        System.out.println(qtdHerois + " Herois cadastrados.");
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vida +
                ", mana=" + mana +
                '}';
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
}
