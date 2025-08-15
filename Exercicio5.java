import javax.swing.*;
import java.awt.event.*;

public class Exercicio5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 5 - JRadioButton");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JRadioButton rb1 = new JRadioButton("Masculino");
        rb1.setBounds(125, 30, 100, 20);

        JRadioButton rb2 = new JRadioButton("Feminino");
        rb2.setBounds(125, 60, 100, 20);

        JRadioButton rb3 = new JRadioButton("Outro");
        rb3.setBounds(125, 90, 100, 20);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);      

        JLabel label = new JLabel("Seleção: ");
        label.setBounds(105, 160, 200, 20);

        JButton button = new JButton("Confirmar");
        button.setBounds(105, 130, 120, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selecionado = "";
                if (rb1.isSelected()) selecionado = "Masculino";
                else if (rb2.isSelected()) selecionado = "Feminino";
                else if (rb3.isSelected()) selecionado = "Outro";
                label.setText("Seleção: " + selecionado);
            }
        });

        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
}