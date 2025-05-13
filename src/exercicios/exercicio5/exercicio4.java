package exercicios.exercicio5;
import java.util.Scanner;

public class exercicio4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int n;

        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            double div = (a/b);

            if (b == 0){
                System.out.println("divisão impossivel");
            } else {
                System.out.printf("%.1f\n",div);

            }
        }
        sc.close();

    }
}
