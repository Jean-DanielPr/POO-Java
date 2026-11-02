package com.daniel.estoque.excecoes;

public class NomeInvalidoException extends NegocioException {
    public NomeInvalidoException () {
        super("Nome inválido.");
    }
    public NomeInvalidoException (String message) {
        super(message);
    }
}
