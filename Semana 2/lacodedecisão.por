programa
{
	
	funcao inicio()
	{
		cadeia codigo
		real horasTrabalhadas, valor
		escreva("Qual o codigo do funcionário: ")
		leia(codigo)
		escreva("Quantas horas você trabalhou: ")
		leia(horasTrabalhadas)
					
		se (horasTrabalhadas > 50)
		{
			real valorHoras = 50 * 10
			real excedente = horasTrabalhadas - 50
			real valorExtra = excedente * 20
			escreva ("O funcionário ", codigo, " recebeu de salário R$", valorHoras, " e o extra foi de R$", valorExtra, " referente a ", excedente, " horas excedentes")		
		}
		senao
		{
			real valorHoras = 10 * horasTrabalhadas
			escreva (" O funcionário ", codigo, " recebeu de salário R$", valorHoras)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */