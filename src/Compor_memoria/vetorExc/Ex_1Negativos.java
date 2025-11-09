package Compor_memoria.vetorExc;

import java.util.Scanner;

public class Ex_1Negativos {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        int [] vect = new  int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um nuemero: ");
            vect[i] = sc.nextInt();

        }


        System.out.println();
        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i =0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }

        }


        sc.close();

    }
}
