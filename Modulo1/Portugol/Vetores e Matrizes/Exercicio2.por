programa
{
	
	funcao inicio()
	{
		inteiro v[10], i, maior = 0
		real media=0.0
		para(i=0; i < 10; i++){
		escreva("\nDigite o ", i+1 ,"º lançado: ")
		leia(v[i])
		media = media + v[i]

		se(v[i] == 6){
			maior++
		}

		se(v[i] > 6 ou v[i] < 0){
			escreva("Desculpe o valor digitado é invalido para um dado")
			}
		}

		escreva("\nA media dos valores digitados foram: ", media)
		escreva("\nO valor maximo saiu: ", maior," vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */