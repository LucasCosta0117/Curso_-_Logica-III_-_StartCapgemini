/*
24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
*/

package exercicio24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int res, numero;

        res = 1;

        while (res == 1){
            System.out.print("Informe um número: ");
            numero = input.nextInt();

            if (numero > 0) {
                System.out.println("Valor POSITIVO");
            } else if (numero < 0) {
                System.out.println("Valor NEGATIVO");
            } else {
                System.out.println("Valor IGUAL a ZERO");
            }

            System.out.println("Deseja fazer uma nova consulta? (1-SIM / 2-NÃO)");
            res = input.nextInt();
        }

    }
}
