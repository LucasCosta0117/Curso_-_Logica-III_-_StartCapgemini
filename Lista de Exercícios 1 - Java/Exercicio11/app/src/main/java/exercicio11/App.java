package exercicio11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float precoCusto, precoVenda, taxaLucro;

        System.out.print("Informe o preço de custo do produto (R$): ");
        precoCusto = input.nextFloat();
        System.out.print("Informe a taxa de acréscimo (%): ");
        taxaLucro = (input.nextFloat())/100;
        
        precoVenda = precoCusto*(1 + taxaLucro);
        
        System.out.println("O preço de venda do seu produto é de R$ "+ precoVenda);

        input.close();
    }
}