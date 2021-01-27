programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{

	inteiro questao
		escreva("\n\nQual questão vc quer fazer: \n")
		leia(questao)

		escolha(questao)
		{
			caso 1:
			ParaQuestao1()
			pare
			
			caso 2:
			ParaQuestao2()			
			pare

			caso 3:
			EnquantoQuestao1()			
			pare

			caso 4:
			EnquantoQuestao2()			
			pare

			caso 5:
			FacaQuestao1()			
			pare

			caso 6:
			FacaQuestao2()			
			pare

			caso contrario:
			escreva("\nopção invalida!\n")
			inicio()
		}
	}

//###############	PARA

//PARA - Questão 01
	funcao ParaQuestao1()
	{
		real salario, numeroFilhos, mediaSalario=0.0, mediaFilhos=0.0, salario100=0.0, maiorSalario=0.0
		
		para(inteiro i=0;i<20;i++)
		{
			escreva("\nInsira o salario do cidadão ",i,": ")
			leia(salario)
			escreva("\nInsira a quantidade de filhos do cidadão ",i,": ")
			leia(numeroFilhos)
			
			mediaSalario = mediaSalario + salario
			mediaFilhos += numeroFilhos
			
			se(salario <= 100)
			{
				salario100 += 1 
			}
			
			se(i>0)
			{
				se(salario > maiorSalario)
				{
					maiorSalario = salario
				}
			}
		}

		escreva("\nA media de salario da população é: "+(mediaSalario/20))
		escreva("\nA media do numero de filhos da população é: "+(mediaFilhos/20))
		escreva("\nO maior salario da população é: "+maiorSalario)
		escreva("\nO percentual de pessoas com salario até 100 é: "+(salario100*100/20)+"%")
	}
	
//PARA - Questão 02
	funcao ParaQuestao2()
	{
		inteiro soma=0

		para(inteiro numero=0;numero<500;numero++)
		{			
			se(numero%2 != 0.0)
			{
				soma+=numero
			}
			numero+=2

		escreva("\n",numero)
		}
		escreva(soma)
	}

//###############	ENAQUANTO

//ENAQUANTO - Questão 01
	funcao EnquantoQuestao1()
	{
		inteiro i = 0
		real numero=0.0, media=0.0

		
		enquanto (numero>=0.0)
		{
			escreva("insira o numero desejado: ")
			leia(numero)
			
			se(numero>=0.0)
			{
				i++
				media += numero
			}
		}
		
		escreva("\nVocê escrveu um total de: ",i," numeros")
		escreva("\nO somatório dos seus numeros é de: ",media)
		escreva("\nA media dos seus numeros é de: ",(media/i),"\n")
	}
	
//ENQUANTO - Questão 02
	funcao EnquantoQuestao2()
	{
		real numero

		escreva("insira o numero: ")
		leia(numero)
		escreva("\n"+numero)
		
		enquanto(numero<100)
		{
			numero*=3
			escreva("\n"+numero)
		}
		
	}

//###############	FAÇA...ENAQUANTO

//FAÇA...ENAQUANTO - Questão 01
	funcao FacaQuestao1()
	{
		inteiro numero = 233
		
		faca
		{			
			se(numero<300 ou numero>400)
			{
				escreva("\n",numero)
				numero+=5
			}
			senao se(numero>=300 e numero<=400)
			{
				escreva("\n",numero)
				numero+=3
			}
		}enquanto(numero<=456) 
	}
	
//FAÇA...ENAQUANTO - Questão 02
	funcao FacaQuestao2()
	{
		inteiro numero 
		inteiro soma=0 
		
		escreva("insira o numero: ") 	
		leia(numero)				
		faca 					
		{
			soma+=numero			
			numero--				
		}enquanto(numero>=0)  		
		
		escreva("\n",soma)			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2645; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */