package exercicios.exercicio1.proprios;

import java.util.Scanner;

public class atvd8 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("me diga um numero: ");
        int n = sc.nextInt();

        System.out.print("me fale outro: ");
        int m = sc.nextInt();

        int soma = n + m;
        int sub = n - m;
        int mult = n * m;
        int div = n / m;
        int resto = n % m;

        System.out.println("a soma é: " + soma);
        System.out.println("a subtração é: " + sub);
        System.out.println("a multiplicação é: " + mult);
        System.out.println("a divisão é: " + div);
        System.out.println("o resto é: " + resto);

        sc.close();
    }
}
