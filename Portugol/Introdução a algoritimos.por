programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro menu
		inteiro dia, mes, ano, resultado
		inteiro segundos, minutos, horas
		inteiro a, b, c
		real s, r, d
		real nota1, nota2, nota3, media
		real x1, x2, y1, y2, x, y
		inteiro a1, b1, c1, d1, e1, f1, x3, y3
		real distribuidor = 0.28 , impostos = 0.45
		inteiro fabrica, carro
faca{
		escreva("\nDigite a alternativa escolhida de 0 a 7: ")
		leia(menu)
		resultado = 0
		dia = 0
		d  = 0
	escolha(menu){
		
		
			caso 0:
		escreva("\nDigite o dia de Nascimento: ")
		leia(dia)
		
		escreva("\nDigite o mes de Nascimento: ")
		leia(mes)
		
		escreva("\nDigite o ano de Nascimento: ")
		leia(ano)



		
		resultado = dia - 27
		//resultado = -7
		resultado =  resultado + ((mes - 10)*31)
		//resultado = -162
		resultado = resultado + ((ano - 2021)*365)
		
		escreva("\nResultado expresso em dia: ",resultado * -1)
		escreva("\n")
		pare
		
			caso 1:
			
		escreva("\nDigite seu nascimento expresso em dias: ")
		leia(dia)

		ano = dia/365
		ano = 2021 - ano

	
		
		mes = ano*12
	
		

		escreva("O dia que você nasceu foi: ", dia , "O mes que você nasceu foi: ", mes , "O ano que você nasceu foi: ", ano )
		escreva("\n")
		pare
			caso 2:

		escreva("\nDigite o evento expresso em segundos: ")
		leia(segundos)
		
		horas = segundos/3600
		minutos = horas*60

		escreva("O tempo em segundos é: ", segundos , "O tempo em minutos é: ", minutos , "O tempo em horas é: ", horas )
		escreva("\n")
		pare

			caso 3:
		escreva("\nDigite o valor de A: ")
		leia(a)
		escreva("\nDigite o valor de B: ")
		leia(b)
		escreva("\nDigite o valor de C: ")
		leia(c)

		r = (a+b)
		r = r * r
		
		s = (b+c)
		s = s * s 
		
		d = (r+s)/2
		
		escreva("O resultado é: ", d)
		escreva("\n")
		pare
		
		caso 4:
		
		escreva("\nDigite o valor da nota 1: ")
		leia(nota1)
		escreva("\nDigite o valor da nota 2: ")
		leia(nota2)
		escreva("\nDigite o valor da nota 3: ")
		leia(nota3)

		media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5)
		media  = media/(2 + 3 + 5)
		
		escreva("Sua nota final é: ", media)
		escreva("\n")
		pare
		
		caso 5:
		
		escreva("\nDigite o valor x1: ")
		leia(x1)
		escreva("\nDigite o valor x2: ")
		leia(x2)
		escreva("\nDigite o valor y1: ")
		leia(y1)
		escreva("\nDigite o valor y2: ")
		leia(y2)

		
		x = x2 - x1
		x = x * x
		
		y = y1 - y2
		y = y * y
		d = x + y
		d = mat.raiz(d, 2.0)

		escreva("A raiz dos valores é: ", mat.arredondar(d, 2))
		escreva("\n")
		pare
		
		caso 6:
		
		escreva("\nDigite o valor A: ")
		leia(a1)
		escreva("\nDigite o valor B: ")
		leia(b1)
		escreva("\nDigite o valor C: ")
		leia(c1)
		escreva("\nDigite o valor D: ")
		leia(d1)
		escreva("\nDigite o valor E: ")
		leia(e1)
		escreva("\nDigite o valor F: ")
		leia(f1)

		x3 = (c1*e1 - b1*f1)/(a1*e1 - b1*d1)
		y3 = (a1*f1 - c1*d1)/(a1*e1 - b1*d1)

		escreva("\nO resultado de X é: ", x3 , "O resultado de Y é: ", y3)
		escreva("\n")
		pare
		
		caso 7:
		escreva("\nDigite o custo de fabrica: ")
		leia(fabrica)

		carro = (fabrica*distribuidor) + (fabrica*impostos)
		carro = fabrica + carro

		escreva("Custo do consumidor: ", carro)
		escreva("\n")
		pare
		
		caso contrario:
		pare
			
			
		}

		}enquanto(menu<8)




		
		
	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */