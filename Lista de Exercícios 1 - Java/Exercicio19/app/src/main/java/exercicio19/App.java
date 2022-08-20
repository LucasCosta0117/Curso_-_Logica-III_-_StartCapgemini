package exercicio19;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();
        ArrayList<String> sexo = new ArrayList<>();
        int contMasc=0, contFem=0;

        for (int i=0; i < 3; i++) {
            System.out.print("Informe o nome: ");
            nome.add(i, input.nextLine());
            System.out.print("Informe o sexo da pessoa ( M = Masculino / F = Feminino): ");
            sexo.add(i, input.nextLine());

            if (sexo.get(i).equals("m") || sexo.get(i).equals("M")) {
                contMasc ++;
                sexo.set(i, "Masculino");
            } else {
                contFem ++;
                sexo.set(i, "Feminino");
            }
        }

        for (int i=0; i < 3; i++) {
            System.out.println("Nome: "+ nome.get(i) +" | Sexo: "+ sexo.get(i));
        }

        System.out.print("Foram informados "+ contMasc +" pessoas do sexo Masculino, e, "+
                contFem +" do sexo Feminino.");
    }
}