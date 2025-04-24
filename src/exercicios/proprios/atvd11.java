package exercicios.proprios;

import java.util.Scanner;

public class atvd11 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int menor, maior;

        int n = sc.nextInt();
        maior = menor = n;

        for (int i = 0; i <= n; i++){
            int x = sc.nextInt();
            if (x > maior){
                maior = x;
            }
            if (x < menor){
                menor = x;
            }


        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
    }
}
