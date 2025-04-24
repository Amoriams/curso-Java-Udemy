package exercicios.proprios;

import java.util.Scanner;

public class atvd2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int ano = 0;

        System.out.println("escreva um ano: ");
        ano = sc.nextInt();

    if ( ano % 4 == 0 && (ano % 100 != 0 || ano % 400 ==0)){
        System.out.println(" o ano " + ano + " é bissexto");
    }

    else {
        System.out.println("o ano " + ano + " não é bissexto");
    }

    sc.close();

    }
}
