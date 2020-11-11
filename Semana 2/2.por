programa
{
	
	funcao inicio()
	{
		inteiro dia, meses, anos, dias
		escreva ("Quantos dias você tem de aniversario? ")
		leia (dias)
		anos = dias/365 
		meses = (dias % 365) / 30
		dia = ( dias % 365) % 30
		
		escreva ("Sua idade é ", anos, " anos ", meses, " meses ", dia, " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */