package exercicios.proprios;

import java.util.Scanner;

public class atvd21 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        for (int i = 0; i <=10; i++){
            int mult = (n * i);
            System.out.printf("%d X %2d = %d%n", n, i, mult);
        }
        sc.close();
    }
}
