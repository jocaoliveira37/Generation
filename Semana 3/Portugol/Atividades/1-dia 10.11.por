programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		inteiro vetor[5], x = 0

		para ( inteiro posicao = 0; posicao < 5; posicao ++)
		{
			escreva ("Escreva valor da posição ", posicao, ":")
			leia(vetor[posicao]),
			se (x < vetor[posicao])
			{
				x = vetor[posicao]			
			}
			se (posicao == 4)
				{
				escreva("O maior valor foi: ", x)	
				}	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */