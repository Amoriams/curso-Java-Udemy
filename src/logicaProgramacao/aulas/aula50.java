package logicaProgramacao.aulas;

import java.util.Scanner;

public class aula50 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in); // ler os números

        int n = sc.nextInt(); //variavel para a quantidade de vezes

        int soma = 0; // variave. pera somar os numeros inteiros que vai ser lido e somar entre eles

        for (int i = 0; i < n; i++){ // variavel i para igualar o numero colocado no n (se n for maior que i (que é 0)
            // ele vai repetir ate chegar na quatidade colocada no n),// por isso o (i++), para 0 chegar ate n

            int x = sc.nextInt(); // colocar os N numeros que clocamos no n

            soma += x; // somar todos os numeros colocados entre eles

        }
        System.out.println(soma); // quando a quantidade N for atingida, retornara o valo da soma entre os numeros e mostrara na tela


        sc.close(); //nao esquecer de colocar esse close para que não der erro no Scanner.
    }


}
