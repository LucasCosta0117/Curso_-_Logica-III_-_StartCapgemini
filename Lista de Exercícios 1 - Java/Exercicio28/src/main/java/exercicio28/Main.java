/*
28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionário
de acordo com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo.
Calcule o seu novo salário reajustado.
Escrever o nome do funcionário, o reajuste e seu novo salário.
Calcule quanto à empresa vai aumentar sua folha de pagamento;
 */

package exercicio28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        float salario, salarioMin, salarioReajustado=0, aumentoDaFolha=0, folhaAtual=0, folhaReajustada=0;
        int qtdFuncionarios;

        qtdFuncionarios = 3; //Proposto 584

        System.out.println("Informe o valor do SALáRIO MíNIMO atual: ");
        salarioMin = input.nextFloat();
        input.nextLine();

        for (int i=0; i<qtdFuncionarios; i++) {
            System.out.println("NOME do funcionário: ");
            nome = input.nextLine();
            System.out.println("SALáRIO ATUAL do funcionário: ");
            salario = input.nextFloat();
            input.nextLine();

            if ( salario < (3*salarioMin) ) {
                salarioReajustado = salario * 1.5f;
            } else if ( salario <= (10*salarioMin) ) {
                salarioReajustado = salario * 1.2f;
            } else if ( salario <=(20*salarioMin) ) {
                salarioReajustado = salario * 1.15f;
            } else {
                salarioReajustado = salario * 1.10f;
            }

            folhaAtual += salario;
            folhaReajustada += salarioReajustado;
            aumentoDaFolha = folhaReajustada - folhaAtual;

            System.out.printf("Funcionário: %s %n" +
                              "Salário reajustado: R$%,.2f %n"
                            , nome, salarioReajustado);
        }

        System.out.printf("A folha de pagamento passa de R$%,.2f para R$%,.2f. %n" +
                          "Um aumento de R$%,.2f ."
                         , folhaAtual, folhaReajustada, aumentoDaFolha);
    }
}
