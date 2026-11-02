package com.daniel.estoque.excecoes;

public class EstoqueInvalidoException extends NegocioException {
    public EstoqueInvalidoException(String message) {
        super(message);
    }

    public EstoqueInvalidoException() {
        super("Estoque inválido.");
    }
}
