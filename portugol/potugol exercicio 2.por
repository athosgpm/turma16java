
programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro questao
		escreva("\n\nQual questão vc quer fazer: \n")
		leia(questao)

		escolha(questao)
		{
			caso 1:
			questao1()
			pare
			
			caso 2:
			questao2()			
			pare

			caso 3:
			questao3()			
			pare

			caso 4:
			questao4()			
			pare

			caso 5:
			questao5()			
			pare

			caso 6:
			questao6()			
			pare
			
			caso 7:
			questao7()			
			pare

			caso 8:
			questao8()			
			pare

			caso contrario:
			escreva("\nopção invalida!\n")
			inicio()
		}
	}	
//Questão 01
	funcao questao1()
	{
		real P,E, M

		escreva("insira o peso do tomate: ")
		leia(P)
		
		se (P > 50.0)
		{
			E = P-50.0
			M = E*4.0
			escreva("O peso excedente é de: "+E+"Ovalor da sua multa é de: "+M)
		}
		senao se (P <= 50.0 e P > 0)
		{
			E = 0.0
			M = 0.0
			escreva("seu peso esta dentro do limite,\nvalor excedente: "+E+" valor da multa: "+M)
		}
		senao
		{
			escreva("ERRO: valor invalido") 
		}
	}
//Questão 02
	funcao questao2()
	{
		real C, N, E, salario
		
		escreva("insira o código do operario: ")
		leia(C)
		escreva("insira o numero de horas trabalhadas: ")
		leia(N)

		se (N > 50.0)
		{
			E = (N-50.0)*20
			salario = E+500
			escreva("O seu salario é de: "+salario+"Deste valor bonus de horas excedentes é de: "+E)
		}
		senao se (N <= 50.0 e N > 0)
		{
			E = 0.0
			salario = N*10
			escreva("O seu salario é de: "+salario)
		}
		senao
		{
			escreva("ERRO: valor invalido") 
		}
	}
//Questão 03
	funcao questao3()
	{
		real n1, n2, n3, n4

		escreva("insira o valor do numero 01 ")
		leia(n1)
		escreva("insira o valor do numero 02 ")
		leia(n2)
		escreva("insira o valor do numero 03 ")
		leia(n3)
		escreva("insira o valor do numero 04 ")
		leia(n4)

		n1 *= n1
		n2 *= n2
		n3 *= n3
		n4 *= n4

		se (n3>=1000)
		{
			escreva("\nO terceiro numero '"+(Matematica.raiz(n3,2))+"' tem potencia quadratica maior que 1000, possuindo o valor de: "+n3)
		}
		senao
		{
			escreva("\nO terceiro numero tem potencia menor que 1000\n")
			escreva("\nO primeiro numero '"+(Matematica.raiz(n1,2))+"' tem potencia quadratica no valor de: "+n1)
			escreva("\nO primeiro numero '"+(Matematica.raiz(n2,2))+"' tem potencia quadratica no valor de: "+n2)
			escreva("\nO primeiro numero '"+(Matematica.raiz(n3,2))+"' tem potencia quadratica no valor de: "+n3)
			escreva("\nO primeiro numero '"+(Matematica.raiz(n4,2))+"' tem potencia quadratica no valor de: "+n4)
		}
	}
//Questão 04
	funcao questao4()
	{
		inteiro numero

		escreva("escreva o numero inteiro: ")
		leia(numero)

		se (numero%2 == 0)
		{
			se (numero > 0)
			{
				escreva("o numero '"+numero+"' é par e positivo") 
			}
			senao se (numero == 0)
			{
				escreva("o numero '"+numero+"' é par e neutro")
			}
			senao
			{
				escreva("o numero '"+numero+"' é par e negativo")
			}
		}
		senao
		{
			se (numero > 0)
			{
				escreva("o numero '"+numero+"' é impar e positivo") 
			}
			senao
			{
				escreva("o numero '"+numero+"' é impar e negativo")
			}
		}
	}
//Questão 05
	funcao questao5()
	{
		real indice

		escreva("insira o atual valor do indice de poluição: ")
		leia(indice)

		se(indice < 0.3)
		{
			escreva("limite do indice de poluição dentro do aceitavel")
		}
		senao se (indice < 0.4 e indice >= 0.3)
		{
			escreva("as indústrias do 1º grupo estão intimadas a suspenderem suas atividades")
		}
		senao se (indice < 0.5 e indice >= 0.4)
		{
			escreva("as indústrias do 1º e 2º grupo estão intimadas a suspenderem suas atividades")
		}
		senao se (indice > 0.5)
		{
			escreva("todos os guros de indústrias estão intimadas a suspenderem suas atividades")
		}
		senao
		{
			escreva("valor inserido é invalido")
		}
	}
//Questão 06
	funcao questao6()
	{
		real idade

		escreva("insira idade do nadador: ")
		leia(idade)

		se(idade >= 5 e idade <= 7)
		{
			escreva("sua categoria de natação é a categoria 'Infantil A'")
		}
		senao se (idade >= 8 e idade <= 11)
		{
			escreva("sua categoria de natação é a categoria 'Infantil B'")
		}
		senao se (idade >= 12 e idade <= 13)
		{
			escreva("sua categoria de natação é a categoria 'Juvenil A'")
		}
		senao se (idade >= 14 e idade <= 17)
		{
			escreva("sua categoria de natação é a categoria 'Juvenil B'")
		}
		senao se (idade >= 18)
		{
			escreva("sua categoria de natação é a categoria 'Adultos'")
		}
		senao
		{
			escreva("Você não pode competir na natação com o valor de idade inserido")
		}
	}
//Questão 07
	funcao questao7()
	{
		real base, altura, area

		escreva("escreva o valor da base do triangulo ")
		leia(base)
		escreva("escreva o valor da altura do triangulo ")
		leia(altura)

		se (base > 0 e altura > 0)
		{
			area = base*altura/2
			escreva("o valor da area do triangulo é de: "+area)
		}
		senao se (base < 0 e altura > 0)
		{
			escreva("o valor inserido para a base do triangulo é incoerente")
		}
		senao se (base > 0 e altura < 0)
		{
			escreva("o valor inserido para a altura do triangulo é incoerente")
		}
		senao
		{
			escreva("Os valores inseridos são incoerentes")
		}
	}
//Questão 08
	funcao questao8()
	{
		real N

		escreva("insira o valor da variavel: ")
		leia(N)

		se (N > 100.0)
		{
			escreva("o numeor inserio é maior que 100, possuindo um valor de: "+N)
		}
		senao
		{
			N = 0.0
			escreva("o numero inserido é menor que ou igual a 100, valor retornado: "+N)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */