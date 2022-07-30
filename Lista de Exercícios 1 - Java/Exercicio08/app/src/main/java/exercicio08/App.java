package exercicio08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float cotacao, qtdDolar, qtdReal;

        System.out.print("Informe a cotação do Dolar: ");
        cotacao = input.nextFloat();
        System.out.print("Informe a quantos Dolares possue (US$): ");
        qtdDolar = input.nextFloat();
        
        qtdReal = qtdDolar*cotacao;

        System.out.print("Você possue R$"+ qtdReal +" (Reais).");

        input.close();
    }
}