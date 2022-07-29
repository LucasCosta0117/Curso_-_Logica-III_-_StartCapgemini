package exercicio01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int soma;
        
        System.out.print("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo número: ");
        num2 = input.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("A soma dos dois números é: " + soma);
    }
}