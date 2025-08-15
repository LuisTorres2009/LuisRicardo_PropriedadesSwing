import javax.swing.*;
import java.awt.*;

public class Exercicio3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 3 - JTextArea com Scroll");
        frame.setSize(350, 350);                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);                   

        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        textArea.setRows(10);
        textArea.setColumns(30);

        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < 10; i++) { 
            texto.append("Java Swing é usado para interfaces gráficas. Este é um texto de exemplo repetido para demonstrar o JScrollPane.\n");
        }
        textArea.setText(texto.toString());

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(30, 30, 280, 200); 

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}

/*
    O JScrollPane é necessário porque, por padrão, o JTextArea não exibe barras de rolagem, mesmo quando o 
    conteúdo excede o espaço visível, o que impede a visualização do texto em excesso.   

    Sem o JScrollPane o JTextArea simplesmente “corta” o texto que não cabe na área visível. É possível 
    aumentar as dimensões (setRows e setColumns), mas ainda assim, se o usuário digitar muito texto, o 
    conteúdo excedente não ficaria acessível.
*/