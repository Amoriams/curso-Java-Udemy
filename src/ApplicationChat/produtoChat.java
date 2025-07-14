package ApplicationChat;

import EntitiesChat.produtochat;

import java.util.Scanner;

public class produtoChat {
        public static void main (String [] args){
            Scanner sc = new Scanner (System.in);

            produtochat produto = new produtochat();

            System.out.print("Digite o nome do produto: ");
            produto.nome = sc.nextLine();
            System.out.print("Digite o preço: ");
            produto.preco = sc.nextDouble();
            System.out.print("Digite a quantidade: ");
            produto.quantidade = sc.nextInt();

            produto.exibirInfo();

            double total = produto.calcularValorTotal();
            System.out.printf("\nValor total em estoque: %.2f", total);


            sc.close();
        }
    }

