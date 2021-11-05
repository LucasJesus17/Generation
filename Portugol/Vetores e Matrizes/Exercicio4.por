programa
{
	
	funcao inicio()
	{
		inteiro m[3][3], m2 = 0, i , j, m1 = 0

		para(i = 0; i < 3; i++){
		para(j = 0; j < 3; j++){
		escreva("\nDigite a posição ", i+1, " - ", j+1, " da  matriz: " )
		leia(m[i][j])

		
		m2 = m2 + m[i][j]

		se(i == j){
			m1 = m1 + m[i][j]
			
		}
		}
		}

		escreva("\nO valor total da matriz é: ",m2)
		escreva("\nO valor da diagonal principal é: ", m1)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = 17, 6, 23, 24, 10, 11, 14;
 * @SIMBOLOS-INSPECIONADOS = {m, 6, 10, 1}-{m2, 6, 19, 2}-{m1, 6, 34, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */