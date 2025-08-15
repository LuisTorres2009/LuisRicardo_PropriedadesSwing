import javax.swing.*;
import java.awt.event.*;

public class Exercicio7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 7 - JComboBox");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String[] paises = {"Brasil", "Argentina", "Chile"};
        JComboBox<String> comboBox = new JComboBox<>(paises);
        comboBox.setBounds(30, 30, 150, 25);
        comboBox.setSelectedItem("Argentina");

        JLabel label = new JLabel("Selecionado: Argentina");
        label.setBounds(30, 70, 200, 25);

        comboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                label.setText("Selecionado: " + e.getItem());
            }
        });

        frame.add(comboBox);
        frame.add(label);
        frame.setVisible(true);
    }
}