package com.daniel.atividades.atividade2;

import javax.swing.*;
import java.awt.*;

public class ListaDeCompras extends JFrame {

    private JTextField txtProduto;
    private JTextField txtQuantidade;
    private JTextField txtPreco;

    private JTextArea txtList;

    private String desconto[] = {"5%", "10%", "15%"};
    private JComboBox chkServico;

    private JLabel lblListaDeCompras;
    private JLabel lblPula;
    private JLabel lblPorPessoa;
    private JLabel lblPreco;
    private JLabel lblTotal;

    private JButton btnAdicionar;
    private JButton btnLimpar;

    double totalCompra = 0;

    public ListaDeCompras() {

        setTitle("Conta do Restaurante");
        setSize(420, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(6, 2, 10, 10));

        lblListaDeCompras = new JLabel("LISTA DE COMPRAS");
        lblPula = new JLabel("");

        JLabel lblProduto = new JLabel("Produto:");
        txtProduto = new JTextField();

        JLabel lblQuantidade = new JLabel("Quantidade:");
        txtQuantidade = new JTextField();

        lblPreco = new JLabel("Preço:");
        txtPreco = new JTextField();

        txtList = new JTextArea();

        lblTotal = new JLabel("Total da compra:");

        btnAdicionar = new JButton("ADICIONAR");
        btnLimpar = new JButton("LIMPAR CAMPOS");


        painel.add(lblListaDeCompras);
        painel.add(lblPula);

        painel.add(lblProduto);
        painel.add(txtProduto);

        painel.add(lblQuantidade);
        painel.add(txtQuantidade);

        painel.add(lblPreco);
        painel.add(txtPreco);

        painel.add(btnAdicionar);
        painel.add(btnLimpar);

        painel.add(txtList);

        painel.add(lblTotal);

        add(painel);

        btnAdicionar.addActionListener(e -> calcularConta());

        btnLimpar.addActionListener(e -> limpar());

        setVisible(true);
    }

    private void calcularConta() {

        try {

            int i = 0;
            i++;

            String produto = (txtProduto.getText().trim());

            int quantidade =
                    Integer.parseInt(txtQuantidade.getText());

            if (quantidade < 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "A quantidade não pode ser negativa."
                );
                return;
            }

            double preco =
                    Double.parseDouble(txtPreco.getText());

            if (preco <= 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "O preço não pode ser 0 ou negativo."
                );
                return;
            }

            double subtotal = quantidade * preco;

            totalCompra += subtotal;



            lblTotal.setText("Total da compra: " + totalCompra);

            txtList.append(String.format("%s - %d x R$ %.2f = R$ %.2f%n",
                    produto, quantidade, preco, subtotal));


        } catch (NumberFormatException erro) {

            JOptionPane.showMessageDialog(
                    this,
                    "Digite valores válidos.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );

        }


    }

    private void limpar() {

        txtPreco.setText("");
        txtProduto.setText("");
        txtQuantidade.setText("");

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() ->
                new ListaDeCompras()
        );
    }
}