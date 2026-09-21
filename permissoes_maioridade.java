
package exercícios2bim;

import javax.swing.JOptionPane;

public class permissoes_maioridade {
    public static void main(String[] args) {
        //declaração
        int idade;
        //entrada
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        //condicional
        if (idade>=18)
            JOptionPane.showMessageDialog(null, "Você pode votar e dirigir.");
        else if (idade>=16)
            JOptionPane.showMessageDialog(null, "Você só pode votar.");
        else 
            JOptionPane.showMessageDialog(null, "Você não pode votar nem dirigir.");
    }
}
