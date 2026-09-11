
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício23 {
    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite o número"));
        if (num >= 1) {
            JOptionPane.showMessageDialog(null, "Número positivo");
        }
        else if (num <= -1) {
            JOptionPane.showMessageDialog(null, "Número negativo");
        }
        else
            JOptionPane.showMessageDialog(null, "Zero");
    }
}
