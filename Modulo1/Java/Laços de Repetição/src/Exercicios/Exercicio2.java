package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float n;
		int impar= 0 , par = 0;
		
	
		for (int i = 0 ; i < 10; i++) {
			System.out.println("Digite o valor desejado");
			n = ler.nextFloat();
			if(n%2 == 0) {
				par++;
			}else {
				impar++;
			}
					
		}
		
		System.out.println("Numero de pares digitados foram: " + par);
		System.out.println("Numeros de impares digitados foram: " + impar);
	}

}
