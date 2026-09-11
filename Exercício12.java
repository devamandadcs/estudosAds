
package exercícios2bim;

import javax.swing.JOptionPane;

public class Exercício12 {
    public static void main(String[] args) {
        double primeiroNum, segundoNum, soma, subtracao, multiplicacao, divisao, modulo;
        //entrada
        primeiroNum = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        segundoNum = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        //processamento
        soma = primeiroNum + segundoNum;
        subtracao = primeiroNum - segundoNum;
        multiplicacao = primeiroNum * segundoNum;
        divisao = primeiroNum/segundoNum;
        modulo = primeiroNum%segundoNum;
        //saída
        JOptionPane.showMessageDialog(null, "Soma: " + soma + "\n"+
                                            "Substração: " + subtracao + "\n"+
                                            "Multiplicação: " + multiplicacao + "\n"+
                                            "Divisão: " + divisao + "\n"+
                                            "Resto da divisão: " + modulo);
    }
    
}
