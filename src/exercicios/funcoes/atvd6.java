package exercicios.funcoes;
import java.util.Scanner;

public class atvd6 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String filme1, filme2, filme3;
        double nota1, nota2, nota3;

            System.out.print("Digite o nomde do 1° filme: ");
            filme1 = sc.nextLine();
            System.out.print("Digite a nota: ");
            nota1 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite o nomde do 2° filme: ");
            filme2 = sc.nextLine();
            System.out.print("Digite a nota: ");
            nota2 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite o nomde do 3° filme: ");
            filme3 = sc.nextLine();
            System.out.print("Digite a nota: ");
            nota3 = sc.nextDouble();
            sc.nextLine();


        double media = media (nota1, nota2, nota3);
        System.out.println("Média das notas: " + media);
        String melhor = melhorFilme(filme1, nota1, filme2, nota2, filme3, nota3);
        System.out.println("Melhor filme: " + melhor);

        sc.close();

    }

    public static double media(double a, double b, double c){

         return (a + b + c) / 3;
    }

    public static String melhorFilme(String f1, double n1, String f2, double n2, String f3, double n3){
       String melhorFilme = f1;
       double melhornota = n1;

       if (n2 > melhornota) {
           melhorFilme = f2;
           melhornota = n2;
       }

        if (n3 > melhornota){
            melhorFilme = f3;
            melhornota = n3;
        }
        return melhorFilme;

    }

}
