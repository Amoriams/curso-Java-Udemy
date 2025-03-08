package exercicios.exercicio1.exercicio3;
import java.util.Scanner;

public class exer4 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
             duracao = horaFinal - horaInicial;
        }

        else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("o jogo durou " + duracao + " hora (s)");
    }
}

// esse eu não entendi muito bem, praticamente copiei o codigo do prof, treinar mais interpretação.
