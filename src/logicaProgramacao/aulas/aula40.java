package logicaProgramacao.aulas;

import java.util.Scanner;

public class aula40 {

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        double pre = 34.5;
        double desconto = (pre < 20.0) ? pre * 0.01 : pre * 0.05;

        System.out.println(desconto);

        sc.close();
    }
}
