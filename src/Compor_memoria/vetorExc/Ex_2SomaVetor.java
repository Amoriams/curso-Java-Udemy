package Compor_memoria.vetorExc;
import java.util.Scanner;

public class Ex_2SomaVetor {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros vai digitat: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0;

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero; ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double media = soma / n;

        System.out.print("VALORES = ");
        for (int i=0; i< n; i++) {
            System.out.printf(" %.1f ||", vect[i]);
        }
        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);



        sc.close();
    }
}
