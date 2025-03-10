package exercicios.exercicio1.proprios;

import java.util.Scanner;

public class atvd4 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        int contador = 1;
        int n;
        int pos = 0;
        int neg = 0;

        System.out.println("digite 10 numeros");

        while (contador <= 10) {
            System.out.print("digite o " + contador + "o numero: ");
            n = sc.nextInt();
            contador += 1;

            if (n > 0){
                pos += 1;
            }
            else if (n < 0) {
                neg += 1;
            }
        }
        System.out.println("quantidade de numeros positivos: " + pos);
        System.out.println("quantidade de numeros negativos: " + neg);
    }
}

