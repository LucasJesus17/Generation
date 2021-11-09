package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c)
			System.out.println("O C é o maior valor: " + c);
		
		else if(b<=a && a<=c)
			System.out.println("O C é o maior valor: " + c);
		
		else if(b<=c && c<=a)
			System.out.println("O A é o maior valor: " + a);
		
		else if(c<=b && b<=a)
			System.out.println("O A é o maior valor: " + a);
		
		else if(c<=a && a<=b)
			System.out.println("O B é o maior valor: " + b);
	
		else if(a<=c && c<=b)
			System.out.println("O B é o maior valor: " + b);
		else
			System.out.println("Valores iguais");
	}

}
