package exercicios.funcoes;

import java.util.Scanner;

public class consultaprecoFunc {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);


        double televisao = 1500;
        double celular = 800;
        double fone = 150;

        int quant;


        String respMenu;
        do {
            System.out.println("1 - Television ($1500,00");
            System.out.println("2 - Cell phone ($800,00");
            System.out.println("3 - Headset ($150,00");
            System.out.println("0 - Exit");
            System.out.print ("enter here: ");
            respMenu = sc.nextLine();

            double precoDoProd = 0;
            quant = 0;

            switch (respMenu){
                case "1":
                    System.out.println ("-----------------------------------");
                    precoDoProd = televisao;
                    System.out.print("Enter the quantity: ");
                    quant = sc.nextInt();
                    sc.nextLine();
                    break;

                case "2":
                    System.out.println ("-----------------------------------");
                    precoDoProd = celular;
                    System.out.print("Enter the quantity: ");
                    quant = sc.nextInt();
                    sc.nextLine();

                    break;

                case "3":
                    System.out.println ("-----------------------------------");
                    precoDoProd = fone;
                    System.out.print("Enter the quantity: ");
                    quant = sc.nextInt();
                    sc.nextLine();
                    break;

                case "0":
                    System.out.println("Okay, see you next time");
                    break;

                default:
                    System.out.println("Resposta invalida tente novamente");
                    break;
            }
            if (!respMenu.equals("0") && (respMenu.equals("1") || respMenu.equals("2") || respMenu.equals("3"))) {
                calaculaEExibe(precoDoProd, quant);
            }


        } while (!respMenu.equals ("0"));

        System.out.println("Até a proxima!!");

        sc.close();
    }

    public static void calaculaEExibe(double preDoProd, int quant){

        double subtotal, desconto;

        subtotal = (quant * preDoProd);
        if (quant >= 5 && quant < 10) {
            desconto = subtotal - (subtotal * ((double) 10 / 100));
            System.out.printf("total purchase price = $%.2f%n ", subtotal);
            System.out.printf("total value with discount = $%.2f%n ", desconto);
            System.out.println("----------------------------------------");
        } else if (quant >= 10) {
            desconto = subtotal - (subtotal * ((double) 15 / 100));
            System.out.printf("total purchase price = $%.2f%n ", subtotal);
            System.out.printf("total value with discount = $%.2f%n ", desconto);
            System.out.println("----------------------------------------");
        } else {
            System.out.printf("total purchase price = $%.2f%n ", subtotal);
            System.out.println("----------------------------------------");
        }
    }
}
