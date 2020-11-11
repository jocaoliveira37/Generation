programa
{
	
	funcao inicio()
	{
		inteiro a, segundos, minutos, horas
		escreva ("Quanto tempo, em segundos, levou para terminar o evento? ")
		leia(a)
		horas = a / 3600
		minutos = ( a % 3600) / 60
		segundos = (( a % 3600) % 60)
		escreva ("O tempo de trabalho foi de ", horas, " horas ", minutos, " minutos ", segundos, " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */