package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();

		if (a <= b && b <= c) {

			System.out.println("Os valores em ordem crescente é: " + a + " - " + b + " - " + c);

		} else if (b <= a && a <= c) {

			System.out.println("Os valores em ordem crescente é: " + b + " - " + a + " - " + c);

		} else if (b <= c && c <= a) {

			System.out.println("Os valores em ordem crescente é: " + b + " - " + c + " - " + a);
			
		} else if (c <= b && b <= a) {
			
			System.out.println("Os valores em ordem crescente é: " + c + " - " + b + " - " + a);

		} else if (c <= a && a <= b) {
			
			System.out.println("Os valores em ordem crescente é: " + c + " - " + a + " - " + b);

		} else if(a<=c && c<=b) {
			
			System.out.println("Os valores em ordem crescente é: " + a + " - " + c + " - " + b);

		}

	}

}
