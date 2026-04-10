package secao09Revisao.application;
import secao09Revisao.entities.Bank;
import java.util.Scanner;


public class BankApp {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Bank bank;
        double deposit;
        double withdraw;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        System.out.print("Is there an initial deposit (Y/N): ");
        String response = sc.nextLine();

        if (response.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double initialD = sc.nextDouble();
             bank = new Bank(numberAccount, accountName, initialD);
        } else {
             bank = new Bank(numberAccount, accountName);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        bank.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        withdraw = sc.nextDouble();
        bank.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();



    }
}
