programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], i, j, m1[4][6], m2[4][6]
		para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
		escreva("\nDigite a posição ", i+1, " - ", j+1, " da 1ª  matriz: " )
		leia(n1[i][j])

		escreva("\nDigite a posição ", i+1, " - ", j+1, " da 2ª  matriz: " )
		leia(n2[i][j])

		m1[i][j] = n2[i][j] + n1[i][j]
		m2[i][j] = n2[i][j] - n1[i][j]
		}
		}
		escreva("Os Resultados da soma dos valores foram: \n")
				para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
			
			escreva(m1[i][j], "  ")


		
			}
			escreva("\n")
		}
		escreva("\nOs Resultados da diferença dos valores foram: \n")

				para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
		  
			escreva(m2[i][j], "  ")
			}
				escreva("\n")
			}
		}
			
		}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */