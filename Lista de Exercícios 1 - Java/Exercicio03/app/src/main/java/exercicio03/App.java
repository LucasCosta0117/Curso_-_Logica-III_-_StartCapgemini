package exercicio03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float distPercorrida;
        float combustGasto;
        float consumoMedio;

        System.out.print("Informe a distância total percorrida (Km): ");
        distPercorrida = input.nextFloat();
        System.out.print("Informe o total de combustível gasto (L): ");
        combustGasto = input.nextFloat();
        
        consumoMedio = distPercorrida / combustGasto;

        System.out.print("O consumo médio do automóvel foi de " + consumoMedio + "Km/L");
    }
}