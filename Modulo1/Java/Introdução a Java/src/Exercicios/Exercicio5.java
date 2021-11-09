package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite o valor da nota 1: ");
		nota1 = ler.nextFloat();
		System.out.println("Digite o valor da nota 2: ");
		nota2 = ler.nextFloat();
		System.out.println("Digite o valor da nota 3: ");
		nota3 = ler.nextFloat();
		
		
		media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		media  = media/(2 + 3 + 5);
		System.out.println("Sua nota final é: " + media);
		
		
		
	}

}
