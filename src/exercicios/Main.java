package exercicios;

import java.util.Locale;

 public class Main {

 	public static void main(String[] args) {
		
		String produto1 = "computador";
		String produto2 = "mesa";
		String genero = "f";
		
		int idade = 30;
		int codigo = 5290;
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.24560584;
		
		System.out.println("Produtos:");
		System.out.printf("%s com o valor de R%.2f%n", produto1, preco1);
		System.out.printf("%s com o valor de R$ %.2f%n", produto2, preco2);
		System.out.printf("record: %d anos de idade, codigo %d e sexo %s%n", idade, codigo, genero);
		System.out.printf ("medida com oito casas decimais %.8f%n", medida);
		System.out.printf("tres casas decimais %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Us ponto dicmal %.3f%n", medida);
		
	}

}
