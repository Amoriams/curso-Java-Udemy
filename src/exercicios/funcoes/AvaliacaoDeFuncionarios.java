package exercicios.funcoes;

import java.util.Scanner;

public class AvaliacaoDeFuncionarios {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double media = calcularMedia(n1, n2, n3);
        String desempenho = avaliarDesempenho(media);
        exibirRelatorio(nome, media, desempenho);


        sc.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String avaliarDesempenho(double media){

        if (media >= 9){
            return "Excelente";
        } else if (media >= 7 && media < 9) {
            return "Bom";
        } else if (media > 5 && media < 7) {
            return "Regular";

        } else {
            return "Precisa melhorar";
        }
    }

    public static void exibirRelatorio (String nome, double media, String avaliacao){
        System.out.println("\n========== RELATÓRIO DE DESEMPENHO =========");
        System.out.println("Funcionário: " + nome);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Desempenho: " + avaliacao);
    }
}
