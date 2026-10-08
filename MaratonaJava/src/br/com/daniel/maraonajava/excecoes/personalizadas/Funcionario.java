package br.com.daniel.maraonajava.excecoes.personalizadas;

public class Funcionario extends Pessoa {
// A sobrescrita de um metodo nao precisa lançar exceções também, mas pode lançar
// Não pode lançar exceções mais genéricas que a sua classe pai
    @Override
    public void salvar() {
        System.out.println("Salvando funcionario...");
    }

}
