package exercicios.funcoes;

import java.util.Scanner;

public class namelist {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String resp;

        nameList();

            System.out.print("Is your name on the list? (yes or no): ");
            resp = sc.nextLine();

            if (resp.equalsIgnoreCase("yes")){
                System.out.println("Okay, thank you! see you next time!");
            }
             else if (resp.equalsIgnoreCase("no")){
                System.out.println("Okay, let's put your name on that list!");
                System.out.print("Tell me your name: ");
                String name = sc.nextLine();
                System.out.println("Perfect! Name added.");
                nameAdded(name);
            } else {
                 System.out.println("Invalid Response! Please type 'yes' or 'no'.");
            }


        sc.close();
    }
    public static void nameList(){

        System.out.println("--------------------------------------");
        System.out.println("----- NAME LIST -----");
        System.out.println("1 - Maria");
        System.out.println("2 - julia");
        System.out.println("3 - Carla");
        System.out.println("4 - Ana");
    }

    public static void nameAdded(String N){

        System.out.println("--------------------------------------");
        System.out.println("----- UPDATED LIST -----");
        System.out.println("1 - Maria");
        System.out.println("2 - julia");
        System.out.println("3 - Carla");
        System.out.println("4 - Ana");
        System.out.println("5 - " + N);

    }

}
