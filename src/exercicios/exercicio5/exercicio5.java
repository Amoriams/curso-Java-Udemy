package exercicios.exercicio5;
import java.util.Scanner;

public class exercicio5 {
    public static void main (String [] arg) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fato = 1;

        for (int i = 1; i <= n; i++){
            fato = fato * i;
        }

        System.out.println(fato);
        sc.close();
    }


}
