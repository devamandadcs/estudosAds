
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício14 {
    public static void main(String[] args) {
        double valorReais, valorDolar, cotacao;
        valorReais = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais:"));
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do dólar:"));
        //processamento 
        valorDolar = valorReais/cotacao;
        JOptionPane.showMessageDialog(null, "Valor em dólar: " + valorDolar);
    }
}
