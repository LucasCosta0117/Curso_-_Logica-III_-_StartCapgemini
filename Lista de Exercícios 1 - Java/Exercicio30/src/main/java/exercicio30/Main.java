/*
30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
 */

package exercicio30;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbs = new int[3];

        for (int i=0; i<3; i++) {
            System.out.print("Informe o "+ (i+1) + "º número: ");
            numbs[i] = input.nextInt();
        }

        Arrays.sort(numbs);

        System.out.println("Números ordenados: ");
        for (int i=0; i<3; i++) {
            System.out.println(i+1 + "º: "+ numbs[i]);
        }
    }
}
