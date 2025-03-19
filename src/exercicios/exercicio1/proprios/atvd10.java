package exercicios.exercicio1.proprios;

import java.util.Scanner;

public class atvd10 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("quantas vezes que repetir? ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++){
            soma += i ;
        }
        System.out.print(soma);
        sc.close();


    }
}
