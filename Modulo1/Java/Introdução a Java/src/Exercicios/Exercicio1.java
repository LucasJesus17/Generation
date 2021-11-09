package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dia, mes, ano, resultado;
		
		System.out.println("Digite o dia de Nascimento");
		dia = ler.nextInt();
		
		System.out.println("Digite o mes de Nascimento");
		mes = ler.nextInt();
		
		System.out.println("Digite o ano de Nascimento");
		ano = ler.nextInt();
		
		resultado = dia - 27;
		
		resultado =  resultado + ((mes - 10)*31);
		
		resultado = resultado + ((ano - 2021)*365);
		System.out.println("\nResultado expresso em dia: " + resultado * -1);
		

	}

}
