package application;

import entities.ProductN;

import java.util.Scanner;

public class ProductStock {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        ProductN product = new ProductN();
        System.out.println("Enter product data");
        System.out.print("name: ");
        product.name = sc.nextLine();
        System.out.print("price: ");
        product.price = sc.nextDouble();
        System.out.print("quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        







        sc.close();

    }
}
