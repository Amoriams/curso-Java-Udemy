package Compor_memoria.vetorExc;

import java.util.Scanner;

public class Ex_6AbaixoMedia {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        int n;

        System.out.print("Quantos elementos vai ter o vetor: ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double media = 0;
        double soma =0;


        for (int i = 0; i < n; i++){
            soma += vect[i];
            media = soma / n;
        }

        System.out.printf("MEDIA DO VETOR: %.3f", media);
        System.out.println(" \n\n ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < n; i++){
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }










        sc.close();
    }
}
