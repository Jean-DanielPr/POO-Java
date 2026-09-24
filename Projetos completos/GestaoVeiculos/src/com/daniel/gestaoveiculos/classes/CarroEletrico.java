package com.daniel.gestaoveiculos.classes;

import com.daniel.gestaoveiculos.interfaces.Conectavel;
import com.daniel.gestaoveiculos.interfaces.Eletrico;
import com.daniel.gestaoveiculos.interfaces.Rastreavel;

public class CarroEletrico extends Carro implements Eletrico, Conectavel, Rastreavel {
    private int nivelBateria;

//Método Construtor//
    public CarroEletrico(String marca, String modelo, int ano, double velocidade, int qtdPortas, int nivelBateria){
        super(marca, modelo, ano, velocidade, qtdPortas);
        this.setNivelBateria(nivelBateria);
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Nível de bateria: " + getNivelBateria());
    }
    @Override
    public void realizarManutencao() {
        System.out.println("Calibragem dos pneus e verificação da saúde da bateria.");
    }


    @Override
    public void carregarBateria() {
        setNivelBateria(100);
    }
    @Override
    public void conectarInternet() {
        System.out.println("Veículo conectado a internet.");
    }
    @Override
    public String obterLocalizacao() {
        return "Brasília-DF";
    }
    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }
    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria < 0) {
            throw new IllegalArgumentException("Impossível existir um nível de bateria negativo.");
        } else {
            this.nivelBateria = nivelBateria;
        }
    }
}
