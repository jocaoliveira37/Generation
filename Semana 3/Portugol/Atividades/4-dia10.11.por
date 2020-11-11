programa
{
	
	funcao inicio()
	{
		const inteiro linha = 3, coluna = 3
		inteiro N1[linha][coluna], N2 [linha][coluna], l, c 
		inteiro diag = 0, sum = 0
		para (l = 0; l < linha; l ++)
		{
			para(c = 0; c < coluna; c ++)
			{
				escreva("Adicione um valor: ")
				leia (N1[l][c])
				sum += N1[l][c]
				se (l==c)
				{
				 diag +=N1[l][c]
 				}
			}
		}
		escreva ("\nA soma de todos os valores da matriz é " + sum)
		escreva (" e a soma dos valores da diagonal principal é " + diag + ".")
 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */