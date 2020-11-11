programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro x1, y1 , x2, y2, distancia
		escreva ("Coordenada X do Ponto 1: ")
		leia(x1)
		escreva ("Coordenada Y do Ponto 1: ")
		leia(y1)
		escreva ("Coordenada X do Ponto 2: ")
		leia(x2)
		escreva ("Coordenada Y do Ponto 2: ")
		leia(y2)
		distancia = mat.raiz(mat.potencia(x2 - x1, 2) + mat.potencia( y2 -y1, 2), 2) 
		escreva ("A distância entre os vetores é: ", distancia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */