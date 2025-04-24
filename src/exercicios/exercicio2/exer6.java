package exercicios.exercicio2;

import java.util.Scanner;

public class exer6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a, b, c, pi;
		double tri, cir, tra, qua, ret;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		tri = a * c / 2;
		pi = 3.14159;
		cir = pi * Math.pow(c, 2);
		tra = (a + b) * c / 2;
		qua = b * b;
		ret = a * b;
		

		System.out.printf("TRIANGULO: %.1f%n", tri);
		System.out.printf("CIRCULO: %.1f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua); 
		System.out.printf("RETANGULO: %.3f%n", ret);

	}
}
