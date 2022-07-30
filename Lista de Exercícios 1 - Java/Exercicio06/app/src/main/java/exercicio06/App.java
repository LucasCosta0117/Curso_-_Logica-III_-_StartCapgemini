package exercicio06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float numA, numB, aux;

        System.out.print("Informe o valor para variável A: ");
        numA = input.nextFloat();
        System.out.print("Informe o valor para variável B: ");
        numB = input.nextFloat();

        aux = numA;
        numA = numB;
        numB = aux;
        
        System.out.println("Valores invertidos!");
        System.out.println("A agora vale: "+ numA);
        System.out.print("B agora vale: "+ numB);

        input.close(); //tratativa para erro no VSCODE
    }
}