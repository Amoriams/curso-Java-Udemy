package exercicios.recomeco;

import java.util.Scanner;

public class CinemaSistem {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double ingresso;

        System.out.print("Digite o dia: ");
        String diaSemana = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if ((idade < 18) && (diaSemana.equalsIgnoreCase("terca") || diaSemana.equalsIgnoreCase("terça"))) {
            ingresso = 5;
        } else if (diaSemana.equalsIgnoreCase("terca") || diaSemana.equalsIgnoreCase("terça")){
            ingresso = 10;
        } else if (idade <=12 || idade >= 60){
            ingresso = 10;
        }  else {
            ingresso = 20;
        }

        System.out.printf("o valor do ingresso é: R$%.2f%n" , ingresso);
    }

}
