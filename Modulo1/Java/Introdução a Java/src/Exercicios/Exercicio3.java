package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int segundos, horas, minutos;
		
		System.out.println("Digite o evento em segundos");
		segundos = ler.nextInt();
		horas = segundos/3600;
		minutos = horas*60;
		
		System.out.println("O tempo em segundos é: " + segundos + "O tempo em minutos é: " + minutos + "O tempo em horas é: "+ horas);
		
		
	}
}
