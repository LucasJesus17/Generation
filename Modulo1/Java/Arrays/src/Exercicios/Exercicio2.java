package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int[]  v = new int[6];
		int somap = 0, cont = 0;
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite valor da posi��o" + i);
			v[i] = ler.nextInt();
			
		}
		
		for (int i = 0; i < v.length; i++) {
			if(v[i]%2 == 0) {
				System.out.println("Os valores pares digitados foram: "+ v[i]);
				somap = somap + v[i];
			}
		}

		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Os valores impares digitados foram: " + v[i] );
			cont++;
		}
		System.out.println("A soma dos valores pares foram: " + somap);
		System.out.println("A quantidade de numeros digitados foram: " + cont);
	}

}
