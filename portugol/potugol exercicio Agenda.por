programa
{
	cadeia agenda[31][24]
	caracter continua
	inteiro aux = 1, aux2 = 1
	
	funcao inicio()
	{
		cadeia nome
		inteiro dia = 0, hora = 0
		logico continuar = verdadeiro
		inteiro codigo = 0
		escreva("Bem vindo! Por favor digite  seu nome: ")
		leia(nome)

		faca{
			escreva("Agenda de ",nome,":\n")
			cadastro(dia,hora,continuar)

			faca{
			
			escreva("Deseja continuar? [s/n]")
			leia(continua)
		
			codigo=1
			condicao(nome,codigo,dia,hora,continuar)
			
			}enquanto (aux==1)

			escreva("mostrar todos os eventos cadastrados? [s/n]: ")
			leia(continua)

			codigo=2
			condicao(nome,codigo,dia,hora,continuar)
	
			faca{
				escreva("\nreiniciar o programa? [s/n]: ")
				leia(continua)
	
				codigo=3
				condicao(nome,codigo,dia,hora,continuar)
			}enquanto(aux==1)
		}enquanto(aux2==1)
	}

	funcao condicao( cadeia nome, inteiro codigo,inteiro dia, inteiro hora, logico continuar)
	{
		se(continua == 'S' ou continua == 's'){	
			 se(codigo==1){
			 	cadastro(dia,hora,continuar)
			 	aux = 1
			 }
			 se (codigo==2){
			 	exibir(nome)
			 	aux = 1
			 }
			 se (codigo==3){
			 	aux = 0
			 	aux2 = 1
			 }
		}
		senao se(continua == 'N' ou continua =='n'){
			aux = 0
			se (codigo == 3){
			aux2 = 0
			}
		}
		senao{
			escreva("caracter invalido, tente novamente")
			aux = 1
		}
	}
	
	funcao cadastro(inteiro dia, inteiro hora, logico continuar)
	{
			escreva("Escolha um dia para o cadastro [1/31]: ")
			leia(dia)
			enquanto(dia<=0 ou dia>31){
			escreva("\ndia escolhido invalido!\n\nEscolha um dia para o cadastro [1/31]: ")
			leia(dia)
			}
			dia-=1

			escreva("Selecione a hora do envento [0/23]: ")
			leia(hora)
			enquanto(hora<0 ou hora>23){
			escreva("\nnumero inserido invalido,\n\nSelecione a hora do envento [0/23]: ")
			leia(hora)
			}
			
			escreva("Escreva o evento:\n\n")
			leia(agenda[dia][hora])
	}

	funcao exibir( cadeia nome)
	{
		escreva ("Olá, ",nome,", Os eventos cadastrados para a sua agenda são: \n")
		
		para(inteiro d = 0; d< 31; d++)
		{
			para(inteiro h = 0; h<24; h++)
			{
				se( agenda[d][h] != "")
				{
						escreva("Dia ",(d+1)," às ",h,":00h - ",agenda[d][h], "\n")
				}
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */