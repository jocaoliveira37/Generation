programa
{
	
	funcao inicio()
	{
		inteiro idade = 0, menorq21 = 0, maiorq50 = 0
		enquanto (idade != -99)
		{
			escreva ("\nDigite uma idade: ")
			leia (idade) 
			se (idade > 0 e idade < 21)
			{
				menorq21 ++
			}
			se (idade > 50)
			{
				maiorq50 ++
			}
		escreva ("Existem ", menorq21, " menores de 21 anos e ", maiorq50, " maiores de 50 anos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */