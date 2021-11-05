programa
{
	
	funcao inicio()
	{
	
	inteiro a,b,c,d
	
	inteiro v,x,y,z
	
	escreva("Digite o 1º numero: ")
	leia(a)
	escreva("Digite o 2º numero: ")
	leia(b)
	escreva("Digite o 3º numero: ")
	leia(c)
	escreva("Digite o 4º numero: ")
	leia(d)

	v = a*a
	x = b*b
	y = c*c
	z = d*d

	se(y >= 1000){
	escreva("O valor resultante é: ", y , "O valor base foi: ", c)
	
		}senao{
		escreva("\nO valor digitado foi: ", a ," e ao quadrado é: ", v)
		
		escreva("\nO valor digitado foi: ", b ," e ao quadrado é: ", x)
		
		escreva("\nO valor digitado foi: ", c ," e ao quadrado é: ", y)
		
		escreva("\nO valor digitado foi: ", d ," e ao quadrado é: ", z)
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */