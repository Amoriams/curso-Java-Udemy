package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class MenuAlcool {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double gasolina;
        double alcool;
        String opcao;

        do {
        System.out.println("========= Menu Combustivel =========");
        System.out.println("[1] Fazer recomendação.");
        System.out.println("[2] Sair.");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextLine();

        switch (opcao) {

            case "1":
                System.out.print("Digite o preço do álcool: ");
                alcool = sc.nextDouble();
                sc.nextLine();
                System.out.print("Digite o preço da gasolina: ");
                gasolina = sc.nextDouble();
                sc.nextLine();

                 if ((alcool / gasolina) <= 0.7) {
                     System.out.println("Recomendação: melhor abastecer com álcool.");
            }    else {
                    System.out.println("Recomendação: Melhor abastecer com gasolina.");
            }
                break;

            case "2":
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente!");

        }
        } while (!opcao.equals("2"));

        sc.close();
    }
}
