package com.daniel.gestaoveiculos.classes;

import com.daniel.gestaoveiculos.classes.superclasse.Veiculo;

public class Moto extends Veiculo {
    private boolean possuiPartidaEletrica;

//Método construtor//
    public Moto(String marca, String modelo, int ano, double velocidade, boolean partidaEletrica) {
        super(marca, modelo, ano, velocidade);
        this.setPossuiPartidaEletrica(partidaEletrica);
    }

    @Override
    public void exibirStatus() {
        System.out.println("===== Moto =====");
        super.exibirStatus();
        System.out.println("Partida elétrica: " + getPossuiPartidaEletrica());
    }

    @Override
    public void realizarManutencao(){
        System.out.println("Verificação da corrente e dos pneus.");
    }
//Métodos especiais//
    public boolean getPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }
    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }
}
