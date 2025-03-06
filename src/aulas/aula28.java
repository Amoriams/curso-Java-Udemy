package aulas;
import java.util.Locale;

public class aula28 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		double x = 3.0;
		double y = 4.0;
		double z = 5.0;
		double a, b, c; 
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		System.out.println(" Raiz quadrada de " + x + " = " + a);
		System.out.println(" Raiz quadrada de " + y + " = " + b);
		System.out.println(" Raiz quadrada de 25 = " + c);
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + a);
		System.out.println(x + " elevado ao quadrado = " + b);
		System.out.println("5 elevado ao quadrado = " + c);
		
		a = Math.abs(x);
		a = Math.abs(x);
		System.out.println("valor absoluto de " + y + " = " + a);
		System.out.println("valor absoluto de " + z + " = " + b);
		
	}
}

