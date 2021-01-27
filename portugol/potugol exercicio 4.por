programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro questao
		escreva("\n\nQual questão vc quer fazer:\n 1 - Questão01\n",
		" 2 - Questão02\n 3 - Questão03a\n 4 - Questão03b\n 5 - Questão04\n",
		"\nDigite aqui: ")
		leia(questao)

		escolha(questao)
		{
			caso 1:
			limpa()
			Questao1()
			pare
			
			caso 2:
			limpa()
			Questao2()			
			pare

			caso 3:
			limpa()
			Questao3a()			
			pare

			caso 4:
			limpa()
			Questao3b()			
			pare

			caso 5:
			limpa()
			Questao4()			
			pare

			caso contrario:
			escreva("\nopção invalida!\n")
			inicio()
		}
	}
//QUESTÃO 01
	funcao Questao1()
	{
		real pontos[5],maior=0.0

		para(inteiro i=0;i<5;i++)
		{
			escreva("insira o valor da pontuação: ")
			leia(pontos[i])
			
			se(pontos[i]>maior)
			{
				maior = pontos[i]
			}
			
		}
		
		para(inteiro i=0;i<5;i++)
		{
			escreva("\nnumeros inseridos: ",pontos[i])
		}
		escreva("\n\no maior numero é: ",maior)
	}
//QUESTÃO 02
	funcao Questao2()
	{
		inteiro pontos[10], soma=0, maior=0, vezes=0

		para(inteiro i=0;i<10;i++)
		{
			pontos[i] = Util.sorteia(1, 6)

			soma += pontos[i]
			
			se(pontos[i]>maior)
			{
				vezes = 0
				maior = pontos[i]
			}
			
			se(pontos[i]==maior)
			{
				vezes++
			}

			escreva("O valor do ",i,"º Lançamento é de: ",pontos[i],"\n")
		}
		
		escreva("\nA media dos valores é: ",soma/10.0)
		escreva("\nO maior valor foi: ",maior,". E ele ocorreu: ",vezes," vezes.")
	}
//QUESTÃO 03A
	funcao Questao3a()
	{
		real N1[4][6], N2[4][6], M1[4][6]

		para(inteiro m=0;m<2;m++)
		{
			para(inteiro l=0;l<4;l++)
			{
				para(inteiro c=0;c<6;c++)
				{
					escreva("insira o valor da matriz N",(m+1),", Linha ",l," Coluna ",c,": ")
					
					se(m==0)
					{
						leia(N1[l][c])
					}
					
					se(m==1)
					{
						leia(N2[l][c])
					}
					
					M1[l][c] = N1[l][c]	+ N2[l][c]				
				}
			}
		}

		para(inteiro l=0;l<4;l++)
		{	
			escreva("\n")
			para(inteiro c=0;c<6;c++)
			{	
			escreva(" | ",M1[l][c]," | ")
			}
		}
		
	}
//QUESTÃO 03B
	funcao Questao3b()
	{
		real N1[4][6], N2[4][6], M1[4][6]

		para(inteiro m=0;m<2;m++)
		{
			para(inteiro l=0;l<4;l++)
			{
				para(inteiro c=0;c<6;c++)
				{
					escreva("insira o valor da matriz N",(m+1),", Linha ",l," Coluna ",c,": ")
					
					se(m==0)
					{
						leia(N1[l][c])
					}
					
					se(m==1)
					{
						leia(N2[l][c])
					}
					
					M1[l][c] = N1[l][c]	- N2[l][c]				
				}
			}
		}

		para(inteiro l=0;l<4;l++)
		{	
			escreva("\n")
			para(inteiro c=0;c<6;c++)
			{	
			escreva(" | ",M1[l][c]," | ")
			}
		}
	}
//QUESTÃO 04
	funcao Questao4()
	{
		real N1[3][3], somaTotal=0.0, somaDiagonal=0.0

		para(inteiro l=0;l<3;l++)
		{
			para(inteiro c=0;c<3;c++)
			{
				escreva("insira o valor da matriz, Linha ",l," Coluna ",c,": ")
				leia(N1[l][c])
               	
		     	somaTotal +=  N1[l][c]
               
              		se(l==c)
               	{
               		somaDiagonal += N1[l][c]
               	}
			}
		}
		escreva("\nA soma de todos os valores da matriz é: ",somaTotal)
		escreva("\nA soma de todos os valores da diagonal principal da matriz é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 48, 7, 6}-{maior, 48, 17, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */