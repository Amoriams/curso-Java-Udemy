package application;

import entities.BankAccount;

import java.util.Scanner;


public class bankAccount {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        BankAccount titular1;


        System.out.print("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Tem deposito inicial (s/n): ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.print("Digite o deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            titular1 = new BankAccount(numeroConta, nomeTitular, depositoInicial);
        } else{
            titular1 = new BankAccount(numeroConta, nomeTitular);
        }

        System.out.println("\nDados da conta: ");
        System.out.println(titular1);

        System.out.print("\nDigite o valor do deposito: ");
        double deposito = sc.nextDouble();
        titular1.deposito(deposito);

        System.out.println("Dados da conta atualizados: ");
        System.out.println(titular1);


        System.out.print("\nDigite o valor do saque: ");
        double saque = sc.nextDouble();
        titular1.saque(saque);


        System.out.println("\nDados da conta atualizados: ");
        System.out.println(titular1);



        sc.close();
    }
}
