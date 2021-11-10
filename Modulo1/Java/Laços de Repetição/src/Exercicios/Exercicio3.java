package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade = 0, a = 0, b = 0;
		
		while (idade != -99) {
			System.out.println("Digite a idade desejada");
			idade = ler.nextInt();
	
			if(idade < 21) {
				a++;
				
			}else if(idade > 50){
				b++;
			}
		}
		
		System.out.println("O numero de pessoas com mais de 21 anos foram: " + a);
		System.out.println("O numero de pessoas com mais de 50 anos foram: " + b);
	}

}
