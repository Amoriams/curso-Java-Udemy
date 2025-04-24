package exercicios.proprios;

import java.util.Scanner;

public class atvd14 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("escreva um numero");
        int x = sc.nextInt();
        System.out.println("escreva outro");
        int y = sc.nextInt();

        int s = x + y;
        int sub = x - y;
        int m = x * y;
        int d = x / y;


        System.out.println(" a soma de " + x + " + " + y + " = " + s);
        System.out.println(" a subtração de " + x + " - " + y + " = " + sub);
        System.out.println( " a multiplicação de " + x + " * " + y + " = " + m);
        System.out.println( " a divisão de " + x + " / " + y + " = " + d);

        sc.close();


    }
}
