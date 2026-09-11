
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício16 {
    public static void main(String[] args) {
        double valorConta, numPessoas, valorPessoa;
        valorConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da conta:"));
        numPessoas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de pessoas:"));
        //processamento
        valorPessoa = valorConta/numPessoas;
        //
        JOptionPane.showMessageDialog(null, "Valor por pessoa: " + "R$" + valorPessoa);
    }
}
