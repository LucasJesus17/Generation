package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int a , b , c, r, s, d;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		r = (a+b);
		r = r * r;
		
		s = (b+c);
		s = s * s;
		
		d = (r+s)/2;
		
		System.out.println("O resultado é: " + d);
		
		
	}

}
