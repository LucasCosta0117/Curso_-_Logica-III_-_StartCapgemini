package exercicio02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float num1, num2, soma, subt, mult, divis;

        System.out.print("Insira o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        subt = num1 - num2;
        mult = num1 * num2;
        divis = num1 / num2;

        System.out.println("Os valores obtidos foram:");
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subt);
        System.out.println("Multiplicação = " + mult);
        System.out.println("Divisão = " + divis);
    }
}