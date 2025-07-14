package exercicios.proprios.miniProjetos;

import java.util.Scanner;

public class CalculadoraDeSalarios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadastro;
        double somaSalariosLiquidos = 0;
        int contadorFuncionarios = 0;



        do {  System.out.print("Você deseja cadastrar os funcionarios? (Sim/Nao): ");
            cadastro = sc.nextLine();

            if (cadastro.equalsIgnoreCase("sim")){
            System.out.println("=========================================== ");
            System.out.print("Funcionario: ");
            String nome = sc.nextLine();


            System.out.print("Salário bruto: R$");
            double SalarioB = sc.nextDouble();


            System.out.print("Desconto (%): ");
            double desconto = sc.nextDouble();


            System.out.print("Bônus (%): ");
            double bonus = sc.nextDouble();


            sc.nextLine();

            double valorDesconto = calcularDesconto(SalarioB, desconto);
            double valorBonus = calcularBonus(SalarioB, bonus);
            double valorLiquido = calcularSalarioLiquido(SalarioB, desconto, bonus);

            somaSalariosLiquidos += valorLiquido;
            contadorFuncionarios++;

            System.out.printf("Funcionário: %s \n", nome);
            System.out.printf("Salário bruto: R$%.2f \n", SalarioB);
            System.out.printf("Desconto (%.0f%%): -R$%.2f\n", desconto, valorDesconto);
            System.out.printf("Bônus (%.0f%%): +R$%.2f\n", bonus, valorBonus);
            System.out.printf("Salário líquido: R$%.2f \n", valorLiquido);


            } else if (cadastro.equalsIgnoreCase("Não") &&  (cadastro.equalsIgnoreCase("nao"))) {
                System.out.println("Okay, até a proxima!!");
                break;
            } else {
                System.out.println("Resposta invalida, tente novamente!");
            }


        } while (!cadastro.equalsIgnoreCase("nao") && (!cadastro.equalsIgnoreCase("não")));

        if (contadorFuncionarios > 0){
            double media = somaSalariosLiquidos / contadorFuncionarios;
            System.out.printf("\nTotal de funcionarios cadastrados: %d\n", contadorFuncionarios);
            System.out.printf("MÉDIA SALARIAL: R$%.2f", media);
        }else {
            System.out.println("nenhum funcionario cadastrado!");
        }
  sc.close();
    }

    public static double calcularDesconto(double salario, double desconto) {
        return salario * desconto / 100;
    }


    public static double calcularBonus(double salario, double bonus) {
        return salario * bonus / 100;
    }

    public static double calcularSalarioLiquido (double salario, double desconto, double bonus){
        double valorDesconto = calcularDesconto(salario, desconto);
        double valorBonus = calcularBonus(salario, bonus);
        return  salario - valorDesconto + valorBonus;
    }
}
