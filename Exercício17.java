
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício17 {
    public static void main(String[] args) {
        //declaração
        int numero;
        //entrada
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        //processamento - estrutura condicional
        if (numero%2==0) {
            JOptionPane.showMessageDialog(null, numero+ " é par");
        }
        else {
            JOptionPane.showMessageDialog(null, numero+ " é ímpar");
        }
    }
    
}
