package exercicios.proprios;
import java.util.Scanner;

public class atvd23 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int a, b;

        System.out.println("enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        int higher = max(a,b);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y) {
        int aux;
        if (x > y){
            aux = x;
        }
        else{
            aux = y;
        }
        return aux;
    }

    public static void showResult (int value){
        System.out.println("higher = " + value);
    }


}
