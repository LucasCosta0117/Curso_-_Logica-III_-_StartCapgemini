/*
25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes.
Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais.
Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
 */

package exercicio25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, maior;

        System.out.print("Informe o PRIMEIRO número: ");
        num1 = input.nextInt();
        System.out.print("Informe o SEGUNDO número: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Números informados são IGUAIS");
        } else {
            maior = Math.max(num1, num2);
            System.out.println("Números informados são DIFERENTES, "+ maior +" é maior!");
        }

    }
}
