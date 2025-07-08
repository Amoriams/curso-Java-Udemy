package exercicios.funcoes;
import java.util.Scanner;

public class atvd5 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double peso, altura;

        System.out.print("digite seu peso (kg): ");
        peso = sc.nextDouble();
        System.out.print("digite sua altura (metros): ");
        altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0){
            System.out.println("ERRO: informação inválida, tente novamente!");
        }else {
            calcularIMC(peso, altura);
        }

        sc.close();
    }
    public static void calcularIMC (double peso, double altura){
        double imc = peso / (altura * altura);
        if (imc < 18.5){
            System.out.printf("seu imc é: %.2f%n", imc);
            System.out.println("Classificação: abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("seu imc é: %.2f%n", imc);
            System.out.println("Classificação: peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("seu imc é: %.2f%n", imc);
            System.out.println("Classificação: sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.printf("seu imc é: %.2f%n", imc);
            System.out.println("Classificação: obesidade grau 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.printf("seu imc é: %.2f%n", imc);
            System.out.println("Classificação: obesidade grau 2");
        } else {
            System.out.printf("seu imc é: %.2f%n", imc);
            System.out.println("Classificação: obesidade grau 3");
        }
    }
}
