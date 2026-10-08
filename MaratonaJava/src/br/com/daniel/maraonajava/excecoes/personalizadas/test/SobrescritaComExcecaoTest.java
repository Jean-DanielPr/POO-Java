package br.com.daniel.maraonajava.excecoes.personalizadas.test;

import br.com.daniel.maraonajava.excecoes.personalizadas.Funcionario;
import br.com.daniel.maraonajava.excecoes.personalizadas.LoginInvalidoException;
import br.com.daniel.maraonajava.excecoes.personalizadas.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExcecaoTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        funcionario.salvar();
    }
}
