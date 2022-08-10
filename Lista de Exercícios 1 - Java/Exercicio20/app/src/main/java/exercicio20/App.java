/*
 20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
 Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros.
 O desconto deverá ser calculado de acordo com o ano do veículo. 
 Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar 
 calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral;
 */
package exercicio20;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoVeiculo;
        float valorDesconto, valorVeiculo, valorPago, desconto;
        char res = 'n';

        while (res == 'S' || res == 's') {
            System.out.print("Informe o valor do veículo: ");
            valorVeiculo = input.nextFloat();
            System.out.print("Informe o ano do veículo: ");
            anoVeiculo = input.nextInt();

            if(anoVeiculo <= 2000){
                desconto = 0.12f;
            } else {
                desconto = 0.07f;
            }

            valorDesconto = valorVeiculo * desconto;
            valorPago = valorVeiculo - valorDesconto;

            System.out.println("O desconto cedido foi de: R$"+ valorDesconto +" ("+ (desconto*100) +"%).");
            System.out.println("O valor final a ser pago é de: R$"+ valorPago +".");
            System.out.println();

            System.out.print("Deseja realizar uma nova consulta? (N - Não | S - Sim): ");
            res = input.next().charAt(0);
        }

        input.close();
    }
}