package secao09Revisao.application;
import java.util.Locale;
import java.util.Scanner;
import secao09Revisao.entities.Product;
public class revisao01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Product product = new Product(); */
        /* (Product product = new Product();) atributos de product vazios, na aula de construtores (01 da seção 09) vamos tentar melhorar isso */




        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        /* System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt(); , por enquanto não vai ser necessário, já que não colocamos quantity no construtor*/

        Product product = new Product(name, price /* também apagamos o quantitiy daqui*/);
        /* obriga o programador a fornecer os dados no momento da instanciação */


        System.out.println();

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        /* e declaramos o quantity como INT" aqui */
        int quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();

        product.removeProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        sc.close();
    }
}