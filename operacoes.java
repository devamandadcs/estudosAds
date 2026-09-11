
package exercícios2bim;

import javax.swing.JOptionPane;

public class operacoes {
    public static void main(String[] args) {
        //declaração
        double n1, n2, soma, sub, mult, div, pow;
        char operacao;
        //entrada
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        operacao = JOptionPane.showInputDialog("Digite a operação (símbolo)").charAt(0);
        //processamento
        soma = n1+n2;
        sub = n1-n2;
        mult = n1*n2;
        div = n1/n2;
        //condicional
        if (operacao == '+') {
            JOptionPane.showMessageDialog(null, "Soma = " + soma);
        }
        else if (operacao == '-') {
            JOptionPane.showMessageDialog(null, "Subtração: " + sub);
        }
        else if (operacao == '*') {
            JOptionPane.showMessageDialog(null, "Multiplicação: " + mult);
        }
        else if (operacao == '/') {
            JOptionPane.showMessageDialog(null, "Divisão: " + div);
        }
        else 
            JOptionPane.showMessageDialog(null, "Operação inválida");
    }
}
    
