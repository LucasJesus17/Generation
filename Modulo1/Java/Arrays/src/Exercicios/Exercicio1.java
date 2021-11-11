package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int[]  v = new int[]{1,0,5,-2,-5,7};
		int a = 0;
		
		for (int i = 0; i < v.length; i++) {
			
			if(i == 0 || i == 1 || i == 5) {
				a = a + v[i];
				
			}else if(i == 4) {
				v[i] = 100;
			}
			
			
		}
		
		System.out.println("A soma das posições 0, 1 e 5 é: " + a);
		

		for (int i = 0; i < v.length; i++) {
			System.out.println("Posição" + i + " : " + v[i]);
		}
	}

}
