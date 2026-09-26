package com.daniel.academia;

import com.daniel.academia.classes.Mago;
import com.daniel.academia.classes.superclasse.Heroi;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Heroi> herois = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            herois.add(new Mago("Harry", 12,12,23,"Fire", 23));

        }
        Heroi.exibirNumHerois();
    }
}