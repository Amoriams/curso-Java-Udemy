package application;

import entities.pessoa;

import java.util.Scanner;

public class pessoaprogram {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        pessoa a = new pessoa();


        System.out.print("Digite seu nome: ");
        a.nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        a.idade = sc.nextInt();

       String apresentar = a.apresentar();
       System.out.println(apresentar);
    }
}
