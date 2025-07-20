package exercicios.proprios;

import java.util.Scanner;

public class RaioProblem {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double raio;
        double pi = 3.14;


        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        double circunferencia = 2 * pi * raio;
        System.out.printf("Circunferencia: %.2f\n", circunferencia);

        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.println("Valor de PI: " + pi);

        
    }
}
