
package exercicio04;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nome;
        float salarioFixo, salarioFinal, comissao, totalVendas;

        System.out.print("Informe o nome do vendedor: ");
        nome = input.nextLine();
        System.out.print("Informe seu salário fixo: ");
        salarioFixo = input.nextFloat();
        System.out.print("Informe o valor total de vendas efetuadas: ");
        totalVendas = input.nextFloat();

        comissao =  0.15f * totalVendas;
        salarioFinal = comissao + salarioFixo;

        System.out.println("O vendedor " + nome + ",");
        System.out.println("possue salário fixo de R$" + salarioFixo + " e,");
        System.out.println("receberá um salário de R$" + salarioFinal + " no final do mês.");
    }
}
