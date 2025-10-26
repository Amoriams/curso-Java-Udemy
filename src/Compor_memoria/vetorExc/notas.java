package Compor_memoria.vetorExc;
import java.util.Scanner;

public class notas {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas notas quer cadastrar: ");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite a nota #" + i + ": ");
            vect [i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < n; i++){
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("Médias: %.2f", media);

        sc.close();

    }
}
