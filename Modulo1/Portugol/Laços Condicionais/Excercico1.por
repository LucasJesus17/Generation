programa
{
	
	funcao inicio()
	{
	inteiro p
	real m, E
	
	escreva("Digite o peso dos tomates: ")
	leia(p)
	
	E = p - 50
	m = E  *4
	
	se(p > 50){
	

	escreva("O peso excedido é: ", E, "Kg A multa será de: ", m,"R$")
	
		}senao{
	escreva("Não se Preocupe não houve peso excedido ou multas")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */