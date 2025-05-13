package exercicios.exercicio5;
import java.util.Scanner;

public class exercicio7 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            int pri = i;
            int quad = (i * i);
            int cub = (i * i * i);

            System.out.printf("%d %d %d%n", pri, quad, cub);

        }

    }
}
