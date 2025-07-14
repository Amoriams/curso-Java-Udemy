package ApplicationChat;
import EntitiesChat.ClassFilmes;
import java.util.Scanner;

public class FilmeClass {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        ClassFilmes filme1 = new ClassFilmes();


        System.out.print("Digite o título do filme: ");
        filme1.titulo = sc.nextLine();

        System.out.print("Digite o gênero: ");
        filme1.genero = sc.nextLine();

        System.out.print("Digite a avaliação: ");
        filme1.avaliacao = sc.nextDouble();

        filme1.exibirInfo();

        String classificacao = filme1.classificarFilme();
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}
