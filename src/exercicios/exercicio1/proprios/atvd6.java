package exercicios.exercicio1.proprios;

import java.util.Scanner;

public class atvd6 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int contador = 1;
        int numero = 0;
        int pares = 0;
        int impares = 0;

        while (contador <= 10){
            System.out.print("Digite o " + contador + "o numero: ");
            numero = sc.nextInt();
            contador++;


        if (numero % 2 == 0){
            pares += 1;
        }
        else {
            impares += 1;
        }

        }
        System.out.println("quantidade de numeros pares: " + pares);
        System.out.println("quantidade de numeros impares: " + impares);
    }
}
