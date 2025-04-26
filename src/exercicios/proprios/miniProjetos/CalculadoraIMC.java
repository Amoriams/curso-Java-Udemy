package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        double altura, peso, imc;
        String opcao;

        do {
            System.out.println("====== Meu IMC ======");
            System.out.println("[1] Calcular IMC");
            System.out.println("[2] Saber o que é IMC");
            System.out.println("[3] Sair");
            System.out.print("Escolher uma opção: ");
            opcao = sc.nextLine();
            System.out.println("---------------------------------");

            switch (opcao){
                case "1":
                    System.out.print("Digite seu peso (em kg): ");
                    peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite sua altura (em metros): ");
                    altura = sc.nextDouble();
                    sc.nextLine();
                    imc = peso / (altura * altura);
                        if ( imc < 18.5){
                            System.out.printf("IMC %.2f\n -> Abaixo do peso \n", imc);
                            System.out.println("---------------------------------");
                        } else if (imc >= 18.5 && imc <= 24.9) {
                            System.out.printf("IMC %.2f\n -> Peso normal\n", imc);
                            System.out.println("---------------------------------");
                        } else if (imc >= 25 && imc <= 29.9) {
                            System.out.printf("IMC %.2f\n -> Sobrepeso\n", imc);
                            System.out.println("---------------------------------");
                        } else {
                            System.out.printf("IMC %.2f\n -> Obesidade\n", imc);
                            System.out.println("---------------------------------");
                        }
                        break;

                case "2":
                    System.out.println("Ótima questão!");
                    System.out.println("IMC é o Índice de Massa Corporal");
                    System.out.println("usado para avaliar se uma pessoa está no peso ideal.\n");
                    System.out.println("---------------------------------");
                    break;

                case "3":
                    System.out.println("Encerrando programa...\n");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
                    System.out.println("---------------------------------");
                    break;
            }

        }while(!opcao.equals("3"));

        sc.close();
    }
}
