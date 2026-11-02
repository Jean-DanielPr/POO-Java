package com.daniel.estoque.excecoes;

public class PrecoInvalidoException extends NegocioException {
    public PrecoInvalidoException() {
        super("Preço inválido");
    }

    public PrecoInvalidoException(String message) {
        super(message);
    }
}
