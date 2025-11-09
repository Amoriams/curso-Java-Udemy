package Compor_memoria.vetorExc;

import java.util.Scanner;

public class Ex_3NumerosPares {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        int quantidade =0;

        System.out.println();

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++){
            if (vect[i] % 2 ==0 ) {
                System.out.print(" " + vect[i]);
                quantidade++;
            }
        }

        System.out.print("/n/n QUANTIDADES DE PARES: " + quantidade);













    sc.close();

    }
}
