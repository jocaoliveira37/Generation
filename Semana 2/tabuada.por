programa
{
	
	funcao inicio()
	{
		inteiro contador, tabuada, resultado
		escreva("Qual número você quer ver a tabuada: ")
		leia(tabuada)
		limpa()
		para ( contador= 1; contador<=10; contador ++){
			
		
			resultado = contador * tabuada
			escreva("\n", contador, " X ", tabuada, " = ", resultado)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */