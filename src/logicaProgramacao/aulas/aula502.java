package logicaProgramacao.aulas;
import java.util.Scanner;

public class aula502 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int n, x;
        int soma = 0;

        System.out.print("Quantas vezes deseja repetir? ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Digite o numero: ");
            x = sc.nextInt();
            soma += x;
        }

        System.out.print("a soma de todos os valores é igual a: " + soma);

    }
}
