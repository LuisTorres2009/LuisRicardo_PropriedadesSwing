import javax.swing.*;
import java.awt.*;

public class Exercicio2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 2 - JTabbedPane");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(20, 20, 300, 250);

        // Aba 1
        JPanel aba1 = new JPanel();
        aba1.add(new JLabel("Bem-vindo às Configurações!"));
        tabbedPane.addTab("Configurações", aba1);

        // Aba 2
        JPanel aba2 = new JPanel();
        aba2.setBackground(Color.BLUE);

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setForeground(Color.WHITE);
        aba2.add(labelNome);

        aba2.add(new JTextField(15));
        tabbedPane.addTab("Perfil", aba2);

        // Aba 3
        JPanel aba3 = new JPanel();
        JTextArea textArea = new JTextArea(" Digite suas dúvidas aqui.", 5, 20);
        aba3.add(new JScrollPane(textArea));
        tabbedPane.addTab("Ajuda", aba3);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}