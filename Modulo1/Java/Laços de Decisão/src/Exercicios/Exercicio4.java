package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		Scanner ler  = new Scanner(System.in);
		
		System.out.println("Digite o valor escolho: ");
		a = ler.nextDouble();
		
		if(a % 2 == 0){
			System.out.println("A raiz do valor digitado é: " + Math.sqrt(a));
			
		}else {
			System.out.println("O valor digitado ao quadrado é: " + Math.pow(a, 2));
		}
			
			
	}

}
