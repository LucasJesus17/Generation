package Exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {

	/*
Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float v[][] = new float[2][2];
		float v2[][] = new float[2][2];
		int n;
		
		int op;
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.println("Digite o valor da posição: " + (i+1) + " - " + (j+1) + " da 1ª matriz");
				v[i][j] = ler.nextInt();
		
			
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.println("Digite o valor da posição: " + (i+1) + " - " + (j+1) + " da 2ª matriz");
				v2[i][j] = ler.nextInt();
		
			
			}
		}
		
		

	

		do {
			
			System.out.println("\n***** Opçôes *****");
			System.out.println("1 - Somar duas matrizes" + "\n2 - Subtrair duas matrizes" + "\n3 - Adicionar uma constante" + "\n4 - Imprimir matrizes" + "\n5 - Sair");
			System.out.println("Digite a opção desejada");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
						float v3[][] = new float[2][2];

						v3[i][j] = v[i][j] + v2[i][j];
						System.out.println("Posição" + (i+1) + (j+1) + " da 3ª matriz : " + v3[i][j]);
						
						
					}
					
				}
				
				break;
			case 2:
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
					float v3[][] = new float[2][2];

					v3[i][j] = v[i][j] - v2[i][j];
					System.out.println("Posição" + (i+1) + " - " + (j+1) + " da 3ª matriz : " + v3[i][j]);
					
					}
			
				}
				
				break;
			case 3:
				System.out.println("\nDigite o valor Desejado");
				n = ler.nextInt();
				
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j  < v2.length; j++) {
				
				v[i][j] = v[i][j] + n;
				v2[i][j] = v2[i][j] + n;
				System.out.println("A soma da variavel na posição " + (i+1) + " - " + (j+1) + " da 1ª matriz : " + v[i][j]);
				System.out.println("A soma da variavel na posição " + (i+1) + " - " + (j+1) + " da 2ª matriz : " + v2[i][j]);
				
				
					
				}
				}
				
				
				break;
			case 4:
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
						System.out.println("Posição " + (i+1) + " - " + (j+1) + " da 1ª matriz : " + v[i][j]);
						
					}
					
				}
				System.out.println("\n Matriz 2");
				
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
						System.out.println("Posição " + (i+1) + " - " + (j+1) + " da 2ª matriz : " + v2[i][j]);
					}
					
				}
				
				break;
			case 5:
				System.out.println("Volte sempre");
				break;
			default:
				System.out.println("Valor invalido digite novamente");

			}
		} while (op !=5);

		
		
		
	}

}
