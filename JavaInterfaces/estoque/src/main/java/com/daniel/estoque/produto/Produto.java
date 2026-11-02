package com.daniel.estoque.produto;

import com.daniel.estoque.excecoes.EstoqueInvalidoException;
import com.daniel.estoque.excecoes.NomeInvalidoException;
import com.daniel.estoque.excecoes.PrecoInvalidoException;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public Produto(String nome, double preco, int quantidade, String categoria) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
        setCategoria(categoria);
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new NomeInvalidoException("O nome deve ser informado.");
        }
        if (nome.trim().length() < 3) {
            throw new NomeInvalidoException("O nome deve ter pelo menos 3 caracteres.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double valor) {
        if (valor <= 0) {
            throw new PrecoInvalidoException("O valor deve ser maior do que zero.");
        }
        this.preco = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new EstoqueInvalidoException("A quantidade não pode ser negativa.");
        }
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        if (categoria.isBlank() || categoria.equals(null)) {
            throw new IllegalArgumentException("A categoria do produto deve ser informada.");
        }
        this.categoria = categoria;
    }

}
