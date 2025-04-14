package exercicios.exercicio1.proprios;

import java.util.Scanner;

public class atvd12 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva um numero de 1 a 10");
        int numero = sc.nextInt();

        System.out.println("Tabuada do numero " + numero + ":");
        for (int i = 0; i <= 10; i++){
            int tab = numero * i;
            System.out.println(numero + "x" + i + "= " + tab);
        }
    }
}
