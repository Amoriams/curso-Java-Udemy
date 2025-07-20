package application;

import entities.Employee;

import java.util.Scanner;

public class employeeApp {
   public static void main (String [] args){
       Scanner sc = new Scanner(System.in);

       Employee funcionario = new Employee();

       System.out.print("nome: ");
       funcionario.nome = sc.nextLine();

       System.out.print("salario bruto: ");
       funcionario.salarioB = sc.nextDouble();

       System.out.print("imposto: ");
       funcionario.imposto = sc.nextDouble();

       System.out.println();
       System.out.println("Funcionario: " + funcionario);
       System.out.println();
       System.out.print("qual porcentagem quer acrescentar no salario: ");
       double porcentagem = sc.nextDouble();
       funcionario.aumento(porcentagem);
       System.out.println();
       System.out.println("dados atualizados: " + funcionario);



    sc.close();
   }
}
