package aulas;
import java.util.Locale;
import java.util.Scanner;

public class aula38 {
    public static void main (String [] args){

        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner(System.in);
        int qua;
        double val = 50.00;

        System.out.println("qual a quantidade de minutos");
        qua = sc.nextInt();

        double valP = 0;
        if (qua <= 100){
            valP = 50.00;
        }
        else {
            valP = valP + val + (qua - 100) * 2;
        }
        System.out.printf("valor a pagar: R$ %.2f%n", valP);

        sc.close();

    }
}

//fiz do meu jeito e de como eu achei que seria.
