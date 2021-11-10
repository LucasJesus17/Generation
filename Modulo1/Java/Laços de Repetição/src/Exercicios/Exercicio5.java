package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		float n, soma = 0;
		
		do {
		System.out.println("Digite um valor: ");
		n = ler.nextFloat();
		
		soma  += n;
		
		} while (n != 0);
		System.out.println("A soma dos valores digitados é: " + soma);
	}

}
