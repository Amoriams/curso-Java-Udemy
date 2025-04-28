package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class ControleEstoque {
    public static void main (String [] args){


        Scanner sc = new Scanner (System.in);

        String nomeProd;
        double precoProd, total;
        int quantidadeProd, quantidadeMais, quantidadeMenos;
        String resposta;
        String addOrRet;


        System.out.println("=========== Inventário Pro ===========");
        System.out.println("Bem- vindo ao Inventário Pro!!");
        System.out.print("Digite o nome do produto: ");
        nomeProd = sc.nextLine();
        System.out.print("Digite o valor do produto: ");
        precoProd = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        quantidadeProd = sc.nextInt();
        sc.nextLine();

        total = (precoProd * quantidadeProd);

        System.out.println("Produto: " + nomeProd + ", Preço: " + precoProd + ", Quantidade em estoque: " + quantidadeProd +", Valor total: " + total);

        System.out.println("=========== Inventário Pro ===========\n");

        do {
            System.out.print("Gostaria de adicionar ou retirar algo do estoque? (sim/nao): ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.print("Deseja adicionar ou retirar?: ");
                addOrRet = sc.nextLine();

                switch (addOrRet) {
                    case "adicionar":
                        System.out.println("No estoque atual temos: " + quantidadeProd + " quantidades");
                        System.out.print("Quantas unidade gostaria de adicionar: ");
                        quantidadeMais = sc.nextInt();
                        quantidadeProd += quantidadeMais;
                        total = (precoProd * quantidadeProd);
                        System.out.println(" Atualizando...");
                        System.out.println("Produto: " + nomeProd + ", Preço: " + precoProd + ", Quantidade em estoque: " + quantidadeProd + ", Valor total: " + total);
                        break;

                    case "retirar":
                        System.out.println("No estoque atual temos: " + quantidadeProd + " quantidades");
                        System.out.print("Quantas unidades  gostaria de retirar: ");
                        quantidadeMenos = sc.nextInt();
                        if (quantidadeProd >= quantidadeMenos) {
                            quantidadeProd -= quantidadeMenos;
                            total = (precoProd * quantidadeProd);
                            System.out.println(" Atualizando...");
                            System.out.println("Produto: " + nomeProd + ", Preço: " + precoProd + ", Quantidade em estoque: " + quantidadeProd + ", Valor total: " + total);
                            System.out.println(quantidadeMenos + " unidades de " + nomeProd + " retiradas do estoque");

                        } else {
                            System.out.println("Quantidade indisponivel");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente!");

                }
            } else if (resposta.equalsIgnoreCase("nao")) {
                System.out.println("Okay, até breve!");
                System.out.println("Saindo...");

            }
        } while (!resposta.equals("nao"));


        sc.close();

    }
}
