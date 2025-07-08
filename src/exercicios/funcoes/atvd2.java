package exercicios.funcoes;
import java.util.Scanner;

public class atvd2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        System.out.println("digite as tres notas: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

       double media = calcularMedia(a, b, c);
        verificarSituacao(media);
       double maior = maiorNota(a, b, c);

        sc.close();
    }

    public static double calcularMedia(double a, double b, double c){
        double media;
        media = (a + b + c) / 3;
        System.out.printf("Média: %.2f%n", media);
        return media;
    }

    public static void verificarSituacao (double media){
        if (media >= 6){
            System.out.println("Situação: aprovado");
        } else {
            System.out.println("Situação: reprovado");
        }

    }

    public static double maiorNota (double a, double b, double c){
        double maior = a;
         if (b > maior ) {
             maior = b;
        }if (c > maior) {
             maior = c;
        }
         System.out.println("maior nota: " + maior);

        return maior;
    }

}
