package br.com.daniel.maraonajava.excecoes.personalizadas;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar () throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando...");
    }
}
