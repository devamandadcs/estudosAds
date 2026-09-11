
package exercícios2bim;

import java.util.Scanner;

public class Exercício13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double temperaturaC, temperaturaF;
        //entrada
        System.out.print("Digite a temperatura em graus Celsius: ");
        temperaturaC = entrada.nextDouble();
        //processamento
        temperaturaF = (temperaturaC * 9/5)+32;
        //saída
        System.out.println("Temperatura em Fahrenheit: " + temperaturaF);
    }
    
}
