package application;

import entities.rectangle;

import java.util.Scanner;

public class Rectangle {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        rectangle retangulo = new rectangle();

        System.out.println("Digite a altura e largura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("AREA: %.2f\n", retangulo.area());
        System.out.printf("PERIMETRO: %.2f\n", retangulo.perimetro());
        System.out.printf("DIAGONAL: %.2f\n", retangulo.diagonal());

        sc.close();
    }
}
