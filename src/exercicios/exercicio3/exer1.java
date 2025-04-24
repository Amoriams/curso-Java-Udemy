package exercicios.exercicio3;
import java.util.Scanner;

public class exer1 {

    public static void main (String[] args){


        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println ("digite um numero");
        x = sc.nextInt();

        if (x >= 0){
            System.out.println("VALOR POSITIVO");
        }

        else {
            System.out.println("VALOR NEGATIVO");
        }

        sc.close();

    }
}
