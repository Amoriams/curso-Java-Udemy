package exercicios.proprios.miniProjetos;

import java.util.Scanner;

public class ControledeNotas {
    public static void main (String [] args){


        Scanner sc = new Scanner(System.in);
        String cadastro;
        double somaNotas = 0;
        int contadorAlunos = 0;

        do {  System.out.print("Você deseja cadastrar os alunos? (Sim/Nao): ");
            cadastro = sc.nextLine();

            if (cadastro.equalsIgnoreCase("sim")){
                System.out.println("=========================================== \n");
                System.out.print("Aluno: ");
                String nome = sc.nextLine();


                System.out.print("notas: ");
                double nota1 = sc.nextDouble();
                double nota2 = sc.nextDouble();
                double nota3 = sc.nextDouble();

                sc.nextLine();

                double Media = calcularMedia(nota1, nota2, nota3);
                String status = verificarStatus(Media);
                somaNotas += Media;
                contadorAlunos++;

                System.out.printf("alunos: %s \n", nome);
                System.out.printf("Notas: %.1f || %.1f || %.1f \n",nota1, nota2, nota3);
                System.out.printf("Média: %.2f \n", Media);
                System.out.println(status);

            } else if (cadastro.equalsIgnoreCase("Não") ||  (cadastro.equalsIgnoreCase("nao"))) {
                System.out.println("Okay, até a proxima!!");
                break;
            } else {
                System.out.println("Resposta invalida, tente novamente!");
            }


        } while (!cadastro.equalsIgnoreCase("nao") && (!cadastro.equalsIgnoreCase("não")));

        if (contadorAlunos > 0){
            double media = somaNotas / contadorAlunos;
            System.out.printf("\nTotal de alunos cadastrados: %d\n", contadorAlunos);
            System.out.printf("Média de notas da turma: R$%.2f", media);
        }else {
            System.out.println("nenhum aluno foi cadastrado!");
        }
        sc.close();



    }
    public static double calcularMedia(double not1, double not2, double not3){
        return (not1 + not2 + not3) / 3;
    }
    public static String verificarStatus (double media){

        if (media >= 7){
            return"Situação: Aprovado!";
        } else if (media >= 5)  {
            return "Situação: Em recuperação!";
        } else {
           return "Situação: Reprovado!";
        }
    }
}
