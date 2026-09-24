package com.daniel.gestaoveiculos;

public class Caminhao extends Veiculo implements Destino {
    private double carga;

    public Caminhao (String marca, String modelo, int ano, double velocidade, double carga) {
        super(marca, modelo, ano, velocidade);
        setCarga(carga);
    }

    @Override
    public void exibirStatus() {
        System.out.println("===== Caminhão =====");
        super.exibirStatus();
        System.out.println("Quantidade de carga: " + getCarga() + "Kg.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação da cabine do motorista.");
    }

    @Override
    public void destino() {
        if(getCarga() <= 1000) {
            System.out.println("Destino: Centro-Oeste.");
        } else if(getCarga() <= 3000) {
            System.out.println("Destino: Norte.");
        } else if(getCarga() <= 6000) {
            System.out.println("Destino: Sudeste.");
        } else if(getCarga() <= 8000) {
            System.out.println("Destino: Sul.");
        } else {
            System.out.println("Destino: Nordeste.");
        }
    }

    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        if(carga < 0) {
            throw new IllegalArgumentException("O caminhão não pode sair com carga menor que 0kg.");
        } else if(carga < 500){
            throw new IllegalArgumentException("A carga mínima para saída do caminhão é de 500kg.");
        } else if(carga > 10000) {
            throw new IllegalArgumentException("Limite de carga do caminhão de 10.000kg excedido.");
        } else {
            this.carga = carga;
        }
    }
}
