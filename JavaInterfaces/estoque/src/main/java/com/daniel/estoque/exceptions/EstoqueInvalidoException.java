package com.daniel.estoque.exceptions;

public class EstoqueInvalidoException extends NegocioException {
    public EstoqueInvalidoException(String message) {
        super(message);
    }

    public EstoqueInvalidoException() {
        super("Estoque inválido.");
    }
}
