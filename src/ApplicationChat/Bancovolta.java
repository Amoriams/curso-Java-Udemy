package ApplicationChat;

import EntitiesChat.bancoVolta;

import java.util.Scanner;

public class Bancovolta {
    public static void main (String [] args){


        Scanner sc = new Scanner(System.in);
        bancoVolta titular1;


        for (int i = 0; i < 2; i++) {
            System.out.print("Digite seu nome: ");
            String nomeTitular = sc.nextLine();

            System.out.print("Digite o valor do deposito inicial: R$");
            double depositoInicial = sc.nextDouble();
            titular1 = new bancoVolta(nomeTitular, depositoInicial);

            System.out.println("Conta de " + titular1.getTitular() + " - Saldo: R$" + titular1.getSaldo());

            System.out.print("Digite valor de deposito: R$");
            double valorDeposito = sc.nextDouble();
            titular1.deposito(valorDeposito);

            System.out.print("Digite valor de saque: R$");
            double valorSaque = sc.nextDouble();
            sc.nextLine();
            titular1.saque(valorSaque);


            System.out.println(titular1);
        }
        sc.close();
    }
}
