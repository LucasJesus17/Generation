programa
{
	
	funcao inicio()
	{
	
	inteiro soma = 0, cont = 0, media = 0, n = 0
		enquanto(n >= 0){
		
		escreva("Digite o valor desejado: ")
		leia(n)

		se(n < 0){
		pare
		}
		cont++
		soma = soma + n
		}
		media = soma/cont
		
		escreva("A soma dos valores foi: ", soma ," \nA Media dos valores foi: ", media , "\nVocê digitou: ", cont, " numeros" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */