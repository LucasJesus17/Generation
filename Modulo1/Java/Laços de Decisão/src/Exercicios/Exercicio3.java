package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14)
			System.out.println("Infantil");
		
		else if(idade >= 15 && idade <= 17)
			System.out.println("Juvenil");
		
		else if (idade >= 18 && idade <= 25) 
			System.out.println("Adulto");
		
		else System.out.println("Valor invalido");
	}

}
