package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class notas {
    public static void main (String [] args){
        double notaUm, notaDois;
        Scanner sc = new Scanner (System.in);
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println ("olá, " + nome + ", aqui mostraremos, com base nas suas notas, sua media final!");
        System.out.print ("Para isso me informe sua primeira nota: ");
        notaUm = sc.nextDouble();
        System.out.print("perfeito! agora a segunda: ");
        notaDois = sc.nextDouble();

        double media = (notaUm + notaDois) / 2;

        if (media >= 7){
            System.out.printf ("Sua media é %.1f: ", media);
            System.out.print("Parabéns! Você foi aprovada");
        } else if (media >= 5 && media < 7){
            System.out.printf ("Sua media é %.1f: ", media);
            System.out.print("Você está de recuperação. Estude mais um pouco!");
        } else{
            System.out.printf ("Sua media é %.1f: ", media);
            System.out.print("Infelizmente, você foi reprovada.");

        }
    sc.close();
    }
}
