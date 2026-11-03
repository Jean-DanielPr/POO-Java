package com.daniel.estoque.exceptions;

public class NomeDuplicadoException extends NegocioException {
    public NomeDuplicadoException(String message) {
        super(message);
    }
    public NomeDuplicadoException() {
        super("Nome duplicado.");
    }
}
