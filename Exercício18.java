
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício18 {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        if (idade>=18) {
            JOptionPane.showMessageDialog(null, "Maior de idade: " +idade);
        }
        else {
            JOptionPane.showMessageDialog(null, "Menor de idade: " +idade);
        }
    }
}
