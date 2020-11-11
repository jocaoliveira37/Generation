programa
{
	
	funcao inicio()
	{
		inteiro cont, par = 0, imp = 0
		para ( cont = 1; cont <= 10; cont ++)
		{	
			limpa()
			inteiro i
			escreva ("\nDigite um número: ")
			leia(i)			
			se (i % 2 == 0)
			{
			escreva ("Número Par")
			par ++
			}
			senao
			{
			escreva("Numero Impar")
			imp ++		
			}
		}
		limpa()
		escreva ("\nExistem ", par, " números pares e ", imp, " números impares")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */