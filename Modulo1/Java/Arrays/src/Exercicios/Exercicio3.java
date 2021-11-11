package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	/*
 Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int v[][] = new int[3][3];
		int cont = 0;
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.println("Digite o valor da posição: " + (i+1) + " - " + (j+1));
				v[i][j] = ler.nextInt();
			
				if(v[i][j] > 10) {
					cont++;
				}
			
			}
		}
		
		System.out.println("Encontrei " + cont + " valores maior que 10");
		
	}

}
