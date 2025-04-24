package exercicios.proprios.miniProjetos;
import java.util.ArrayList;
import java.util.Scanner;

public class ListadeCompras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double saldoIni;
        ArrayList<String> produtosComprados = new ArrayList<>();
        ArrayList<Double> precosComprados = new ArrayList<>();


        System.out.print("digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu saldo inicial: ");
        saldoIni = sc.nextDouble();
        sc.nextLine();

        double saldoAtual = saldoIni;
        String continuar;

        do {
            System.out.print("Produto: ");
            String produto = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            if (preco <= saldoAtual) {
                System.out.println("Compra aprovada");
                saldoAtual -= preco;
                produtosComprados.add(produto);
                precosComprados.add(preco);
                System.out.printf("saldo atual: %.2f\n", saldoAtual);
            } else {
                System.out.println("Saldo insuficiente!\n");
            }
            System.out.println("Deseja adicionar outro produto? (sim/nao): ");
            continuar = sc.nextLine();


        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Aqui esta o resumo das suas compras, " + nome);
        for (int i = 0; i < produtosComprados.size(); i++) {
            System.out.printf("- %s: R$ %.2f\n", produtosComprados.get(i), precosComprados.get(i));
        }

        System.out.printf("Fim das compras! Saldo final: %.2f", saldoAtual);

  sc.close();
    }
}
