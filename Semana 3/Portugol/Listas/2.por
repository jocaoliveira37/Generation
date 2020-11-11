programa
{
	
	funcao inicio()
	{
		inteiro idade, opcao = 0
		escreva ("Qual a sua idade? ")
		leia(idade)
		limpa ()
		se (5 <= idade e idade <= 7) 
		{
			escreva("Infantil A")
		}
		senao se (8 <= idade e idade <= 11)
		{
			escreva("Infantil B")
		}
		senao se (12 <= idade e idade <= 13)
		{
			escreva ("Juvenil A")
		}
		senao se(14 <= idade e idade <= 17)
		{
			escreva ("Juvenil B")
		}
		senao se ( idade >= 18)
		{
			escreva ("Adultos")
		}
		senao 
		{
			escreva ("Idade não encontrada")	
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */