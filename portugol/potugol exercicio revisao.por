programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		inteiro questao
		escreva("\n\nQual questão vc quer fazer:\n 1 - Questão 01\n",
		" 2 - Questão 02\n 3 - Questão 03\n 4 - Questão 04\n 5 - Questão 05\n",
		" 6 - Questão 04\n \nDigite aqui: ")
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
			Questao3()			
			pare

			caso 4:
			limpa()
			Questao4()			
			pare

			caso 5:
			limpa()
			Questao5()			
			pare

			caso 6:
			limpa()
			Questao6()			
			pare

			caso contrario:
			escreva("\nopção invalida!\n")
			inicio()
		}
	}

//QUESTÃO 01
	funcao Questao1(){
		real valor=0.0, totalPagar=0.0
		inteiro opcao = 0
		
		escreva("insira o valor da etiqueta do produto: ")
		leia(valor)

		faca{
			limpa()
		escreva("valor do produto: ", valor,"\n",
			"\nescolha a forma de pagamento:\n",
			"\n1. 1 À vista em dinheiro ou cheque,  20% de desconto - ",m.arredondar(valor*0.8, 2),
			"\n2 À vista no cartão de crédito, 15% de desconto - ",m.arredondar(valor*0.85, 2),
			"\n3 Em duas vezes, sem juros - ",m.arredondar(valor, 2),
			"\n4 Em três vezes, juros de 10% - ",m.arredondar(valor*1.1, 2),
			"\nInsira aqui: ")
		leia(opcao)
		se(opcao<1 ou opcao>4){
			limpa()
			escreva("Opção invalida")
			u.aguarde(1500)
			limpa()
		}
		}enquanto(opcao<1 ou opcao>4)
		
		se(opcao==1){
			totalPagar=m.arredondar(valor*0.8, 2)
		}senao se(opcao==2){
			totalPagar=m.arredondar(valor*0.85, 2)
		}senao se(opcao==3){
			totalPagar=m.arredondar(valor, 2)
		}senao se(opcao==4){
			totalPagar=m.arredondar(valor*1.1, 2)
		}

		escreva("\n\nO total a ser pago é de: ",totalPagar)
	}

//QUESTÃO 02
	funcao Questao2(){
		real peso=0.0, altura=0.0
		cadeia condicao = ""
		
		faca{
		escreva("Este calculo de IMC considera uma pessoa adulta\n")
		escreva("Informe o seu peso (Kg): ")
		leia(peso)
		escreva("Informe a sua  altura (m): ")
		leia(altura)
		
		se(peso<=0 ou altura<=0){
			limpa()
			escreva("Você digitou um numero negativo ou zero, tente novamente")
			u.aguarde(1500)
			limpa()
		}
		}enquanto(peso<=0 ou altura<=0)
		
		limpa()
		se(peso/(altura*2)<18.5){
			condicao = "Abaixo do peso"
		}senao se(peso/(altura*2)>=18.5 e peso/(altura*2)<=25){
			condicao = "Peso normal"
		}senao se(peso/(altura*2)>25 e peso/(altura*2)<=30){
			condicao = "Acima do peso"
		}senao se(peso/(altura*2)>30){
			condicao = "Obeso"
		}
		
		escreva("Peso: ",peso,"\tAtltura: ",altura,
		"\n\nSegundo o calculo do IMC sua condição fisica é de: ",condicao)
	}

//QUESTÃO 03
	funcao Questao3(){
		real numero = 0.0
		inteiro intervalo1=0,intervalo2=0,intervalo3=0,intervalo4=0 

		faca{
			escreva("Insira um numero [1-100] (para encerrar a contagem insira um numero negativo): ")
			leia(numero)
			se(numero>=0 e numero<=25){
				intervalo1++
			}senao se(numero>=26 e numero<=50){
				intervalo2++
			}senao se(numero>=51 e numero<=75){
				intervalo3++
			}senao se(numero>=76 e numero<=100){
				intervalo4++
			}senao se(numero>100){
				escreva("Numero fora do intervalo estabelecido!\n")
			}
		}enquanto(numero>=0)
		limpa()
		escreva("O numero inserido estava entre,",
				"\n[0, 25] - ",intervalo1," vezes",
				"\n[26, 50] - ",intervalo2," vezes",
				"\n[51, 75] - ",intervalo3," vezes",
				"\n[76, 100] - ",intervalo4," vezes")
	}

//QUESTÃO 04
	funcao Questao4(){
		//soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		real soma=0.0
		real j=1.0
		para(real i=1.0;i<=50.0;i++){
			soma += j/i
			j+=2
		}

		escreva("O resultado da soma da sequencia,\n1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50\nÉ igual a: ",soma)
		
	}

//QUESTÃO 05
	funcao Questao5(){
		real vetor[5]
		inteiro condicao=0

		para(inteiro i=0;i<5;i++){
			escreva("insira um valor (real) para a ",(i+1),"ª posição do vetor: ")
			leia(vetor[i])
		}
		
		faca{
			limpa()
			escreva("Insira o numero codigo:\n0 - Finalizar Programa\n1 - mostre o vetor na ordem direta",
			"\n2 - mostre o vetor na ordem inversa\n\nInsira Aqui: ")
			leia(condicao)
			se(condicao<0 ou condicao>2){
				limpa()
				escreva("Opção invalida!")
				u.aguarde(1500)
			}
		}enquanto(condicao<0 ou condicao>2)
		escreva("\n")
		se(condicao==1){
			para(inteiro i=0;i<5;i++){
				escreva(vetor[i],"\t")
			}
		}senao se(condicao==2){
			para(inteiro i=4;i>=0;i--){
				escreva(vetor[i],"\t")
			}
		}
	}

//QUESTÃO 06
	funcao Questao6(){
		real vetor[3], matriz[3][3], resultado[3]

		para(inteiro l=0;l<3;l++){
			escreva("insira um valor (real) para a ",(l+1),"ª posição do vetor: ")
			leia(vetor[l])
		}
		
		para(inteiro l=0;l<3;l++){
			para(inteiro c=0;c<3;c++){
				escreva("insira um valor (real) para a posição, linha ",(l+1),", coluna ",(c+1),", da matriz: ")
				leia(matriz[l][c])
			}
		}
		escreva("\n|\t")
		para(inteiro l=0;l<3;l++){
			resultado[l]=0.0
			para(inteiro c=0;c<3;c++){
				resultado[l]+=vetor[c]*matriz[c][l]
			}
			escreva(resultado[l],"\t|\t")
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4824; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 203, 7, 5}-{matriz, 203, 17, 6}-{resultado, 203, 31, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */