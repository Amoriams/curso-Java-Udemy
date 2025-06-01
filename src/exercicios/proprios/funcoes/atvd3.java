package exercicios.proprios.funcoes;
import java.util.Scanner;

public class atvd3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double valor;
        double desconto;

        System.out.print("digite o valor: ");
        valor = sc.nextDouble();
        System.out.print("digite quanto quer dar de desconto: ");
        desconto = sc.nextDouble();
        if (valor < 0 || desconto < 0){
            System.out.println("Erro: valor ou desconto inválidos, tente novamente");
        } else {
            double valorFinal = calcularDesconto(valor, desconto);
            System.out.printf("Valor final: %.2f%n", valorFinal);
        }

        sc.close();

    }

    public static double calcularDesconto(double a, double b){
         return a - (a * b) / 100;
    }
}
