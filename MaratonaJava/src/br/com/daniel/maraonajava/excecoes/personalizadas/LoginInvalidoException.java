package br.com.daniel.maraonajava.excecoes.personalizadas;

// Eu escolho se vai ser uma extensão que a pessoa vai ser obrigada a tratar ou não através do extends

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
