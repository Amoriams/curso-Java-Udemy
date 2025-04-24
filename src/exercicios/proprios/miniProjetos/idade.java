package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class idade {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        int idade;
        int soma = 0;
        int pessoas = 0;
        int maiores = 0;

        while (true){
            System.out.println("qual sua idade? ");
            idade = sc.nextInt();

            if (idade > 18){
                maiores++;
            }

        if (idade <= 0){
            break;
        }
        soma += idade;
        pessoas++;
    }
        System.out.println("a soma das idades são: " + soma);
        System.out.println("o total de pessoas que colocaram sua idade foi: " + pessoas);
        if ( pessoas > 0){
            double media = (double) soma / pessoas;
            System.out.println("a media de idade é igual a :" + media);
        }
        else {
            System.out.println("Nenhuma idade válida foi inserida.");
        }
        System.out.println("pesoas maiores de 18: " + maiores);
    }
}
