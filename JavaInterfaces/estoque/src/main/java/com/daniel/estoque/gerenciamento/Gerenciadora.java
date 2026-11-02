package com.daniel.estoque.gerenciamento;

import com.daniel.estoque.excecoes.NomeDuplicadoException;
import com.daniel.estoque.produto.Produto;


import java.util.ArrayList;
import java.util.List;

public class Gerenciadora {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastra(String nome, double valor, int quantidade, String categoria) {
        for (Produto p : produtos) {
            if (nome.equals(p.getNome())) {
                throw new NomeDuplicadoException("Já existe um produto cadastrado com esse nome.");
            }
        }
        produtos.add(new Produto(nome, valor, quantidade, categoria));
    }

    public void remove(String nome) {
        produtos.removeIf(p -> nome.equals(p.getNome()));
    }
}
