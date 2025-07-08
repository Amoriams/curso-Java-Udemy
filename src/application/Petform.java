package application;

import entities.Pet;

import java.util.Scanner;

public class Petform {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        Pet pet1 = new Pet();

        System.out.print("Enter your pet's name: ");
        pet1.name = sc.nextLine();
        System.out.print("Enter the type of pet: ");
        pet1.type = sc.nextLine();
        System.out.print("Enter the age: ");
        pet1.age = sc.nextInt();

        String message = pet1.presentation();
        System.out.println(message);

        sc.close();
    }


}
