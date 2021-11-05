programa
{
	
	funcao inicio()
	{
	
	inteiro filhos, populacao = 0
	real salario, maiorSalario = 0.0, mediaSalarial = 0.0, percentual = 0
	
	
	
		para(inteiro i = 1; i <= 20; i++){
			escreva("Digite o salario do ", i ," habitantes: ")
			leia(salario)
			escreva("Digite o numero de filhos do habitante " + i + ": " )
			leia(filhos)

			populacao = populacao + filhos
			mediaSalarial = mediaSalarial + salario
			
			se(salario > maiorSalario){
				maiorSalario = salario
			}

			se(salario <= 100.00){
			percentual++
			}
			
			se(i == 20){
			populacao = populacao + 20
			percentual = (percentual/20)*100
			
			escreva("Media da Populacao ", (populacao) / 20, " \nO Maior salario foi: ", maiorSalario , " \nA Media salarial foi: ", mediaSalarial/20, "\nO percentual de salarios acima de 100R$ é: ", percentual , "%")
			}
		}









		

			
			
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */