package exercicios.funcoes;

import java.util.Scanner;

public class PodeTerCNH {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        String nome;
        int anoNascimento;

        System.out.print("Olá, bem vindo. Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        int idade = classificacaoDeIdade(anoNascimento);

        String mensagem = classificacaoCNH(nome, idade);
        System.out.println(mensagem);


        sc.close();

    }

    public static int classificacaoDeIdade(int anoNascimento){
        int anoAtual = java.time.LocalDate.now().getYear();
        return anoAtual - anoNascimento;

    }

    public static String classificacaoCNH(String nome, int idade){
        if (idade > 18){
            return "olá, " + nome + ", por ter " + idade + " anos, voeê já pode tirar sua CNH";
        } else {
            int tempo = 18 - idade;
            return "olá, " + nome + ", por ter " + idade + " anos, voeê ainda não pode tirar sua CNH, espere mais " + tempo + " anos";
        }
    }
}
