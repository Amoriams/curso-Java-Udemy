package exercicios.exercicio1.proprios;
import java.util.Scanner;


public class atvd19 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Qual sua idade? ");
        int idade = sc.nextInt();
        sc.nextLine();

        if (idade <=15) {
            System.out.println("Esta acompanhado dos pais? ");
            String pais = sc.nextLine();
            if (pais.equalsIgnoreCase("Sim")){
                System.out.println("Entrada permitida");
            }
            else if (pais.equalsIgnoreCase("Não")) {
                System.out.println("Entrada negada");
            }
        }
        else {
            System.out.println("Entrada permitida");
        }
        sc.close();


    }
}
