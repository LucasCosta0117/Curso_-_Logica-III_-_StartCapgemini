package exercicio14;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.print("O número "+ num1 +" é o maior!");
        } else {
            System.out.print("O número "+ num2 +" é o maior!");
        }

        input.close();
    }
}