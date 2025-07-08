package exercicios.funcoes;
import java.util.Scanner;

public class atvd1 {
    public static void main (String [] args){

        double a;
        double b;
        Scanner sc = new Scanner (System.in);

        System.out.println("Vamos somar 2 numero!");
        System.out.print("Digite o primeiro: ");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o segundo: ");
        b = sc.nextDouble();
        sc.nextLine();

        double resultado = somar(a, b);

        System.out.println("a soma dos numeros " + a + " + " + b + " = " + resultado);

        sc.close();

    }

    public static double somar(double a, double b){
        return a +b;
    }


}
