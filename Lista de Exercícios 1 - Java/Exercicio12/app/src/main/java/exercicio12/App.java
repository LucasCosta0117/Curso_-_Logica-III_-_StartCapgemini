package exercicio12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        float custoFabrica, custoDistribuidor, custoConsumidor;
        float taxaImposto = 0.45f; 
        float taxaDistribuidor = 0.28f;

        System.out.print("Informe o valor de fábrica do veículo (R$): ");
        custoFabrica = input.nextFloat();

        custoDistribuidor = custoFabrica*(1 + taxaImposto);
        custoConsumidor = custoDistribuidor*(1 + taxaDistribuidor);

        System.out.println("O valor do veículo para o consumidor é de R$"+ custoConsumidor);


        input.close();
    }
}