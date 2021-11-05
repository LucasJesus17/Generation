programa
{
	
	funcao inicio()
	{
	inteiro idade
		escreva("digite sua idade: ")
		leia(idade)

		se(idade >= 5 e idade <= 7){
			escreva("Infantil A")
		}senao se(idade >=8 e idade <= 11){
			escreva("Infantil B")
		}senao se(idade >=12 e idade <= 13){
			escreva("juvenil A")
		}senao se(idade >=14 e idade <= 17){
			escreva("juvenil B")
		}senao se(idade > 17){
			escreva("Adulto")
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
 * @POSICAO-CURSOR = 82; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */