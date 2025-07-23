package application;

import entities.ProductN;

import java.util.Scanner;

public class ProductStock {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("price: ");
        double price = sc.nextDouble();

        ProductN product = new ProductN(name, price);

        product.setName("computer");
        System.out.println("updated name: " + product.getName());

        product.setPrice(1200.0);
        System.out.println("updated price: " + product.getPrice());

        System.out.println();
        System.out.println("product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product);


        sc.close();

    }
}
