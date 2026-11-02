package com.daniel.estoque.tela;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame{

    private JTextField txtNomeProduto;
    private JTextField txtPreco;
    private JTextField txtQtdEstoque;

    private String nomesCategorias[] = {"Alimento", "Eletrônico", "Vestuário"};
    private JComboBox chkCategoria;

    private JButton btnExibirProdutos;
    private JLabel lblLista;

    private JButton btnCadastrar;
    private JButton btnRemoverSelecionado;
    private JButton btnLimpar;

    public TelaPrincipal() {
        setTitle("Estoque");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6,3,10,10));

        JLabel lblNomeProduto = new JLabel("Informe o nome do produto:");
        txtNomeProduto = new JTextField();

        JLabel lblPreco =  new JLabel("Valor R$");
        txtPreco = new JTextField();

        JLabel lblQtdEstoque = new JLabel("Quantidade:");
        txtQtdEstoque = new JTextField();

        JLabel lblCategoria = new JLabel("Categoria:");
        chkCategoria = new JComboBox<>(nomesCategorias);

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");

        btnExibirProdutos = new JButton("Exibir Produtos");

        painel.add(lblNomeProduto);
        painel.add(txtNomeProduto);

        painel.add(lblPreco);
        painel.add(txtPreco);

        painel.add(lblQtdEstoque);
        painel.add(txtQtdEstoque);

        painel.add(lblCategoria);
        painel.add(chkCategoria);

        painel.add(btnCadastrar);
        painel.add(btnLimpar);

        painel.add(btnExibirProdutos);

        add(painel);

        btnCadastrar.addActionListener(e -> cadastrar());
        btnLimpar.addActionListener(e -> limpar());
        btnExibirProdutos.addActionListener(e -> exibirProdutos());

        setVisible(true);
    }
    public void cadastrar(){

    }

    public void limpar() {

    }

    public void exibirProdutos() {
        setTitle("Produtos Cadastrados");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6,3,10,10));

        lblLista = new JLabel();

        painel.add(lblLista);

        add(painel);

        setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new TelaPrincipal()
        );
    }

}

