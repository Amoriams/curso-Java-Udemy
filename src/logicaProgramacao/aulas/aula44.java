package logicaProgramacao.aulas;

import java.util.Locale;
import java.util.Scanner;

public class aula44 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metro = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metro;

        System.out.printf("area = %.2f%n", area);
        System.out.printf("area = %.2f%n", preco);

        sc.close();
    }
}
