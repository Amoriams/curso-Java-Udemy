package logicaProgramacao.aulas;
import java.util.Locale;
import java.util.Scanner;

public class aula39 {

    public static void main (String [] args){

        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner(System.in);
        int x;
        String dia;

        System.out.println("qual dia?");
        x = sc.nextInt();

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "dia invalido";
                break;

        }
        System.out.println("dia da semana: " + dia);

        sc.close();

    }
}

//dia = switch (x) {
//            case 1 -> "domingo";
//            case 2 -> "segunda";
//            case 3 -> "terça";
//            case 4 -> "quarta";
//            case 5 -> "quinta";
//            case 6 -> "sexta";
//            case 7 -> "sabado";
//            default -> "dia invalido";
//        };
//tem essa versao que eu achei boa tambem (mais facil).
