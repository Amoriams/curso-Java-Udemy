package Compor_memoria.vetorExc;

import Compor_memoria.entities.aluguel;

import java.util.Scanner;

public class Ex_PensionadoFixacao {

    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);

       aluguel[] quartos = new aluguel[10];


        System.out.print("Quantos quartos vao ser alugados: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluguel #" + (i + 1) + ":");

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int quartoNumero = sc.nextInt();

            quartos[quartoNumero] = new aluguel(name, email);
        }

            System.out.println("\nQuartos ocupados: ");

            for (int i = 0; i < 10; i++) {
                if (quartos[i] != null) {
                    System.out.println(i + ": " + quartos[i]);
                }

            }

        sc.close();

    }
}
