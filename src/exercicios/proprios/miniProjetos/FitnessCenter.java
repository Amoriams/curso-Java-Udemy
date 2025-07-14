package exercicios.proprios.miniProjetos;

import java.util.Scanner;

public class FitnessCenter {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print ("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print ("Digite seu peso (Kg): ");
        double peso = sc.nextDouble();

        System.out.print ("digite sua altura (m): ");
        double altura = sc.nextDouble();

        System.out.print("Digite sua data de nascimento: ");
        int anoNascimento = sc.nextInt();


        double imc = calcularIMC(peso, altura);
        int idade = calcularIdade(anoNascimento);
        String classificacao = classificarIMC(imc);

        gerarRelatorio(nome, idade, imc, classificacao);


        sc.close();
    }

    public static double calcularIMC( double peso, double altura){
        return peso / (altura * altura) ;
    }

    public static int calcularIdade ( int anoNascimento){
        int anoAtual = java.time.LocalDate.now().getYear();
        return anoAtual - anoNascimento;
    }

    public static String classificarIMC (double imc){

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void gerarRelatorio( String nome, int idade, double imc, String classificacao){
        System.out.println("===== RELATÓRIO DE SAÚDE =====");
        System.out.println ("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
        System.out.println("================================");

    }
}
