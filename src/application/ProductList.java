package application;

import entities.Product;

import java.util.Scanner;

public class ProductList {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        Product pro1 = new Product();

        System.out.print("Enter the product name: ");
        pro1.name = sc.nextLine();
        System.out.print("Enter the original price: ");
        pro1.price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        pro1.discountPercentage = sc.nextDouble();


        String message = pro1.description();
        System.out.println(message);

 sc.close();
    }
}
