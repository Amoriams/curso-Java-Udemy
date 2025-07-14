package exercicios.funcoes;

import java.util.Scanner;

public class CalculadoradeFrete {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Peso da encomenda (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Distância até o destino (km): ");
        double distancia = sc.nextDouble();

        exibirResumo(nomeCliente, peso, distancia);




    }

    public static double calcularFrete (double peso, double distancia){
        if (peso < 5){
            return distancia * 0.5;
        } else if (peso >= 5 && peso < 20){
            return distancia * 0.75;
        }else {
            return distancia * 1;
        }
    }

    public static void exibirResumo (String nomeCliente, double peso, double distancia){

        System.out.println("\n=========== RESUMO DO PEDIDO ==========");
        System.out.println("nome do cliente: " + nomeCliente);
        System.out.println("peso da encomenda: " + peso);
        System.out.println("Distâcia até o destino: " + distancia);
        double frete = calcularFrete(peso, distancia);
        System.out.println("Valor total do frete: " + frete );
    }


}
