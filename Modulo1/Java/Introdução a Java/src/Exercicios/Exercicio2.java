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

		System.out.println("O dia que voc� nasceu foi: " + dia + "O mes que voc� nasceu foi: " + mes + "O ano que voc� nasceu foi: " + ano );

		
	}

}
