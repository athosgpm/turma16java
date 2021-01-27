programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS", 
		"ATHOS GIOM DE PAIVA MESQUITA","C NDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA",
		"DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA",
		"DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS",
		"FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN",
		"GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS",
		"JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI",
		"KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT",
		"LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS",
		"MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI",
		"MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO",
		"PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA",
		"RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
		cadeia matricula[40], apr = " ------- "
		inteiro notas[40]
		caracter opcao
		logico seNao = falso, continuar = verdadeiro

		para(inteiro i=0;i<40;i++)
		{
			notas[i] = 99
		}
/*
 * logica interessante:
 * 01234567
 * 		 01234567
 * 		 	    ....
 * 		 	    
		para(inteiro i=0;i<40;i++){
			para(inteiro j=0;j<16;j++){	
				matricula[i] = ("G"+(j+1)+"-")
				i++
			}
			i--
		}
  *		
  * Matematica interessante:
  * se você percorrer dois numeros multiplos, cada qual na sua velocidade, ainda assim não haverá 
  * combinações repetidas
  * 
		para(inteiro i=0;i<40;i++){
			para(inteiro j=0;j<5;j++){	
				matricula[i] = (matricula[i]+(j+1))
				i++
			}
			i--
		}
*/

		para(inteiro i=0;i<40;i++){	
			matricula[i] = "G16-"+(i+1)
		}
		
		escreva("Matricula\tNota\tSituação\tNome do aluno\n\n")
		para(inteiro i=0;i<40;i++)
		{
			escreva(matricula[i],"\t\t",notas[i],"\t",apr,"\t",alunos[i],"\n")
		}

		

		faca{
			cadeia aluno
			escreva("\nDigite a matricula do aluno: ")
			leia(aluno)
			
			para(inteiro i=0;i<40;i++)
			{
				se(matricula[i]==aluno)
				{
					escreva("cadastre a nota do aluno ",alunos[i]," :")
					leia(notas[i])
	
					enquanto(notas[i]<0 ou notas[i]>10)
					{
						escreva("Nota invalida!\n\nCadastre a nota do aluno ",alunos[i]," :")
						leia(notas[i])
					}
	
					escreva("deseja continuar? S-SIM ou N-NÃO: ")
					leia(opcao)
				
					faca{
						se(opcao == 'S' ou opcao == 's')
						{	
							continuar = verdadeiro
					 		seNao = falso
						}
						senao se(opcao == 'N' ou opcao =='n')
						{
							continuar = falso
							seNao = falso
						}
						senao
						{
							escreva("caracter invalido, tente novamente")
							continuar = verdadeiro
							seNao = verdadeiro
						}
						}enquanto (seNao == verdadeiro)
				}
			}
		}enquanto(continuar == verdadeiro)
		
		
		escreva("Matricula\tNota\tSituação\tNome do aluno\n\n")
		para(inteiro i=0;i<40;i++)
		{
			se(notas[i]>8 e notas[i]!=99){
			apr="APROVADX"
			}senao se(notas[i]<=8 e notas[i]>=5){
			apr="EM ANALISE"
			}senao se(notas[i] == 99){
			apr=" ------- " 
			}senao{
			apr="REPROVADX"
			}
			
			escreva(matricula[i],"\t\t",notas[i],"\t",apr,"\t",alunos[i],"\n")
		}

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3033; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */