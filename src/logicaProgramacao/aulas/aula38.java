package logicaProgramacao.aulas;
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

        if (qua > 100){
             val += (qua - 100) * 2;
        }
        System.out.printf("valor a pagar: R$ %.2f%n", val);

        sc.close();

    }
}

//fiz do meu jeito e de como eu achei que seria.
