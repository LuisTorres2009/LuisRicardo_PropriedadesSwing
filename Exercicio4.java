import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Exercicio4 {
    public static void main(String[] args) throws ParseException {
        JFrame frame = new JFrame("Exercício 4 - Campo Formatado");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Data de Nascimento:");
        label.setBounds(30, 30, 200, 20);

        MaskFormatter mask = new MaskFormatter("##/##/####");
        mask.setPlaceholderCharacter('_');

        JFormattedTextField campoData = new JFormattedTextField(mask);
        campoData.setBounds(30, 60, 100, 25);

        frame.add(label);
        frame.add(campoData);
        frame.setVisible(true);
    }
}

/*
    Explicação do MaskFormatter:
    
    1. MaskFormatter("##/##/####") define uma máscara para entrada de dados no formato DD/MM/AAAA:
        - '#' aceita apenas dígitos (0-9)
        - '/' é um caractere fixo, que aparece sempre na mesma posição
    
    2. setPlaceholderCharacter('_') define que os espaços não preenchidos apareçam como '_', mostrando 
       claramente onde o usuário deve digitar os números.

    3. JFormattedTextField(campoData) vincula o campo de texto à máscara, garantindo que o usuário só possa 
       digitar valores conforme o padrão definido. Assim, o campo inicial aparece como: __/__/____
    
    4. Resultado prático: o usuário digita apenas números, não pode alterar os '/' fixos, e o campo garante
       que a entrada siga o formato correto de data.
*/