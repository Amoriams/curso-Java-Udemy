package Compor_memoria.vetorExc;

import java.util.Scanner;

public class altura {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

            System.out.print("Quantas pessoas vão se medir: ");
            int n = sc.nextInt();

            double [] vect = new double [n];

            for (int i = 0; i < n; i++){
                System.out.print("Digite a altura da pessoa #" + i + ": ");
                vect [i] = sc.nextDouble();
            }

            double soma = 0;

            for (int i = 0; i < n; i++){
                soma += vect[i];
            }

            double media = soma / n;

            System.out.printf("A media das alturas é igual a: %.2f", media);



        sc.close();

    }
}
