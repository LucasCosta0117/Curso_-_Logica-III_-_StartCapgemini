/*
22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
Informe o valor de custo de cada produto, o valor de venda de cada produto, a média de preço de custo e do preço de venda;
 */

package exercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double precoCusto, precoVenda, mediaPreco;
        String resultado;

        for ( int i=0; i<4; i++ ) {
            System.out.print("Informe o preço de custo: ");
            precoCusto = input.nextDouble();
            System.out.print("Informe o preço de venda: ");
            precoVenda = input.nextDouble();

            mediaPreco = (precoCusto + precoVenda)/2;

            if (precoVenda > precoCusto) {
                resultado = "Lucro";
            } else if (precoVenda < precoCusto) {
                resultado = "Prejuízo";
            } else {
                resultado = "Empate";
            }

            System.out.printf("-- RESUMO -- %n" +
                              "Preço de compra: R$%,.2f %n" +
                              "Preço de venda: R$%,.2f %n" +
                              "Resultado do produto: %s %n" +
                              "Média do preço: R$%,.2f %n"
                              , precoCusto, precoVenda, resultado, mediaPreco);
        }
    }
}