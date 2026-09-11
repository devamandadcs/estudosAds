
package exercícios2bim;

import javax.swing.JOptionPane;

public class calculadora_peso_ideal {
    public static void main(String[] args) {
        //declaração
        double altura, pesoIdealF, pesoIdealM;
        char sexo;
        //entrada de dados
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        sexo = JOptionPane.showInputDialog("Digite o sexo (F ou M)").charAt(0);
        //processamento
        pesoIdealM = (72.7*altura)-58;
        pesoIdealF = (62.1*altura) - 44.7;
        //
        if (sexo == 'M') {
            JOptionPane.showMessageDialog(null, String.format("Peso ideal: %.1f ", pesoIdealM));
        }
        else 
            JOptionPane.showMessageDialog(null, String.format("Peso ideal: %.1f ", pesoIdealF));
    }
}
