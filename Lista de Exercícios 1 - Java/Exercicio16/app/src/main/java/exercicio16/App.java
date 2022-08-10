package exercicio16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nomeAluno;
        float nota=0.00f, somaNotas=0.00f, media=0.00f;

        System.out.print("Informe nome do Aluno: ");
        nomeAluno = input.nextLine();

        int i = 0;
        while (i < 3) {
            System.out.print("Informe a "+ (i+1) +"ª nota: ");
            nota = input.nextFloat();
            somaNotas += nota;
            i++;
        }

        media = somaNotas/i;

        if (media >= 7) {
            System.out.println("O Aluno "+ nomeAluno +" foi APROVADO com média: "+ media);
        } else if (media <= 5) {
            System.out.println("O Aluno "+ nomeAluno +" foi REPROVADO com média: "+ media);
        } else {
            System.out.println("O Aluno "+ nomeAluno +" foi colocado em RECUPERAÇÃO com média: "+ media);
        }

        input.close(); //Tratamento para erro no VSCode
    }
}