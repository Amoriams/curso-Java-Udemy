package exercicios.exercicio1.exercicio3;

import java.util.Scanner;

public class exer3 {

    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Fale um numero");
        a = sc.nextInt();

        System.out.println("Fale outro");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0 ) {
            System.out.println("sao multiplos");
        } else {
            System.out.println("nao sao multiplos");
        }

    }
}
