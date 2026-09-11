
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício15 {
    public static void main(String[] args) {
        double peso, altura, IMC;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso (kg)"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura (m)"));
        //processamento
        IMC = peso / Math.pow(altura, 2);
        //saída
        JOptionPane.showMessageDialog(null, "IMC: " + IMC);
    }
}
