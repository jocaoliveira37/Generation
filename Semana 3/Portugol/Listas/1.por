programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real l1, l2, l3, l4, l1q, l2q, l3q, l4q
		escreva ("Digite o primeiro nº: ")
		leia (l1)
		escreva ("Digite o segundo nº: ")
		leia (l2)
		escreva ("Digite o terceiro nº: ")
		leia (l3)
		escreva ("Digite o quarto nº: ")
		leia (l4)	
		limpa ()
		l1q = mat.potencia(l1, 2.0)
		l2q = mat.potencia(l2, 2.0)
		l3q = mat.potencia(l3, 2.0)
		l4q = mat.potencia(l4, 2.0)
		se (l3q >= 1000){
			escreva ("O Terceiro nº² é: ", l3q)
		}
		senao{
			escreva ("O Primeiro nº é: ", l1, " e seu ² é: ", l1q)
			escreva (" \nO Segundo nº é: ", l2, " e seu ² é: ", l2q)
			escreva (" \nO Terceiro nº é: ", l3, " e seu ² é: ", l3q)
			escreva (" \nO Quarto nº é: ", l4, " e seu ² é: ", l4q)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */