package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	/*o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int pessoas = 0, idade, sexo, estado;
		int a = 0 , b = 0 , c = 0 , d = 0 , e = 0 , f = 0;
		
		while (pessoas < 1) {
			pessoas++;
			System.out.println("Digite a idade desta pessoa");
			idade = ler.nextInt();
			System.out.println("***Sexo***" + "\n1 - Feminino" + "\n2 - Masculino" + "\n3 - Outros");
			sexo = ler.nextInt();
			System.out.println("Como é esta pessoa? " + "\n1 - Calma(o)" + "\n2 - Nervosa(o)" + "\n3 - Agressiva(o)");
			estado = ler.nextInt();
			
			if(estado == 1) {
				a++;
			}if(sexo == 1 && estado == 2){
				b++;
			}if(sexo == 2 && estado == 3) {
				c++;
			}if(sexo == 3 && estado == 1) {
				d++;
			}if(idade > 40 && estado == 2) {
				e++;
			}if(idade < 18 && estado == 1) {
				f++;
			}
						
		}
		System.out.println("O número de pessoas calmas: " + a);
		System.out.println("O número de mulheres nervosas: " + b);
		System.out.println("O número de homens agressivos: " + c);
		System.out.println("O número de outros calmos: " + d);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + e);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + f);
		
	}

}
