package exercicio05;

import java.util.Scanner;

public class App {
     public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String nome;
        float nota = 0.0f;
        float somaNota = 0.0f;
        float media = 0.0f;

        System.out.print("Inform o nome do Aluno: ");
        nome = input.nextLine();

        for (int i=0; i<3; i++) {
            System.out.print("Inform a "+ (i+1) +"ª nota: ");
            nota = input.nextFloat();
            somaNota += nota;
        }

        media = somaNota/3;

        System.out.print("A média do aluno "+ nome +" foi de "+ media);

        input.close(); //trativa de erro para o VSCODE
    }
}