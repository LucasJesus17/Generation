programa
{
	
	funcao inicio()
	{

	real v[5], maiorValor = 0
	inteiro i
	
	para(i=0; i < 5; i++){
		escreva("Digite a ", i+1 , "ª pontuação: ")
		leia(v[i])
	}
	
	para(i=0; i < 5; i++){
		escreva("\nA ",i+1 ,"ª digitado é: " + v[i])

		se(maiorValor < v[i]){
			maiorValor = v[i]
		}
	}

	escreva("\nA maior pontuação digitada foi: ", maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */