/*
26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso.
Caso o usuário digite um número que não esteja neste intervalo,
exibir a seguinte mensagem: número inválido;
 */

package exercicio26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um número entre 1 e 5: ");
        num = input.nextInt();

        switch (num) {
            case 1 -> System.out.println("UM");
            case 2 -> System.out.println("DOIS");
            case 3 -> System.out.println("TRÊS");
            case 4 -> System.out.println("QUATRO");
            case 5 -> System.out.println("CINCO");
            default -> System.out.println("Número inválido");
        }

    }
}
