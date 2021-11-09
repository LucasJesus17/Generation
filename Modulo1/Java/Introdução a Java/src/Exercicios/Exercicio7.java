package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		float a,b,c,d,e,f,x,y;
		
	System.out.println("Digite o valor de A: ");
	a = ler.nextFloat();
	System.out.println("Digite o valor de B: ");
	b = ler.nextFloat();
	System.out.println("Digite o valor de C: ");
	c = ler.nextFloat();
	System.out.println("Digite o valor de D: ");
	d =  ler.nextFloat();
	System.out.println("Digite o valor de E: ");
	e = ler.nextFloat();
	System.out.println("Digite o valor de F: ");
	f = ler.nextFloat();
	

	x = (c*e - b*f)/(a*e - b*d);
	y = (a*f - c*d)/(a*e - b*d);
	
	System.out.println("\nO resultado de X é: "+ x + "O resultado de Y é: " + y);
	
	}
	
}
