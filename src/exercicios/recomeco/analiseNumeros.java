package exercicios.recomeco;

import java.util.Scanner;

public class analiseNumeros {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int soma =0;
        double media;
        int maior = 0;
        int menor = 0;
        int pares = 0;
        int impares =0;



        System.out.print("Quantos numeros voce vai digitar? ");
        int vezes = sc.nextInt();


        for (int i = 0; i < vezes; i ++){
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            soma += numero;

            if (i == 0) {
                maior = numero;
            } if (numero > maior){
                maior = numero;
            } if (i == 0){
                menor = numero;
            } if (numero < menor){
                menor = numero;
            }if (numero % 2 == 0){
                pares++;
            } else {
                impares++;
            }


        }

        media = (double) soma / vezes;

        System.out.println("RESULTADOS:");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);



        sc.close();

    }
}
