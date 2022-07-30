package exercicio07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float tempF, tempC;

        System.out.println("|Converta sua temperatura de Celsius para Fahrenheit|");
        System.out.print("Informa a temperatura (ºC): ");
        tempC = input.nextFloat();
        
        tempF = ((9*tempC + 160)/5);
        
        System.out.print("A sua temperatura é "+ tempF +"º (graus) Fahrenheit.");

        input.close(); //Tratativa para erro VSCODE
    }
}