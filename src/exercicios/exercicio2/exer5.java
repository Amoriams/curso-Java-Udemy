package exercicios.exercicio2;
import java.util.Scanner;

public class exer5 {
	public static void main (String [] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	int cod1, cod2, uni1, uni2;
	double val1, val2, total, uni;
	
	cod1 = sc.nextInt();
	uni1 = sc.nextInt();
	val1 = sc.nextDouble();
	
	cod2 = sc.nextInt();
	uni2 = sc.nextInt();
	val2 = sc.nextDouble();
	
	total = val1 * uni1 + val2 * uni2;
	
	System.out.printf("Valor a pagar: R$ %.2f%n", total);
	
	
	
	
			

	
	
	
	
	}
}

