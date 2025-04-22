package exercicios.exercicio1.proprios;
import java.util.Scanner;

public class teste1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);


        System.out.println("Escreva um numero: ");
        int um = sc.nextInt();
        System.out.println("agora o segundo: ");
        int dois = sc.nextInt();

        int soma = (um + dois);
        int mult = (um * dois);
        int dif = (um - dois);

        System.out.println("a soma dos numeros é igual a: " + soma);
        System.out.println("a multiplicação dos numeros é igual a : " + mult);
        System.out.println("a diferença entre os numeros é igual a: " + dif);

        if (um % 2 == 0 && dois % 2 == 0){
            System.out.println("e ambos são pares");
        } else if (um % 2 == 0 || dois % 2 == 0) {
            System.out.println ("e apenas um é par");
        }
        else {
            System.out.println("e nenhum é par");
        }

    }
}
