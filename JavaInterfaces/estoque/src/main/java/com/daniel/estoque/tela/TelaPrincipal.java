package com.daniel.estoque.tela;

import com.daniel.estoque.excecoes.NegocioException;
import com.daniel.estoque.gerenciamento.Gerenciadora;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaPrincipal extends JFrame{

    private JTextField txtNomeProduto;
    private JTextField txtPreco;
    private JTextField txtQtdEstoque;

    private String nomesCategorias[] = {"Alimento", "Bebida", "Eletrônico", "Vestuário"};
    private JComboBox chkCategoria;

    private JButton btnCadastrar;
    private JButton btnRemoverSelecionado;
    private JButton btnLimpar;

    private DefaultTableModel model = new DefaultTableModel(
        new String[]{"Nome", "Preço", "Quantidade", "Categoria"}, 0
    );

    JTable tbLista = new JTable(model);

    Gerenciadora gerencia = new Gerenciadora();


    public TelaPrincipal() {
        setTitle("Estoque");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painelCampos = new JPanel();
        painelCampos.setLayout(new GridLayout(4,2,5,5));

        JLabel lblNomeProduto = new JLabel("Nome do produto:");
        txtNomeProduto = new JTextField();

        JLabel lblPreco =  new JLabel("Valor:");
        txtPreco = new JTextField();

        JLabel lblQtdEstoque = new JLabel("Quantidade:");
        txtQtdEstoque = new JTextField();

        JLabel lblCategoria = new JLabel("Categoria:");
        chkCategoria = new JComboBox<>(nomesCategorias);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBackground(new Color(46, 204, 113));

        btnLimpar = new JButton("Limpar");
        btnLimpar.setBackground(new Color(218, 218, 218));

        btnRemoverSelecionado = new JButton("Remover selecionado");
        btnRemoverSelecionado.setBackground(new Color(248, 81, 81));

        JPanel topo = new JPanel(new BorderLayout());
        topo.add(painelCampos, BorderLayout.CENTER);
        topo.add(painelBotoes, BorderLayout.SOUTH);

        add(topo, BorderLayout.NORTH);
        add(new JScrollPane(tbLista), BorderLayout.CENTER);


        painelCampos.add(lblNomeProduto);
        painelCampos.add(txtNomeProduto);

        painelCampos.add(lblPreco);
        painelCampos.add(txtPreco);

        painelCampos.add(lblQtdEstoque);
        painelCampos.add(txtQtdEstoque);

        painelCampos.add(lblCategoria);
        painelCampos.add(chkCategoria);

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnRemoverSelecionado);

        btnCadastrar.addActionListener(e -> cadastrar());
        btnLimpar.addActionListener(e -> limpar());
        btnRemoverSelecionado.addActionListener(e -> remover());

        setVisible(true);
    }
    public void cadastrar() {
        String nome = (txtNomeProduto.getText().trim());

        double valor;
        int quantidade;

        try {
            valor = Double.parseDouble(txtPreco.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "ERRO: Digite apenas números no campo PREÇO."
            );
            return;
        }

        try {
            quantidade = Integer.parseInt(txtQtdEstoque.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "ERRO: Digite apenas números no campo QUANTIDADE."
            );
            return;
        }

        String categoria = (String) chkCategoria.getSelectedItem();

        try {
            gerencia.cadastra(nome, valor, quantidade, categoria);
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
            );
            return;
        } catch (Error f) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ops! Algum erro inesperado aconteceu.",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        model.addRow(new Object[]{nome, valor, quantidade, categoria});

    }

    public void limpar() {
        txtNomeProduto.setText("");
        txtPreco.setText("");
        txtQtdEstoque.setText("");

    }

    public void remover() {
        int linha = tbLista.getSelectedRow();

        if (linha == -1) {
            try {
                throw new IllegalStateException("Selecione uma linha para ser removida.");
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(
                        this,
                        e.getMessage());
            }
            return;
        }

        int linhaModel = tbLista.convertRowIndexToModel(linha);

        String nomeProduto = model.getValueAt(linhaModel, 0).toString();

        model.removeRow(linhaModel);

        gerencia.remove(nomeProduto);

        JOptionPane.showMessageDialog(
                this,
                "Linha apagada com sucesso!"
        );

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new TelaPrincipal()
        );
    }

}

