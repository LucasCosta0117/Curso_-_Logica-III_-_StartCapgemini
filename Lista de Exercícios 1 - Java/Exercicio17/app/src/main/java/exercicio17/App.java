package exercicio17;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, contNum=0;

        int i=0;
        while (i < 5) { //proposto ler 80 números
            System.out.print("Informe um número: ");
            num = input.nextInt();
            if (num >= 10 && num <= 150) {
                contNum++;
            }
            i++;
        }

        System.out.print("Foram informados "+ contNum +" números no intervalo entre 10 e 150 (inclusos).");

        input.close(); //Tratamento de erro no VSCode
    }
}
