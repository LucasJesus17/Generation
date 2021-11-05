programa
{
	
	funcao inicio()
	{
		real p

	escreva("digite o indice de poluição: ")
	leia(p)


		se(p >= 0.3 e p < 0.4 ){
			escreva("favor grupo 1 se atentar ao indice de poluição, o mesmo foi excedido ao valor permitido")
		}senao se(p >= 0.4 e p < 0.5){
			
			escreva("Favor grupo 1 e 2 se atentar ao indice de poluição, o mesmo foi excedido ao valor permitido")
			
		}senao se(p >= 0.5){
			
			escreva("favor todos os grupo se atentarem ao indice de poluição, o mesmo foi excedido ao valor permitido")			
		}senao se(p >= 0.05 e p <= 0.25){
			
			escreva("O indice de poluição esta dentro do aceitável")			
		}senao{
			escreva("valor invalido")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */