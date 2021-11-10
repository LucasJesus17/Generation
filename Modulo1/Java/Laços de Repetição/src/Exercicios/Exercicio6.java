package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int n, n2 = 0 , mult = 0;
		do {
		System.out.println("Digite o valor desejado ou 0 para sair");
		n = ler.nextInt();
		if(n == 0) {
			break;
		}
		if (n % 3 == 0) {
			mult++;
			n2 += n;
			System.out.println(n2);
			System.out.println(mult);
		}
		
		} while (n != 0);
		
		System.out.println("A media dos multiplos 3 é: " + n2/mult);
	}

}
