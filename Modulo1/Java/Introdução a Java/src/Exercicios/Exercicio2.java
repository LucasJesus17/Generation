package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int dia, mes, ano, resultado;
		
		System.out.println("Digite nascimento expresso em dias");
		dia = ler.nextInt();
		
		ano = dia/365;
		ano = 2021 - ano;
		mes = ano*12;

		System.out.println("O dia que você nasceu foi: " + dia + "O mes que você nasceu foi: " + mes + "O ano que você nasceu foi: " + ano );

		
	}

}
