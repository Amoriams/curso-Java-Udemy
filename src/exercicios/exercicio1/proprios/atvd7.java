package exercicios.exercicio1.proprios;

import java.util.Scanner;

public class atvd7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print ("escreva seu nome: ");
        String name = sc.nextLine();
        System.out.print("agora sua idade: ");
        int id = sc.nextInt();

        System.out.print("muito prazer " + name + " sua idade é " + id + " anos.");

        sc.close();
    }
}
