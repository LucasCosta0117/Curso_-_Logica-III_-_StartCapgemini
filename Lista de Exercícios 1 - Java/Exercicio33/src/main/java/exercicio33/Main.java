/*
33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
Faça um algoritmo que calcule e exiba o salário de um professor.
Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.
 */

package exercicio33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        float horasTotais, salario, horaAula=0.00f;
        int nivel;

        System.out.print("Informe o nome do professor: ");
        nome = input.nextLine();
        System.out.print("Informe a quantidade de horas ministradas: ");
        horasTotais = input.nextFloat();
        System.out.println("Informe o nível do professor (1, 2 ou 3): ");
        nivel = input.nextInt();

        switch (nivel) {
            case 1 -> horaAula = 12.00f;
            case 2 -> horaAula = 17.00f;
            case 3 -> horaAula = 25.00f;
            default -> System.out.println("Error: O nível informado não existe");
        }

        salario = horasTotais * horaAula;

        System.out.printf("O professor %s receberá um salário  de R$%.2f", nome, salario);

    }
}
