package ApplicationChat;
import EntitiesChat.ContaBancaria;
import java.util.Scanner;

public class bancoApp {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria(123, "Julia", 250.00);
        ContaBancaria conta2 = new ContaBancaria(456, "Rafael", 1000.0);

        System.out.println("==== Dados da conta 1 ====");
        System.out.println(conta1);


        System.out.println("\n==== Dados da conta 2 ====");
        System.out.println(conta2);



        System.out.print("\nDigite valor para depositar na conta 1: ");
        double valorDeposito = sc.nextDouble();
        conta1.depositar(valorDeposito);

        System.out.print("Digite valor para sacar da conta 2: ");
        double valorSaque = sc.nextDouble();
        conta2.sacar(valorSaque);

        System.out.println(">> depositando R$" + valorDeposito + " na conta 1");
        System.out.println(">> Sacando R$" + valorSaque + " na conta 2");


        System.out.println("\n==== Dados atualizados ====");
        System.out.println(conta1);
        System.out.println(conta2);



        sc.close();
    }
}
