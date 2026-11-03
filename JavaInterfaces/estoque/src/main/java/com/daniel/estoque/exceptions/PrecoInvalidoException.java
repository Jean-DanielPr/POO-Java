package com.daniel.estoque.exceptions;

public class PrecoInvalidoException extends NegocioException {
    public PrecoInvalidoException() {
        super("Preço inválido");
    }

    public PrecoInvalidoException(String message) {
        super(message);
    }
}
