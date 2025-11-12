package Compor_memoria.vetorExc;
import Compor_memoria.entities.Ex_SalaDev;

import java.util.Scanner;

public class Ex_SalaDevChat {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);


        Ex_SalaDev[] sala = new Ex_SalaDev[10];

        System.out.print("Quantos desenvolvedores querem alugar a sala: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++){
            System.out.println("\nSALA #" + (i+1) + ":");
            System.out.print("NOME: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("EMAIL: ");
            String email = sc.nextLine();

            System.out.print("SALA: ");
            int salaNumero = sc.nextInt();

            while (sala[salaNumero] != null){
                System.out.println("SALA OCUPADA, ESCOLHA OUTRA");
                salaNumero = sc.nextInt();
            }

            sala[salaNumero] = new Ex_SalaDev(nome, email);
        }


        System.out.println("\nSALAS OCUPADAS: ");

        for (int i = 0; i < 10; i++){
            if (sala[i] != null){
                System.out.println( i + ": " +  sala[i]);
            }
        }

        sc.close();
    }
}
