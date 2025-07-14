package ApplicationChat;

import java.util.Scanner;

import EntitiesChat.BoletimChat;

public class Boletimchat {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

       BoletimChat aluno1 = new BoletimChat();

        System.out.print("digite o nome do aluno: ");
        aluno1.nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        aluno1.nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno1.nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        aluno1.nota3 = sc.nextDouble();

        aluno1.exibirInfo();

        double media = aluno1.calcularMedia();
        System.out.printf("Média: %.1f\n", media);

        String status = aluno1.verificarStatus();
        System.out.print("Status: " + status);

        sc.close();

    }
}
