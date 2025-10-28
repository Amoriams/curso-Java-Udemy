package Compor_memoria.vetorExc;

import java.util.Scanner;

public class ScannerNumeros {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros quer digitar: ");
        int n = sc.nextInt();

        int [] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite o numero #" + (i +1) + ": ");
            vect [i] = sc.nextInt();
        }

        int soma = 0;
        int menor = vect[0];
        int maior = vect[0];

        for (int i = 0; i < n; i++){
            soma += vect[i];

        if (vect [i] < menor){
            menor = vect[i];
        } if (vect[i] > maior){
            maior = vect[i];
            }
        }

        System.out.println("A soma dos numero: " + soma);
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);


        sc.close();
    }
}
