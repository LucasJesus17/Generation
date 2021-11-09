package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double impostos = 0.45 , distribuidor = 0.28, fabrica, carro;

		System.out.println("Digite o custo de fabrica");
		fabrica = ler.nextDouble();
		
		carro = (fabrica*distribuidor) + (fabrica*impostos);
		carro = fabrica + carro;
		
		System.out.println("Cuto do consumidor: " + carro);

	}

}
