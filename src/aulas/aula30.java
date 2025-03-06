package aulas;
import java.util.Scanner;

public class aula30 {

    public static void main (String[] args) {

        String nome;
        Scanner sc = new Scanner (System.in);

        System.out.println("qual é seu nome? ");
        nome = sc.next();

        if (nome.equals("maria")) {
            System.out.println("muito prazer, " + nome + ", seu nome é lindo");
        }
        else {
            if (nome.equals("joao")){
                System.out.println("legal");
            }
            else {
                System.out.println("nome incorreto");
            }
        }

        sc.close();

    }
}
