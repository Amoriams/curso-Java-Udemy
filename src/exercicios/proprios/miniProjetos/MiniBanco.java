package exercicios.proprios.miniProjetos;

import java.util.Scanner;

public class MiniBanco {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String inicio, answer;


        do {
            System.out.println("\n========== Mini Banco BugBuster ==========");

            System.out.print("Deseja iniciar o atendimento? (sim/nao): ");
            inicio = sc.nextLine();


            if (inicio.equalsIgnoreCase("sim")){

            System.out.print("Cliente: ");
            String nome = sc.nextLine();


            System.out.print("Saldo inicial: ");
            double saldoInicial = sc.nextDouble();
            sc.nextLine();

                System.out.println("==========================================");
                System.out.println("Otimo! digite a opção que deseja: ");
                System.out.println("1 - deposito");
                System.out.println("2 - saque");
                System.out.println("0 - sair");
                System.out.println("===========================================");
                answer = sc.nextLine();

                switch (answer){

                    case "1":
                        System.out.print("Qual o valor que deseja depositar: ");
                        double deposito = sc.nextDouble();
                        saldoInicial = depositar(saldoInicial, deposito);
                        System.out.println("Depósito efetuado com sucesso!");

                        System.out.println("======= RESUMO DA OPERAÇÃO =======");
                        System.out.printf("Cliente: %s\n", nome);
                        System.out.printf("Saldo final: R$%.2f\n", saldoInicial);
                        System.out.println("===================================");

                        break;
                    case "2":
                        System.out.print("Qual o valor que deseja sacar: ");
                        double saque = sc.nextDouble();
                        if (saque > saldoInicial){
                            System.out.println("Saldo insuficiente. Tente novamente!");
                        } else {
                            System.out.println("Saque efetuado com sucesso!");
                            saldoInicial = sacar(saldoInicial,saque);

                            System.out.println("======= RESUMO DA OPERAÇÃO =======");
                            System.out.printf("Cliente: %s\n", nome);
                            System.out.printf("Saldo final: R$%.2f\n", saldoInicial);
                            System.out.println("===================================");
                        }
                        break;

                    case "0":
                        System.out.println("Okay");
                        break;

                    default:
                        System.out.println("Opção invalida. Tente novamente");

                }


            }else if (inicio.equalsIgnoreCase("não") || inicio.equalsIgnoreCase("nao")){
                System.out.println("Até a proxima!");
                break;
            }else {
                System.out.println("Reposta inválida. Tente novamente!");
            }

        }while (!inicio.equalsIgnoreCase("nao") && !inicio.equalsIgnoreCase("não"));


        sc.close();
    }

    public static double depositar (double saldo, double valor){
        return saldo + valor;
    }

    public static double sacar (double saldo, double valor){
        return  saldo - valor;
    }

}
