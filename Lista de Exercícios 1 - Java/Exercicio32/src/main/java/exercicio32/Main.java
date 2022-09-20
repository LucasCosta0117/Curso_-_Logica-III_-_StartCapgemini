/*
32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */

package exercicio32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.print("Informe o PRIMEIRO lado: ");
        ladoA = input.nextInt();
        System.out.print("Informe o SEGUNDO lado: ");
        ladoB = input.nextInt();
        System.out.print("Informe o TERCEIRO lado: ");
        ladoC = input.nextInt();

        if ( ladoA > (ladoB + ladoC) ) {
            System.out.println("Valores informados NÃO FORMAM um triângulo");
        } else if ( ladoB > (ladoA + ladoC) ) {
            System.out.println("Valores informados NÃO FORMAM um triângulo");
        } else if ( ladoC > (ladoA + ladoB) ) {
            System.out.println("Valores informados NÃO FORMAM um triângulo");
        } else {
            if ( (ladoA == ladoB) && (ladoA == ladoC) ) {
                System.out.println("Triângulo EQUILáTERO");
            } else if ( (ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC) ) {
                System.out.println("Triângulo ESCALENO");
            } else {
                System.out.println("Triângulo ISÓSCELES");            }
        }

    }
}
