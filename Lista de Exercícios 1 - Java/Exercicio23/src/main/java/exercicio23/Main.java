/*
23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
menor que 25 ou igual a 40;
*/


package exercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número: ");
        numero = input.nextInt();

        if (numero < 25) {
            System.out.println("Número MENOR que 25!");
        } else if (numero > 80) {
            System.out.println("Número MAIOR que 80!");
        } else if (numero == 40){
            System.out.println("Número IGUAL a 40!");
        } else {
            System.out.println("Número está entre 25 e 80, e não é 40!");
        }
    }
}
