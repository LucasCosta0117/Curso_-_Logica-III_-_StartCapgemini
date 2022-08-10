package exercicio19;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<String> sexo = new ArrayList<String>();
        int contMasc=0, contFem=0;

        int i=0;
        while (i < 3) {
            System.out.print("Informe o nome: ");
            nome.add(i, input.nextLine());
            System.out.print("Informe o sexo da pessoa ( M = Masculino / F = Feminino): ");
            sexo.add(i, input.nextLine());
            
            if (sexo.get(i) == "m" || sexo.get(i) == "M") {
                contMasc ++;
            } else {
                contFem ++;
            }
            
            i++;
        }

        i=0;
        while (i < 3) {
            System.out.println("Nome: "+ nome.get(i) +" | Sexo: "+ sexo.get(i));
            
            i++;
        }
        
        System.out.print("Foram informados "+ contFem +" pessoas do sexo Feminino, e, "+
        contMasc +" do sexo Masculino.");
        
        input.close();
    }
}