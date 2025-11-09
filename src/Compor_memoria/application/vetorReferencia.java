package Compor_memoria.application;

import java.util.Scanner;

import Compor_memoria.entities.product;

public class vetorReferencia {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        product[] vect = new product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new product(name, price);

        }
        double soma = 0;

        for (product product : vect) {
            soma += product.getPrice();
        }

        double avg = soma / vect.length;

        System.out.println("MEDIA: " + avg);




    sc.close();
    }
}
