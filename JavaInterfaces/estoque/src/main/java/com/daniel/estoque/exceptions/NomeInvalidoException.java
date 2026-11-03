package com.daniel.estoque.exceptions;

public class NomeInvalidoException extends NegocioException {
    public NomeInvalidoException () {
        super("Nome inválido.");
    }
    public NomeInvalidoException (String message) {
        super(message);
    }
}
