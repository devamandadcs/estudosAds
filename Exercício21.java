
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício21 {
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));
        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else if (nota >= 5) {
            JOptionPane.showMessageDialog(null, "Recuperação");
        }
        else
            JOptionPane.showMessageDialog(null, "Reprovado");
    }
}
