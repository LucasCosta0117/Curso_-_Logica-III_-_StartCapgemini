/*
31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere,
pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;
caso contrário deve ser impressa uma mensagem de operador não definido.
Tratar erro de divisão por zero;
 */

package exercicio31;

import java.util.Scanner;

public class Main {

    static float validaDivisao(float num) {
        Scanner input = new Scanner(System.in);

        while (num == 0){
            System.out.println("Na DIVISÃO o SEGUNDO NÚMERO deve ser diferente de 0,");
            System.out.print("Informe um novo número: ");
            num = input.nextFloat();
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float numA, numB;
        String opC;

        System.out.print("Informe o PRIMEIRO número: ");
        numA = input.nextFloat();
        System.out.print("Informe o SEGUNDO número: ");
        numB = input.nextFloat();
        System.out.print("Informe o SIMBOLO da operação desejada ( + , - , / , * ): ");
        opC = input.next();

        switch (opC){
            case "+":
                System.out.println("SOMA: "+ (numA + numB));
                break;
            case "-":
                System.out.println("SUBTRAÇÃO: "+ (numA - numB));
                break;
            case "*":
                System.out.println("MULTIPLICAÇÃO: "+ (numA * numB));
                break;
            case "/":
                numB = validaDivisao(numB);
                System.out.println("DIVISÃO: "+ (numA / numB));
                break;
            default:
                System.out.println("Operador não definido");
        }

    }
}
