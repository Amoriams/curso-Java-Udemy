package exercicios.proprios;

import java.util.Scanner;

public class atvd5 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        double med;
        double soma = 0;
        int n = 1;
        int contador = 0;

        while (n != 0){
            System.out.print("digite um numero: ");
            n = sc.nextInt();

            if (n != 0){
                soma += n;
               contador++;
            }
        }

        if (contador > 0){
            med = soma / contador;
            System.out.println("a media dos numeros é: " + med);
        }
        else {
            System.out.print("nenhum nuemero positivo foi digitado. Não é possivel calcular a media.");
        }




    }
}
