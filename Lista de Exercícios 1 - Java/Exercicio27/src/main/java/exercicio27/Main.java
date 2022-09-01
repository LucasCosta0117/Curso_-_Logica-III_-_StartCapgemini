/*
27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto.
Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível
(álcool – 25%, gasolina – 21% ou diesel –14%).
Com valor do veículo zero encerra entrada de dados.
Informe total de desconto e total pago pelos clientes;
 */

package exercicio27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float valorVeiculo=0, valorDesconto=0, valorPago=0, totalDesconto=0, totalPago=0;
        int combustivel;


        do {
            System.out.print("Informe o valor do veículo (Informe '0' para sair): R$");
            valorVeiculo = input.nextFloat();
            if (valorVeiculo == 0) {break;}

            System.out.println("Qual combustível do veículo? (Informe o número da opção desejada) \n" +
                             "[1 -Álcool | 2 -Gasolina | 3 -Diesel]");
            combustivel = input.nextInt();

            switch (combustivel) {
                case 1 -> {
                    valorDesconto = valorVeiculo * 0.25f;
                    totalDesconto += valorDesconto;
                }
                case 2 -> {
                    valorDesconto = valorVeiculo * 0.21f;
                    totalDesconto += valorDesconto;
                }
                case 3 -> {
                    valorDesconto = valorVeiculo * 0.14f;
                    totalDesconto += valorDesconto;
                }
            }

            valorPago = valorVeiculo - valorDesconto;
            totalPago += valorPago;

            System.out.printf("Valor do veículo: R$%,.2f %n" +
                              "Valor do desconto calculado: R$%,.2f %n" +
                              "Valor a ser pago: R$%,.2f %n%n", valorVeiculo, valorDesconto, valorPago);

        } while (valorVeiculo != 0);

        System.out.printf("Valor total a ser pago: R$%,.2f %n" +
                          "Valor total em descontos: R$%,.2f %n%n"
                          , totalPago, totalDesconto);

    }
}
