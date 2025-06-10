package exercicios.proprios.funcoes;
import java.util.Scanner;

public class atvd8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double nota1, nota2;

        System.out.print("Digite o nome do primeiro estudante: ");
        nome1 = sc.nextLine();
        System.out.print("otimo " + nome1 + " agora sua nota: ");
        nota1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("perfeito, agora vamos para o proximo!");
        System.out.print("Digite o nome do segundo estudante: ");
        nome2 = sc.nextLine();
        System.out.print("otimo " + nome2 + " agora sua nota: ");
        nota2 = sc.nextDouble();
        sc.nextLine();

       compararNotas(nota1, nome1, nota2, nome2);


        sc.close();
    }

    public static void compararNotas(double a, String n1, double b, String n2){


        if (a >= 7 && b >= 7){
            System.out.println("Ambos foram bem!");
        } else if (a < 7 && b < 7) {
            System.out.println("Ninguem atingiu a media!");
        }
        else if (a >= 7 && b < 7) {
            System.out.println("Apenas " + n1 + " foi bem");
        }
        else if (a < 7 && b >= 7) {
            System.out.println("Apenas " + n2 + " foi bem");
        }

    }
}