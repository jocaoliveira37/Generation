programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a, b, c
		real d, r, s
		escreva ("Valor de A: ")
		leia(a)
		escreva ("Valor de B: ")
		leia(b)
		escreva ("Valor de C: ")
		leia(c)
		r = mat.potencia(a + b, 2.0)
		s = mat.potencia(b + c, 2.0)
		d = (r + s) / 2.0
		escreva (" O valor de D é ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */