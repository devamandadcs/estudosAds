
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício22 {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        if (idade >= 60) {
            JOptionPane.showMessageDialog(null, "Idoso");
        }
        else if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Adulto");
        }
        else if (idade >= 12) {
            JOptionPane.showMessageDialog(null, "Adolescente");
        }
        else
            JOptionPane.showMessageDialog(null, "Criança");
    }
}
