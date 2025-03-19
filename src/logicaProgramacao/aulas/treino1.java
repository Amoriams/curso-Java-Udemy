package logicaProgramacao.aulas;
import java.util.Scanner;

public class treino1 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("quantas vezes quer repetir? ");
        int n = sc.nextInt();

        System.out.println("otimo, será repetido " + n + " vezes");
        int soma = 0;

        for (int i = 0; i<n; i++){
            System.out.print(i + "- ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("a soma final é: " + soma);

        sc.close();
    }
}
