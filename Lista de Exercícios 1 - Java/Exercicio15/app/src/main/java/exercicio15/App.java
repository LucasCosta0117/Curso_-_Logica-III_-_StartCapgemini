package exercicio15;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Digita um número: ");
        num = input.nextInt();

        if (num > 100 && num < 200) {
            System.out.print("O número digitado foi "+ num +", e está dentro do intervalo 100 e 200");
        } else {
            System.out.print("O número digitado foi "+ num +", e está fora do intervalo 100 e 200");
        }

        input.close();
    }
}