package exercicio18;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        int i=0;
        while (i < 5) {

            System.out.print("Informe o nome da pessoa: ");
            nome = input.nextLine();
            System.out.print("Informe a idade: ");
            idade = input.nextInt();
            
            input.nextLine(); //Tratamento de erro para "skipping nextLine() after use of other next functions (like 'nextInt()')"

            if (idade >= 18) {
                System.out.println(nome + " já é MAIOR de idade.");
            } else {
                System.out.println(nome + " ainda é MENOR de idade.");
            }

            i++;
        }

        input.close();
    }
}