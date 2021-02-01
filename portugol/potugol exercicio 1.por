programa
{	
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro questao
		escreva("\n\nQual questão vc quer fazer: \n")
		leia(questao)

		se(questao==1)
		{
			anosDias()			
		}

		se(questao==2)
		{
			diasAnos()			
		}

		se(questao==3)
		{
			segundosHoras()			
		}

		se(questao==4)
		{
			calculo1()			
		}

		se(questao==5)
		{
			media()			
		}

		se(questao==6)
		{
			distancia()			
		}

		se(questao==7)
		{
			calculo2()			
		}

		se(questao==8)
		{
			carroNovo()			
		}

		senao
		{
			escreva("\nopção invalida!\n")
			inicio()
		}

	}

//Questão 01
	funcao anosDias()
	{
		inteiro anos, meses, dias
		escreva("Escreva quantos anos você tem: ")
		leia(anos)
		escreva("E quantos meses: ")
		leia(meses)
		escreva("E quantos dias: ")
		leia(dias)

		dias = (dias + meses*30 + anos*365)
		escreva("você viveu um total aproximado de "+dias+" dias")

		inicio()
	}
//Questão 02	
	funcao diasAnos()
	{
		inteiro anos, meses, dias
		escreva("Escreva quantos dias de vida você tem: ")
		leia(dias)

		anos = dias/365
		meses = (dias%365)/30
		dias =  (dias%365)%30
		escreva("você viveu aproximadamente: "+anos+"anos, "+meses+"meses, "+dias+"dias.")

		inicio()
	}
//Questão 03
	funcao segundosHoras()
	{
		inteiro horas, minutos, segundos
		
		escreva("Escreva quantos segundos durou o evento: ")
		leia(segundos)

		horas = segundos/3600
		minutos = (segundos%3600)/60
		segundos = (segundos%3600)%60
		escreva("o evento durou: "+horas+"horas, "+minutos+"minutos, "+segundos+"segundos")

		inicio()
	}
//Questão 04
	funcao calculo1()
	{
		real a, b, c, d, r, s

		escreva("Escreva o valor de a: ")
		leia(a)
		escreva("Escreva o valor de b: ")
		leia(b)
		escreva("Escreva o valor de c: ")
		leia(c)
		
		r = Matematica.potencia(a+b, 2)  
		s = Matematica.potencia(b+c, 2)  
		d = (r+s)/2
		
		escreva("Escreva o valor de a: "+d)

		inicio()
	}
//Questão 05
	funcao media()
	{
		real nota1, nota2, nota3, m

		escreva("Escreva o valor da primeira nota: ")
		leia(nota1)
		escreva("Escreva o valor da segunda nota: ")
		leia(nota2)
		escreva("Escreva o valor da terceira nota: ")
		leia(nota3)

		m = ((nota1*2)+(nota2*3)+(nota3*5))/10

		escreva("sua media é: "+m)

		inicio()
	}
//Questão 06
	funcao distancia()
	{
		real x1, x2, y1, y2, d

		escreva("Escreva o valor de x1: ")
		leia(x1)
		escreva("Escreva o valor de y1: ")
		leia(y1)
		escreva("Escreva o valor de x2: ")
		leia(x2)
		escreva("Escreva o valor de y2: ")
		leia(y2)
		
		d = Matematica.raiz((Matematica.potencia(x2-x1, 2)+Matematica.potencia(y2-y1, 2)), 2)
		escreva("A distancia entre os pontos P1 e P2 é: "+d)

		inicio()   
	}
//Questão 07
	funcao calculo2()
	{
		real a, b, c, d, E, f, x, y

		escreva("Escreva o valor de a: ")
		leia(a)
		escreva("Escreva o valor de b: ")
		leia(b)
		escreva("Escreva o valor de c: ")
		leia(c)
		escreva("Escreva o valor de d: ")
		leia(d)
		escreva("Escreva o valor de e: ")
		leia(E)
		escreva("Escreva o valor de f: ")
		leia(f)

		x = (c*E-b*f)/(a*E-b*d)
		y = (a*f-c*d)/(a*E-b*d)
		
		escreva("O valor de X é: "+x+"\nO valor de y é: "+y)

		inicio()
	}
//Questão 08
	funcao carroNovo()
	{
		real custoFabrica, custoConsumidor

		escreva("Escreva o valor do custo de fabrica do carro: ")
		leia(custoFabrica) 
		
		custoConsumidor = custoFabrica+custoFabrica*0.28+custoFabrica*0.45
		escreva("O custo do carro para o consumidor é: "+custoConsumidor)

		inicio()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3091; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */