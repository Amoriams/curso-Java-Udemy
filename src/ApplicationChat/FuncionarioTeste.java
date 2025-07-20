package ApplicationChat;

import EntitiesChat.funcionarioTeste;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        funcionarioTeste F1 = new funcionarioTeste("joao", "auxiliar", 2500.0);

        System.out.println(F1);
        System.out.print("Digite a porcentagem: ");
        int porcentagem = sc.nextInt();

        F1.aumentarSalario(porcentagem);

        System.out.println(F1);
    }
}
