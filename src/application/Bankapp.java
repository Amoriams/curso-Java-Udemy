package application;

import entities.Account;

import java.util.Scanner;

public class Bankapp {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        Account person1 = new Account();

        System.out.print("Enter account owner's name: ");
        person1.owner = sc.nextLine();
        System.out.print("Enter current balance: ");
        person1.balance = sc.nextInt();

        String message = person1.message();
        System.out.println(message);

    }
}
