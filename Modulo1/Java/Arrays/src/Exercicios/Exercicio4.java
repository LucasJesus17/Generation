package Exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {

	/*
Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
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
				System.out.println("Digite o valor da posi��o: " + (i+1) + " - " + (j+1) + " da 1� matriz");
				v[i][j] = ler.nextInt();
		
			
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.println("Digite o valor da posi��o: " + (i+1) + " - " + (j+1) + " da 2� matriz");
				v2[i][j] = ler.nextInt();
		
			
			}
		}
		
		

	

		do {
			
			System.out.println("\n***** Op��es *****");
			System.out.println("1 - Somar duas matrizes" + "\n2 - Subtrair duas matrizes" + "\n3 - Adicionar uma constante" + "\n4 - Imprimir matrizes" + "\n5 - Sair");
			System.out.println("Digite a op��o desejada");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
						float v3[][] = new float[2][2];

						v3[i][j] = v[i][j] + v2[i][j];
						System.out.println("Posi��o" + (i+1) + (j+1) + " da 3� matriz : " + v3[i][j]);
						
						
					}
					
				}
				
				break;
			case 2:
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
					float v3[][] = new float[2][2];

					v3[i][j] = v[i][j] - v2[i][j];
					System.out.println("Posi��o" + (i+1) + " - " + (j+1) + " da 3� matriz : " + v3[i][j]);
					
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
				System.out.println("A soma da variavel na posi��o " + (i+1) + " - " + (j+1) + " da 1� matriz : " + v[i][j]);
				System.out.println("A soma da variavel na posi��o " + (i+1) + " - " + (j+1) + " da 2� matriz : " + v2[i][j]);
				
				
					
				}
				}
				
				
				break;
			case 4:
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
						System.out.println("Posi��o " + (i+1) + " - " + (j+1) + " da 1� matriz : " + v[i][j]);
						
					}
					
				}
				System.out.println("\n Matriz 2");
				
				for (int i = 0; i < v.length; i++) {
					for (int j = 0; j < v.length; j++) {
						System.out.println("Posi��o " + (i+1) + " - " + (j+1) + " da 2� matriz : " + v2[i][j]);
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
