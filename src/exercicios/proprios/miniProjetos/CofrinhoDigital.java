package exercicios.proprios.miniProjetos;
import java.util.Scanner;
import java.util.ArrayList;

public class CofrinhoDigital {
    public static void main (String [] args) {

        double saldoIni = 0;
        double saldoAtu;
        Scanner sc = new Scanner(System.in);
        double deposito;
        double saque;
        ArrayList<String> extrato = new ArrayList<>();



        System.out.println("====== ÁGILCONTA ======");
        System.out.println("Bem-vinda ao seu Cofrinho Digital!");
        System.out.printf("Saldo inicial: R$%.2f\n", saldoIni);
        saldoAtu = saldoIni;


        String op;
        do {
            System.out.println("=======================");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Retirar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Ver extrato");
            System.out.println("0 - Sair");
            System.out.print("> ");
            op = sc.nextLine();

            switch (op){

                case "1":

                    System.out.print("Digite o valor do deposito: R$ ");
                    deposito = sc.nextDouble();
                    sc.nextLine();
                    if ((deposito <=0)){
                        System.out.println("Valor invalido! Digite um valor maior que zero.");
                    }
                    else {
                        saldoAtu += deposito;
                        extrato.add(String.format("deposito de R$ %.2f", deposito));
                        System.out.println("Deposito realizado com sucesso!");
                        System.out.printf("Saldo atual: R$ %.2f\n", saldoAtu);
                    }
                    break;

                case "2":
                    System.out.print("Digite o valor do saque: R$ ");
                    saque = sc.nextDouble();
                    sc.nextLine();
                    if (saque <= saldoAtu){
                        saldoAtu -= saque;
                        extrato.add(String.format("Saque de R$ %.2f", saque));
                        System.out.println("Saque realizado com sucesso!");
                        System.out.printf("Saldo atual: R$ %.2f\n", saldoAtu);
                    }
                    else {
                        System.out.println("Saldo Insuficiente. Tente novamente!");
                    }
                    break;

                case "3" :
                    System.out.printf("Saldo atual: R$ %.2f\n", saldoAtu);
                    break;

                case "4":
                    System.out.println("========EXTRATO========");
                    if (extrato.isEmpty()){
                        System.out.println("Nenhuma movimentação realizada!");
                    }else {
                        for (String linha : extrato) {
                            System.out.println(linha);
                        }
                    }
                    System.out.println("=======================");
                    System.out.printf("Saldo atual: R$ %.2f\n", saldoAtu);
                    break;

                case "0":
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção invalida. Tente novamente!");
            }


        } while (!op.equals("0"));

        System.out.println("Fim do programa.");
        System.out.printf("Saldo final: R$ %.2f\n", saldoAtu);

        sc.close();
    }
}
