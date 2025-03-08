package exercicios.exercicio1.exercicio3;

import java.util.Scanner;

public class exer5 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qua = sc.nextInt();

        double total;

        if (cod == 1){
            total = qua * 4.00;
        }
        else if (cod == 2) {
            total = qua * 4.5;
        }
        else if (cod == 3) {
            total = qua * 5.00;
        }
        else if (cod == 4) {
            total = qua * 2.00;
        }
        else {
            total = qua * 1.50;
        }

        System.out.printf("TOTAL: R$%.2f%n", total);

        sc.close();
    }
}

// deu um erro gigante e logo depois voltou a funcionar, não sei o que rolou.