package exercicios.exercicio5;
import java.util.Scanner;

public class exercicio1 {
    public static void main (String [] args){

        Scanner sc = new Scanner ( System.in);
        int n;

        System.out.print("quantas vezes deseja repetir: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();

    }
}
