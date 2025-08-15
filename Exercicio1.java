import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Exercicio1 {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame frame = new JFrame("Exercício 1 - JPanel e JButton");
        frame.setSize(350, 350); // Define tamanho da janela (largura, altura)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quando o usuário clicar no "X", o programa será encerrado
        frame.setLayout(null); // Define layout nulo
        
        // Cria um painel
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN); // Cor de fundo do painel
        panel.setBorder(BorderFactory.createTitledBorder( // Cria uma borda com título
                BorderFactory.createLineBorder(Color.BLACK), // Linha preta como borda
                "Painel de Controle", // Texto do título
                TitledBorder.CENTER, // Centraliza o título horizontalmente
                TitledBorder.TOP // Posiciona o título na parte superior
        ));
        panel.setLayout(null); // Layout nulo para posicionamento manual dentro do painel
        panel.setBounds(50, 50, 230, 150); // Posição (x, y) e tamanho (largura, altura)

        // Cria um botão
        JButton button = new JButton("Clique Aqui");
        button.setBackground(Color.YELLOW); // Cor de fundo do botão
        button.setBounds(50, 50, 120, 30); // Posição e tamanho dentro do painel

        // Adiciona o botão ao painel
        panel.add(button);

        // Adiciona o painel à janela principal
        frame.add(panel);

        // Torna a janela visível
        frame.setVisible(true);
    }
}