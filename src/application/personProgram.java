package application;

import entities.person;

import java.util.Scanner;

public class personProgram {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);

        person a;
        a = new person();

        System.out.println("Hello, type your name: ");
        a.a = sc.nextLine();

        String accomplishment = a.name();
        System.out.println(accomplishment);

    }
}
