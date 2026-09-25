package com.daniel.academia.classes.superclasse;

public abstract class Heroi {
    private String nome;
    private int nivel;
    private int vida;
    private int mana;
    private static int qtdHerois;

// Método construtor


    public Heroi(String nome, int nivel, int vida, int mana) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        qtdHerois++;
    }

    // Métodos específicos
    public void cadastrarHeroi() {

    }
    public void listarHerois() {

    }
    public void exibirEstatisticas() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
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
