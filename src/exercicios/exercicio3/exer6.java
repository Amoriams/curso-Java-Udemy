package exercicios.exercicio3;
import java.util.Locale;

import java.util.Scanner;

public class exer6 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.00) {
            System.out.println("fora do intervalo");
        } 
        else if (numero <= 25.00) {
            System.out.println("intervalo (0,25)");
        } 
        else if (numero <= 50.00) {
            System.out.println("intervalo (25,50)");
        }
        else if (numero <= 75.00) {
            System.out.println("intervalo (50,75)");
        }
        else {
            System.out.println("intervalo (75,100)");
        }
    }
}

//foi tranquilo, mas usei bastante o codigo do prof pra fazer o meu.
