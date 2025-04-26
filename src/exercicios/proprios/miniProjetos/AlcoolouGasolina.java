package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class AlcoolouGasolina {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double gasolina;
        double alcool;

        System.out.print("Digite o preço do álcool: ");
        alcool = sc.nextDouble();
        System.out.print("Digite o preço da gasolina: ");
        gasolina = sc.nextDouble();


        if ((alcool / gasolina) <= 0.7){
            System.out.println("Recomendação: melhor abastecer com álcool.");
        }
        else{
            System.out.println("Recomendação: Melhor abastecer com gasolina.");
        }

        sc.close();
    }
}
