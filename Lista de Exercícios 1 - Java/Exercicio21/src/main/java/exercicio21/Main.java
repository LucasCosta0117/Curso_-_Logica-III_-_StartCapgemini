/*
21. Escreva um algoritmo que leia os dados de N pessoas (nome, sexo, idade e saúde) e
informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package exercicio21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade;
        int totalPessoas=0, totalFem=0, totalMasc=0, totalApto=0, totalMenorIdade=0, totalMaiorIdade=0,totalDefic=0;
        String nome, apto="", sexo, saude;
        char res;

        do{
            System.out.println("!!CONSULTA DE DISPENSA MILITAR!!");
            System.out.print("Informe o nome: ");
            nome = input.nextLine();
            System.out.print("Informe a idade: ");
            idade = input.nextInt();
            System.out.print("Informe o sexo (F = Feminino / M = Masculino): ");
            sexo = input.next();
            System.out.print("Portador de alguma deficiência? (S = Sim / N = Não): ");
            saude = input.next();


            if (idade >= 18) {
                if (saude.charAt(0) == 'N' || saude.charAt(0) == 'n') {
                    apto = "CIDADÃO APTO AO SERVIÇO MILITAR OBRIGATÓRIO";
                    totalApto++;
                }
                totalMaiorIdade++;
            } else {
                totalMenorIdade++;
                apto = "CIDADÃO NÃO APTO AO SERVIÇO MILITAR OBRIGATÓRIO";
            }

            //Tratativas para apresentação do resultado do SEXO
            if (sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f') {
                sexo = "Feminino";
                totalFem++;
            } else if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm') {
                sexo = "Masculino";
                totalMasc++;
            } else {
                sexo = "error : Undefined";
            }

            //Tratativas para apresentação do resultado da SAÚDE
            if (saude.charAt(0) == 'S' || saude.charAt(0) == 's') {
                saude = "Portador de deficiência";
                totalDefic++;
            } else if (saude.charAt(0) == 'N' || saude.charAt(0) == 'n') {
                saude = "Não portador de deficiência";
            } else {
                saude = "error : Undefined";
            }

            System.out.println("------------------" + "\n" +
                    "Cidadão: "+ nome + "\n" +
                    "Idade: "+ idade + "\n" +
                    "Sexo: "+ sexo + "\n" +
                    "Saúde: "+ saude + "\n" +
                    apto + "\n");

            System.out.println("Deseja realizar uma nova consulta? (S = Sim / N = Não)");
            res = input.next().charAt(0);
            totalPessoas++;

            //tratativa de erro para consumo da linha do método .nextLine() seguido do .nextInt() na linha 20/22
            input.nextLine();

        } while (res == 's' || res == 'S');

        //Apresentação dos totais baseado nas variáveis coletadas
        System.out.println("|| RESULTADO DA CONSULTA ||" + "\n" +
                "Total de pessoas consultadas: "+ totalPessoas + "\n" +
                "Maiores de idade: "+ totalMaiorIdade + "\n" +
                "Menores de idade: "+ totalMenorIdade + "\n" +
                "Pessoas do sexo FEMININO: "+ totalFem + "\n" +
                "Pessoas do sexo MASCULINO: "+ totalMasc + "\n" +
                "Pessoas com DEFICIÊNCIA: "+ totalDefic + "\n" +
                "Total de PESSOAS APTAS AO SERVIÇO MILITAR: "+ totalApto);
    }
}
