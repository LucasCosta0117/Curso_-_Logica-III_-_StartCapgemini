package exercicio09;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float deposito, valorFinal;
        float taxaJuros = 0.0007f;

        System.out.print("Informe o valor depositado (R$): ");
        deposito = input.nextFloat();
        
        valorFinal = deposito*(1 + taxaJuros);

        System.out.print("O valor com rendimentos após um mês é de: R$"+ valorFinal);

        input.close();
    }
}