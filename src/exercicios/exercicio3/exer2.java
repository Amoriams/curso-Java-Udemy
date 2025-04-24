package exercicios.exercicio3;
import java.util.Scanner;

public class exer2 {
    public static void main (String[] args){

        int x;
        Scanner sc = new Scanner (System.in);

        System.out.println("escreva um numero");
        x = sc.nextInt();

        if (x % 2 == 0 ){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

    }
}
