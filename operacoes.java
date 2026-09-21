
package exercícios2bim;

import javax.swing.JOptionPane;

public class operacoes {
    public static void main(String[] args) {
        //declaração
        double n1, n2, resposta;
        char operacao;
        //entrada
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        operacao = JOptionPane.showInputDialog("Digite a operação: \n+ \n- \n* \n/").charAt(0);
        //processamento
        switch (operacao) {
            case '+':
                resposta=n1+n2;
                JOptionPane.showMessageDialog(null, resposta);
                break;
            case '-':
                resposta=n1-n2;
                JOptionPane.showMessageDialog(null, resposta);
                break;
            case '*':
                resposta=n1*n2;
                JOptionPane.showMessageDialog(null, resposta);
                break;
            case '/':
                resposta=n1/n2;
                JOptionPane.showMessageDialog(null, resposta);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
        }
    }
}
    
