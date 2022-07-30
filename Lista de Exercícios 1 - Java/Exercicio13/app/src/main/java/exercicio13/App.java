package exercicio13;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = input.nextInt();
        
        if (num > 10) {
            System.out.println("O número digitado foi maior que 10!");
        }
        
        System.out.print("Número digitado: "+ num);

        input.close();
    }
}