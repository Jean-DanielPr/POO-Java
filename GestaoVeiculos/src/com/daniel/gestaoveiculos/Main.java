package com.daniel.gestaoveiculos;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Moto("Honda", "FIT", 2023, 50, true));
        veiculos.add(new Carro("Honda", "FIT", 2013, 75, 4));
        veiculos.add(new CarroEletrico("BYD", "Dolphin", 2026, 89, 4, 77));
        veiculos.add(new Caminhao("Scania", "T1000", 2020, 80, 9500));

        for(Veiculo v : veiculos) {
            v.exibirStatus();
            v.realizarManutencao();
        }
        if(veiculos.get(3) instanceof Caminhao c) {
            c.destino();
        }

        Veiculo.carrosCadastrados();
    }
}
