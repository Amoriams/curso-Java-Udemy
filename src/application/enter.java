package application;

import entities.Register;

import java.util.Scanner;

public class enter {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Register pessoa1 = new Register();

        System.out.print("Enter your name: ");
        pessoa1.name = sc.nextLine();
        System.out.print("Enter your age: ");
        pessoa1.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your profession: ");
        pessoa1.profession = sc.nextLine();

        String mensagem = pessoa1.presentation();
        System.out.println(mensagem);



    }
}
