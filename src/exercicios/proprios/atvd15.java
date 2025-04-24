package exercicios.proprios;
import java.util.Scanner;


public class atvd15 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("escreva um número: ");
        int one = sc.nextInt();
        System.out.print("escreva outro: ");
        int two = sc.nextInt();

        int s = one + two;
        int d = (one - two);
        int mult = one * two;
        int divIn = one / two ;
        double divDec = ((double) one / two);
        int rest = one % two;

        System.out.println("soma: " + s);
        System.out.println("diferença: " + d);
        System.out.println("produto: " + mult);
        System.out.println("Divisão inteira: " + divIn);
        System.out.println("Divisão decimal: " + divDec);
        System.out.println("resto: " + rest);

        sc.close();
    }
}
