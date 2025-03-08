package exercicios.exercicio1.exercicio3;
import java.util.Locale;
import java.util.Scanner;

public class exer8 {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();

        double taxa = 0;

        if (sal <= 2000.0) {
            taxa = 0.00;
        }

        else if (sal <= 3000.0) {
            taxa = (sal - 2000.0) * 0.08;
        }

        else if (sal <= 4500.0){
            taxa = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
        }

        else {
            taxa = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.8;
        }

        if (taxa == 0.00){
            System.out.printf("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", taxa);
        }

        sc.close();
    }
}

// esse eu não entrendi muito bem, mas acredito que tenha sido mais pela matematica.
