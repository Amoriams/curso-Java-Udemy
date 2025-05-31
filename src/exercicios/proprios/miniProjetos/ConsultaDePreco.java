package exercicios.proprios.miniProjetos;

import java.util.Scanner;

public class ConsultaDePreco {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);


        double televisao = 1500;
        double celular = 800;
        double fone = 150;
        double subtotal, desconto;
        int respQuant;


        String respMenu;
        do {
            System.out.println("1 - Television ($1500,00");
            System.out.println("2 - Cell phone ($800,00");
            System.out.println("3 - Headset ($150,00");
            System.out.println("0 - Exit");
            System.out.print ("enter here: ");
            respMenu = sc.nextLine();

            double precoAtual = 0;
            respQuant = 0;

            switch (respMenu){
                case "1":
                    System.out.println ("-----------------------------------");
                    precoAtual = televisao;
                    System.out.print("Enter the quantity: ");
                    respQuant = sc.nextInt();
                    sc.nextLine();
                     break;

                case "2":
                    System.out.println ("-----------------------------------");
                    precoAtual = celular;
                    System.out.print("Enter the quantity: ");
                    respQuant = sc.nextInt();
                    sc.nextLine();

                    break;

                case "3":
                    System.out.println ("-----------------------------------");
                    precoAtual = fone;
                    System.out.print("Enter the quantity: ");
                    respQuant = sc.nextInt();
                    sc.nextLine();


                case "0":
                    System.out.println("Okay, see you next time");

                    break;

                default:
                    System.out.println("Resposta invalida tente novamente");
                    break;
            }

            if ( !respMenu.equals("0") && respQuant > 0) {

                subtotal = (respQuant * precoAtual);
                if (respQuant >= 5 && respQuant < 10) {
                    desconto = subtotal - (subtotal * ((double) 10 / 100));
                    System.out.printf("total purchase price = $%.2f%n ", subtotal);
                    System.out.printf("total value with discount = $%.2f%n ", desconto);
                    System.out.println("----------------------------------------");
                } else if (respQuant >= 10) {
                    desconto = subtotal - (subtotal * ((double) 15 / 100));
                    System.out.printf("total purchase price = $%.2f%n ", subtotal);
                    System.out.printf("total value with discount = $%.2f%n ", desconto);
                    System.out.println("----------------------------------------");
                } else {
                    System.out.printf("total purchase price = $%.2f%n ", subtotal);
                    System.out.println("----------------------------------------");
                }
            }

        } while (!respMenu.equals ("0"));

        System.out.println("Até a proxima!!");

        sc.close();
    }
}
