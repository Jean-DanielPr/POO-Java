import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonTest extends JFrame {

    private JButton botao1, botao2;
    private JLabel label = new JLabel("Area de Teste");
    private JPanel painel;

    public ButtonTest() {
        super("Testando botões");

        Container c = getContentPane();
        painel = new JPanel();
        painel.setLayout(new GridLayout(0, 1));

        TrataBotoes tratador = new TrataBotoes();

        painel.add(label);

        botao1 = new JButton("Botao Um");
        botao1.addActionListener(tratador);
        painel.add(botao1);

        botao2 = new JButton("Botao Dois");
        botao2.addActionListener(tratador);
        painel.add(botao2);

        c.add(painel, BorderLayout.CENTER);

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Classe interna que trata os eventos dos botões
    class TrataBotoes implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Botao Um")) {
                label.setText("Clicou no Botao Um");
                System.out.println("Botão Um foi clicado!");
            } else if (e.getActionCommand().equals("Botao Dois")) {
                label.setText("Clicou no Botao Dois");
                System.out.println("Botão Dois foi clicado!");
            }
        }
    }

    // Método main para executar o programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonTest();
            }
        });
    }
}