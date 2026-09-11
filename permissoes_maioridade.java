
package exercícios2bim;

import javax.swing.JOptionPane;

public class permissoes_maioridade {
    public static void main(String[] args) {
        //declaração
        int idade;
        //entrada
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        //condicional
        if (idade<16) {
            JOptionPane.showMessageDialog(null, "Não pode votar" +"\n"+ 
                                                "Não pode dirigir");
        }
        else if (idade>=16 && idade<18) {
            JOptionPane.showMessageDialog(null, "Pode votar" +"\n"+
                                                "Não pode dirigir");
        }
        else 
            JOptionPane.showMessageDialog(null, "Pode votar" + "\n" + 
                                                "Pode dirigir");
    }
}
