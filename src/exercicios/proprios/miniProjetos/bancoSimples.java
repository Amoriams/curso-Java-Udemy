package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class bancoSimples {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);


        double saldoIni =0;
        double saldoAtual = saldoIni;

        System.out.print("Digite o nome do cliente: ");
        String name = sc.nextLine();
        System.out.print("Digite o numero da conta: ");
        int count = sc.nextInt();
        sc.nextLine();
        System.out.println("==========================================");
        System.out.printf("Saldo inicial: %.2f\n", saldoIni);

        System.out.println("Deseja fazer algum deposito ou saque? (sim/nao) ");
        String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("sim")) {
                String answer2;
                do {
                    System.out.println("==========================================");
                    System.out.println("Otimo! digite a opcção que deseja: ");
                    System.out.println("1 - deposito");
                    System.out.println("2 - saque");
                    System.out.println("0 - sair");
                    System.out.println("===========================================");
                    answer2 = sc.nextLine();

                    switch (answer2) {
                        case "1":
                            System.out.println("Digite o valor do deposito: ");
                            double dep = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Deposito realizado com sucesso!");
                            saldoAtual += dep;
                            System.out.printf("Saldo atual: %.2f\n", saldoAtual);
                            break;

                        case "2":
                            System.out.println("Digite o valor do saque: ");
                            double saque = sc.nextDouble();
                            sc.nextLine();
                            if (saque <= saldoAtual) {
                                System.out.println("Saque realizado com sucesso!");
                                saldoAtual -= saque;
                                System.out.printf("Saldo atual: %.2f\n", saldoAtual);
                            } else {
                                System.out.println("Saldo insuficiente");
                            }
                            break;

                        case "0":
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção invalida. Tente novamente");
                    }

                }
                while (!answer2.equals("0"));
            }
            else {
                System.out.println("Obrigado!!");
            }

        sc.close();
            System.out.printf("Fim da operação. Obrigada %s. Saldo final: %.2f",name,  saldoAtual);

    }
}
