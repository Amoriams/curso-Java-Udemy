package exercicios.proprios.funcoes;
import java.util.Scanner;

public class atvd4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        double distancia, velocidade;

        System.out.print("Digite a distancia: ");
        distancia = sc.nextDouble();
        System.out.print(" digite a velocidade: ");
        velocidade = sc.nextDouble();

        if (distancia <= 0 || velocidade <= 0 ){
            System.out.println("Erro: Informações inválidas, tente novamente");
        }else {
            calcularTempoViagem(distancia, velocidade);

        }

        sc.close();

    }

    public static void calcularTempoViagem (double distancia, double velocidade){
        double tempo = (distancia / velocidade);
        int horas = (int) tempo;
        int minutos = (int)((tempo - horas) * 60);
       System.out.printf("Tempo estimado: %d horas e %d minutos", horas, minutos);
    }
}
