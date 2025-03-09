package exercicios.exercicio1.exercicio4;

import java.util.Scanner;

public class exer1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002){
            System.out.println("senha invalida");
            password = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

    }
}
