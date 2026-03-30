package exercicios.recomeco;
import java.util.Scanner;

public class SomadosNumeros {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int soma = 0;
        int maior = 0;

        System.out.print("Quantos numeros voce vai digitar: ");
        int quantidade = sc.nextInt();

        System.out.println();



        for (int i = 0; i < quantidade; i++){
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            soma += numero ;
            if (numero > maior){
                maior = numero;
            }
        }

        System.out.println();

        System.out.println("SOMA: " + soma);
        System.out.println("Maior numero: " + maior);

        sc.close();

    }
}
