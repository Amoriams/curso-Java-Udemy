package logicaProgramacao.aulas;

import java.util.Scanner;

public class aula61 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in); // perfeito, certinho em declarar o Scanner

        /* COMO EU FIZ:

         int number;
        int Mnumber = 0;
        while (cont < 3){
            number = sc.nextInt();
            if (number > Mnumber){
                Mnumber = number;
            }
            cont ++;
        }
        System.out.println("Higher: " + Mnumber);

        como poderia ter feito (como o nelio fez)
        *   System.out.println("enter three numbers");
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        * int c = sc.nextInt();
        *
        * if (a > b && a > c){
        *     System.out.println("higher = " + a);
        * }
        * else if (b > c) {
        *     System.out.println("higher = " + b);
        * }
        * else {
        *    System.out.println("higher = " + c);
        *  }
        *
        * PODEMOS FAZER ASSIM TAMBÉM:
        *
        *
        * int higher = max (a, b, c);
        *
        *
        *
        *
        *
        *
        *
        *  */

        System.out.println("enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close(); // certo tambem
    }

    public static int max(int x, int y, int z) {

        int aux;

        if (x > y && x > z) {
         aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }

    public static void showResult ( int value){
        System.out.println("higher = " + value);

    }


}
