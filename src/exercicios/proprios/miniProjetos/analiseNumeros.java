package exercicios.proprios.miniProjetos;

import java.util.Scanner;

public class analiseNumeros {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("---------------------------------------");
            System.out.printf("digite o %dº numero: ", i);
            int num = sc.nextInt();
            System.out.println("Numero " + num);
            if (num % 3 ==0){
                System.out.println("Multiplo de 3? Sim");
            }else{
                System.out.println("Multiplo de 3? Não");
            }
            int fato =1;
            for (int j=1; j <=num; j++){
                fato =  fato * j;
            }
            System.out.println("fatorial: " + fato);

        }
        sc.close();
    }
}
