/*
35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.
 */

package exercicio35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float consumo, totalConta, tarifa = 0;
        int tipoCliente;

        System.out.println("Informe o consumo em KW/h do cliente: ");
        consumo = input.nextFloat();
        System.out.println("Informe o tipo de cliente (Digite o nº da opção desejada):\n" +
                "1 - Residência\n" +
                "2 - Comércio\n" +
                "3 - Indústria\n");
        tipoCliente = input.nextInt();

        switch (tipoCliente){
            case 1 -> tarifa = 0.60f;
            case 2 -> tarifa = 0.48f;
            case 3 -> tarifa = 1.29f;
            default -> System.out.println("Opção inválida!");
        }

        totalConta = consumo * tarifa;

        System.out.printf("O valor total da conta é de R$%.2f.", totalConta);

    }
}
