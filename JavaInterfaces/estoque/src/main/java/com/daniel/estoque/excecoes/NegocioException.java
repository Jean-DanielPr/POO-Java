package com.daniel.estoque.excecoes;

public class NegocioException extends RuntimeException {
    public NegocioException(String message) {
        super(message);
    }
}
