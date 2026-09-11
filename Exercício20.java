
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício20 {
    public static void main(String[] args) {
        double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        //
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2 );
        }
        else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, num2 + " é maior que " + num1);
        }
        else
            JOptionPane.showMessageDialog(null, "Números iguais");
    }
}
