package br.com.daniel.maraonajava.excecoes;

import java.io.Closeable;
import java.io.IOException;


// Aplicando o try-with-resources que faz o fechamento automatico de conexoes abertas ou arquivos.

// A classe que eu vou instanciar dentro dele precisa obrigatoriamente implementar Closeable ou AutoCloseable

public class ConectaBanco {

    public static void main(String[] args) {
        try (ConexaoBanco conexao = new ConexaoBanco()) {
            conexao.executarQuery("SELECT * FROM usuarios;");
            throw new RuntimeException("Erro de conexao.");
        } catch (RuntimeException e) {
            System.out.println("Erro caputrado: " + e.getMessage());
        }
    }
}

class ConexaoBanco implements AutoCloseable {

    public ConexaoBanco() {
        System.out.println("Conexao com banco de dados em aberto.");
    }

    public void executarQuery(String sql) {
        System.out.println("Executando query: "+sql);
    }

    @Override
    public void close() {
        System.out.println("Fechando conexao com banco de Dados.");
    }
}