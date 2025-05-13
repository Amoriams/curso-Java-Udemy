package exercicios.proprios;

import java.util.Scanner;

public class atvd22 {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int prim = i;
            int qua = (n * i);
            System.out.printf("%d %d%n", prim, qua);
        }
        sc.close();

    }
}
