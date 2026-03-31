package exercicios.recomeco;
import java.util.Scanner;

public class ControleNotas {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int vezes;
        double nota;
        double maior = 0;
        double media = 0;

        System.out.print("Quantas notas voce vai digitar: ");
        vezes = sc.nextInt();

        for (int i=0; i < vezes; i++){
            System.out.print( i+1 + " NOTA: ");
            nota = sc.nextDouble();
            if (nota > maior){
                maior = nota;
            }
             media += nota;

        }

        media = media / vezes;

        System.out.printf("MEDIA: %.2f%n" , media);
        System.out.println("MAIOR NOTA: " + maior);

        sc.close();

    }
}
