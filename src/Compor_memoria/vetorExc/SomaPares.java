package Compor_memoria.vetorExc;
import java.util.Scanner;

public class SomaPares {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros vai digitar: ");
        int n = sc.nextInt();

        int [] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Numero #" + (i + 1) + ": ");
            vect[i] = sc.nextInt();
        }

        int soma = 0;

        System.out.println("Numeros pares :");
        for (int i = 0; i < n; i++){
            if (vect[i] % 2 == 0){
                System.out.println(vect[i]);
                    soma += vect[i];
            }
        }


        System.out.println("Soma dos pares: " + soma);


        sc.close();
    }
}
