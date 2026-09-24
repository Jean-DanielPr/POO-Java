package com.daniel.gestaoveiculos.classes;

import com.daniel.gestaoveiculos.classes.superclasse.Veiculo;

public class Carro extends Veiculo {
    private int qtdPortas;


//Método construtor//
    public Carro(String marca, String modelo, int ano, double velocidade, int qtdPortas){
        super(marca, modelo, ano, velocidade);
        this.setQtdPortas(qtdPortas);
    }

    @Override
    public void exibirStatus() {
        System.out.println("===== Carro =====");
        super.exibirStatus();
        System.out.println("Portas: " + getQtdPortas());
    }

    @Override
    public void realizarManutencao(){
        System.out.println("Troca de óleo e verificação dos freios.");
    }

//Métodos especiais//
    public int getQtdPortas() {
        return qtdPortas;
    }
    public void setQtdPortas(int qtdPortas) {
        if (qtdPortas <= 1) {
            throw new IllegalArgumentException("O carro deve possuir no mínimo 2 portas.");
        } else {
            this.qtdPortas = qtdPortas;
        }
    }
}
