import javax.swing.*;
import java.awt.*;

public class Exercicio6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 6 - JSplitPane");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelEsquerda = new JPanel();
        painelEsquerda.setBackground(Color.RED);
        JLabel labelEsquerda = new JLabel("Esquerda"); 
        labelEsquerda.setForeground(Color.WHITE); 
        painelEsquerda.add(labelEsquerda); 

        JPanel painelDireita = new JPanel();
        painelDireita.setBackground(Color.BLUE);
        JLabel labelDireita = new JLabel("Direita");
        labelDireita.setForeground(Color.WHITE); 
        painelDireita.add(labelDireita); 

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelEsquerda, painelDireita);

        splitPane.setDividerLocation((int)(350 * 0.4));

        frame.add(splitPane);
        frame.setVisible(true);
    }
}

/*
    Explicação do setDividerLocation:
    
        O método setDividerLocation define a posição inicial da divisória (barra de separação) entre os dois
        painéis do JSplitPane.
        
        Nesse exercício: splitPane.setDividerLocation((int)(350 * 0.4));
            - Calcula 40% da largura total da janela (350 pixels), ou seja, 140 pixels da borda esquerda.
            - O painel esquerdo (painelEsquerda) ocupará 40% da largura e o painel direito (painelDireita) 60%.
            - Depois disso, o usuário ainda pode arrastar a divisória para ajustar manualmente os tamanhos.
        
        Isso permite controlar a proporção inicial dos painéis dentro do JSplitPane.
*/