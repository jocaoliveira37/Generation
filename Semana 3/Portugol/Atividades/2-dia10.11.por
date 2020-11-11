programa
{
	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		inteiro vetor[10],
		real z = 0, y = 0
		inteiro maior = 0, vezes = 0

		para (inteiro posicao = 0; posicao < 10; posicao ++)
		{
			vetor[posicao] = util.sorteia(1,6)
			y = (y + vetor[posicao])	
			se (vetor[posicao] > maior)
				{
				 maior = vetor[posicao]		
				}
		}
		para (inteiro posicao = 0; posicao < 10; posicao ++)
		{
			escreva ("\no número sorteado da posição ", posicao, " foi ", vetor[posicao])		
		}
		escreva ("\n O vetor é: ")
		para (inteiro posicao = 0; posicao < 10; posicao ++)
		{
			escreva ("[ ", vetor[posicao], " ] ")	
			se (vetor[posicao] == maior)
			{
				vezes ++	
			}
		}
		
		z = y/10
		escreva ("\nA média aritmética é ", z)
		escreva ("\nO maior número foi ", maior, " e apareceu ", vezes ," vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 778; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */