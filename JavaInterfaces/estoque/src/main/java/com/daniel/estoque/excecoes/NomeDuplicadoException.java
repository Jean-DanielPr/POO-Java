package com.daniel.estoque.excecoes;

public class NomeDuplicadoException extends NegocioException {
    public NomeDuplicadoException(String message) {
        super(message);
    }
    public NomeDuplicadoException() {
        super("Nome duplicado.");
    }
}
