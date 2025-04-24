package exercicios.proprios;

import java.util.Scanner;

public class atvd1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;

        int soma;
        System.out.print("Qual é seu nome? ");
        nome = sc.nextLine();
        System.out.print("Agora sua idade: ");
        idade = sc.nextInt();
        System.out.print("por fim seu salario ");
        salario = sc.nextDouble();

        System.out.println("otimo, " + nome);
        soma = 2025 - idade;
        System.out.println("por voce ter " + idade + " anos, voce nasceu em " + soma);
        System.out.printf("ganhar %.2f deve ser muito bom", salario);


        sc.close();
    }
}
