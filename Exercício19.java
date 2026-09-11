
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício19 {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        if (idade>=18) {
            JOptionPane.showMessageDialog(null, "Adulto: " +idade);
        }
        else if (idade>=12) {
            JOptionPane.showMessageDialog(null, "Adolescente: " +idade);
        }
        else {
            JOptionPane.showMessageDialog (null, "Criança: " +idade);
        }
    }
}

