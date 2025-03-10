package exercicios.exercicio1.proprios;

import java.util.Scanner;

public class atvd3 {
    public static void main (String [] args ){

        Scanner sc = new Scanner (System.in);
        int contador = 1;
        int n;
        int ma = 0;
        int me = 0;

        System.out.println("digite 10 numeros");

        while (contador < 10) {
            System.out.print("digite o " + contador + "o numero: ");
            n = sc.nextInt();
            contador += 1;

            if (n >= ma){
                ma = n;
            }
            else if (n <= me) {
                me = n;
            }
        }
        System.out.println("o maior numero é: " + ma);
        System.out.println("o menor numero é: " + me);
    }
}
