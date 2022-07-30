package exercicio10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorCompra, valorParcela;
        int nParcelas;

        System.out.print("Informe o valor total da compra (R$): ");
        valorCompra = input.nextFloat();
        System.out.print("Informe o número de parcelas (até 5 sem juros): ");
        nParcelas = input.nextInt();
        
        valorParcela = valorCompra / nParcelas;
        
        System.out.print("Você pagará R$"+ valorParcela +" em "+ nParcelas +" parcelas.");
        
        input.close(); //tratativa de erro VSCODE
    }
}