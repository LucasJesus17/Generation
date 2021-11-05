programa
{
	
	funcao inicio()
	{
		inteiro C, N 
		real E , salario
		
		escreva("Digite o codigo de trabalhador: ")
		leia(C)
		
		escreva("Digite o numero de horas trabalhadas: ")
		leia(N)

		
		se(N > 50){
		E = N - 50
		E = E * 20
		salario = 10 * 50
		E = E + salario
		escreva("O salario com as horas extras: ", E,"R$")

		}senao{
		
		E = 0
		salario = N * 10
		escreva("O seu salario é de: ", salario,"R$")
		
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */