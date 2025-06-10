package exercicios.proprios.funcoes;

import java.util.Scanner;
public class avaliacaoFunc {
    public static void main (String [] args){
       Scanner sc = new Scanner (System.in);

       String nome1, nome2, nome3;
       double prod1, comp1, prod2, comp2, prod3, comp3;

       System.out.println("==========================================");
       System.out.print("Digite o nome do funcionário 1: ");
       nome1 = sc.nextLine();
       System.out.print("nota de produtividade (0-10): ");
       prod1 = sc.nextDouble();
       sc.nextLine();
       System.out.print("nota de comportamento (0-10): ");
       comp1 = sc.nextDouble();
       sc.nextLine();

       System.out.println("==========================================");
       System.out.print("Digite o nome do funcionário 2: ");
       nome2 = sc.nextLine();
       System.out.print("nota de produtividade (0-10): ");
       prod2 = sc.nextDouble();
       sc.nextLine();
       System.out.print("nota de comportamento (0-10): ");
       comp2 = sc.nextDouble();
       sc.nextLine();

       System.out.println("==========================================");
       System.out.print("Digite o nome do funcionário 3: ");
       nome3 = sc.nextLine();
       System.out.print("nota de produtividade (0-10): ");
       prod3 = sc.nextDouble();
       sc.nextLine();
       System.out.print("nota de comportamento (0-10): ");
       comp3 = sc.nextDouble();

       double notafinal1 = calcularNota(prod1, comp1);
       double notafinal2 = calcularNota(prod2, comp2);
       double notafinal3 = calcularNota(prod3, comp3);

       System.out.println("==========================================");

       System.out.println("NOTAS FINAIS");
       System.out.printf("%s: %.1f%n",nome1, notafinal1);
       System.out.printf("%s: %.1f%n",nome2, notafinal2);
       System.out.printf("%s: %.1f%n",nome3, notafinal3);


        System.out.println("==========================================");
       melhorFuncionario(nome1, notafinal1, nome2, notafinal2, nome3, notafinal3);


        System.out.println("==========================================");
       melhorNota(nome1, notafinal1, nome2, notafinal2, nome3, notafinal3);
       sc.close();
    }

    public static double calcularNota (double pr, double co){

        return pr * 0.7 + co * 0.3;
    }
    
    public static void melhorFuncionario (String n1, double N1, String n2, double N2, String n3, double N3){
        double melhorNota = N1;
        String melhorFuncio = n1;

        if( N2 > melhorNota){
            melhorFuncio = n2;
        }if(N3 > melhorNota) {
            melhorFuncio = n3;
        }

        System.out.println ("melhor funcionario: " + melhorFuncio);
    }
    
    public static void melhorNota (String n1, double a, String n2, double b, String n3, double c){
        if (a < 6 ){
            System.out.printf("%s será chamado para um feedback!", n1);
        }else if (b < 6 ){
            System.out.printf("%s será chamado para um feedback!", n2);
        }else if (c < 6 ){
            System.out.printf("%s será chamado para um feedback!", n3);
        } else {
            System.out.println("Todos foram bem!");
        }
    }
    
}
