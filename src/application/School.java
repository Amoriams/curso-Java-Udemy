package application;

import entities.Student;

import java.util.Scanner;

public class School {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Student person1 = new Student();

        System.out.print("Enter the student's name: ");
        person1.name = sc.nextLine();
        System.out.print("Enter the first grade: ");
        person1.note1 = sc.nextInt();
        System.out.print("Enter the second grade: ");
        person1.note2 = sc.nextInt();

        String results = person1.finalResults();
        System.out.println(results);
    }
}
