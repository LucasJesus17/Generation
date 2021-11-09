package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float x1, x2, y1, y2, d, x, y;
		
		System.out.println("Digite o valor x1: ");
		x1 = ler.nextFloat();
		System.out.println("Digite o valor x2: ");
		x2 = ler.nextFloat();
		System.out.println("Digite o valor y1: ");
		y1 = ler.nextFloat();
		System.out.println("Digite o valor y2: ");
		y2 = ler.nextFloat();
		
		x = x2 - x1;
		x = x * x;
		y = y1 - y2;
		y = y * y;
		d = x + y;
		
		System.out.println("A raiz dos valores é: " + d);
	
	}
}
