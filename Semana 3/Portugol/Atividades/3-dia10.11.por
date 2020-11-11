programa
{
	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		const inteiro linha = 4, coluna = 6
		inteiro N1[linha][coluna], N2 [linha][coluna], l, c 
		escreva ("N1: ")
		para (l = 0; l < linha; l ++)
		{
			escreva("\n")
			para (c = 0; c < coluna; c ++)
			{
				N1[l][c] = util.sorteia(0, 100)
				escreva ("[ " + N1[l][c] + " ]")
			}
		}
		escreva ("\n\nN2: ")
		para (l = 0; l < linha; l ++)
		{
			escreva("\n")
			para (c = 0; c < coluna; c ++)
			{
				N2[l][c] = util.sorteia(0, 100)
				escreva ("[ " + N2[l][c] + " ]")
			}
		}
		inteiro M1[linha][coluna], M2[linha][coluna]
		para (l = 0; l < linha; l ++)
		{
			para (c = 0; c < coluna; c ++)
			{
				M1[l][c] = N1[l][c] + N2[l][c]
				M2[l][c] = N1[l][c] - N2[l][c]
			}
		}
		escreva("\n")
		escreva ("\nResultado da somatória entre N1 e N2 (M1): ")
        para (l = 0; l < linha; l++)
        {
            escreva ("\n")
            para (c = 0; c < coluna; c++)
                escreva ("[ " + M1[l][c] + " ]")
        }
        escreva("\n")
        escreva ("\nResultado da subtração entre N1 e N2 (M1): ")
        para (l = 0; l < linha; l++)
        {
            escreva ("\n")
            para (c = 0; c < coluna; c++)
                escreva ("[ " + M2[l][c] + " ]")
        }
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */