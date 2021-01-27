programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Matematica --> m
	
	cadeia tratamento = ""
	cadeia nome = ""
	
	const inteiro nItens = 10
	inteiro IDProduto = 0, qtd = 0
	cadeia produtoA[nItens] = {"Café Expresso","Café Com Leite","Cappuccino","Mocha","Pingado","Latte","Breve","Macchiato","Café Com Panna","Americano"}
	real precoA[nItens] = {0.5,1.0,1.5,2.5,3.0,3.5,4.0,4.5,5.0,5.5}
	real totalGeral = 0.0
	inteiro carrinhoA[nItens], estoqueA[nItens]
	inteiro opcao = 0	
	

	funcao inicio()
	{
		limpa()
		
		se(opcao == 0){					
			para(inteiro i=0;i<nItens;i++){	
				estoqueA[i] = 10			
			}							
		}								
		
		opcao = menu(tratamento, nome)
		cadeia feedBack
		
		escolha (opcao)
		{
			caso 1:
			cadastro()
			pare

			caso 2:
			produtos()
			pare

			caso 3:
			carrinho()
			pare

			caso 4:
			feedBack = faleConosco()
			pare

			caso contrario:
			limpa()
			escreva("Opção invalida!\n\nTente novamente. ")
			u.aguarde(3000)
			inicio()
			
		}
	}

	funcao inteiro menu(cadeia tratamento1, cadeia nome1)
	{
		cadeia virgula =""
		
		se(tratamento!=""){
			virgula = ","
		}
		
		escreva("CAFEE-COMMERCER GENERATION\nTornando o mundo melhor!\n\n",
		"Olá,",tratamento1,nome1,virgula," por favor, escolha uma das opções a seguir",
		"\ndigitando o numero correspondente a opção desejada: ",
			   "\n__  _",
	             "\n___  |________________\t\t1. Cadastro/login",
		        "\n __  |Cafee-commercer/\t\t2. Produtos",
		        "\n  _  |  Generation  /\t\t3. Carrinho",
		        "\n___  |_____________/\t\t4. Fale conosco",
	             "\n __  /____________\t\t",
	             "\n____ O          O\t\tInsira aqui: ")
	     leia(opcao)
	   	        
		retorne opcao
	}

	funcao cadastro()
	{
		caracter sexo
		para(inteiro i=0;i<nItens;i++)
			{
				estoqueA[i] += carrinhoA[i] 
				carrinhoA[i] = 0
				totalGeral = 0.0
			}
			
		limpa()
		escreva("#CADASTRO/LOGIN")
		escreva("\n\nInsira o seu nome: ")
		leia(nome)
		escreva("Insira o seu sexo (F/M): ")
		leia(sexo)
		
		se(sexo=='M' ou sexo=='m')
		{
			tratamento = "Sr. "
		}
		senao se(sexo=='F' ou sexo=='f')
		{
			tratamento = "Sra. "
		}
		senao
		{
			tratamento = "Srx. "
		}
		
		u.aguarde(1000)
		limpa()
		escreva("cadastro concluido!")
		u.aguarde(2000)
		inicio()
	}

	funcao produtos()
	{
		totalGeral = 0.0
		
		limpa()
		escreva("#PRODUTOS")
		
		escreva("\n\n|\tID\t|\tPreço\t|    Carrinho   |     Estoque   |\tProduto\t\n")
		escreva("----------------------------------------------------------------------------------------\n")
					
		para(inteiro i=0;i<nItens;i++)
		{
			escreva("|\t",(i+1),"\t|\t",precoA[i],"\t|\t",carrinhoA[i],"\t|\t",estoqueA[i],"\t|\t",produtoA[i],"\n")
			se (carrinhoA[i] != 0){
			totalGeral += carrinhoA[i]*precoA[i]
			}
		}
		escreva("--------------------------")
		escreva("\nTotal Geral: ",m.arredondar(totalGeral, 2),"\n")
		escreva("--------------------------")
		
		escreva("\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:\n",
		"[Caso deseje voltar, insira 0 (Zero)]."," Insira aqui: ")
		leia(IDProduto)

		se(IDProduto == 0)
		{
			u.aguarde(1000)
			limpa()
			escreva("Retornando para o menu.")
			u.aguarde(1500)
			inicio()	
		}
		senao se (IDProduto>nItens ou IDProduto<0)
		{
			escreva("\ncaracter invalido!\nTente novamente.")
			u.aguarde(2000)
			produtos()
		}
		senao se (estoqueA[IDProduto-1] == 0){
			escreva("\nSinto muito!\nEste produto esta sem estoque, selecione outro produto")
			u.aguarde(5000)
			produtos()
		}

				
		escreva("\nInsira quantas unidades do produto (",produtoA[IDProduto-1],") você deseja: ")
		leia(qtd)
	
		se (qtd > estoqueA[IDProduto-1]){
			escreva("\nInfelizmente só temos ",estoqueA[IDProduto-1]," unidades de ",produtoA[IDProduto-1]," em estoque.",
			"\nEscolha outro produto ou selecione uma quantidade menor para este produto")
			u.aguarde(8000)
			produtos()
			}
		senao se (qtd <= 0){
			escreva("\nQuantidade invalida!\nEscolha outro produto.")
			u.aguarde(2000)
			produtos()
		}	
		
		estoqueA[IDProduto-1] -= qtd
		carrinhoA[IDProduto-1] += qtd

		faca{
		limpa()
		escreva("Foram adicionadas ",carrinhoA[IDProduto-1]," unidades de ",produtoA[IDProduto-1]," ao seu carrinho!",
		"\nVocê deseja continuar comprando?\n1. Sim\n2. Não\n\nInsira aqui: ")
		leia(opcao)
		se(opcao!=1 e opcao!=2){
			limpa()
			escreva("Opção invalida!")
			u.aguarde(1000)
			limpa()
		}
		}enquanto (opcao!=1 e opcao!=2)

		se (opcao==1){
			produtos()
		}
		senao{
			carrinho()
		}
	}

	funcao carrinho()
	{
		limpa()
		caracter efetuarCompra
		cadeia formaPagamento = ""
		real totalPagar = 0.0
		totalGeral = 0.0
		inteiro verificaCarrinho = 0
		
		escreva("#CARRINHO")

		para(inteiro i=0;i<nItens;i++)
		{
			se (carrinhoA[i] == 0){
				verificaCarrinho++
			}
			se(verificaCarrinho == nItens){
				escreva("\n\nO Carrinho esta vazio")
				totalGeral = 0.0
				u.aguarde(2000)
				inicio()
			}
		}
		
		escreva("\n\n|\tID\t|\tPreço\t|    Carrinho   |\tProduto\t\n")
		escreva("---------------------------------------------------------------------\n")
					
		para(inteiro i=0;i<nItens;i++)
		{
			se (carrinhoA[i] != 0){
			escreva("|\t",(i+1),"\t|\t",precoA[i],"\t|\t",carrinhoA[i],"\t|\t",produtoA[i],"\n")
			totalGeral += carrinhoA[i]*precoA[i]
			}
		}
		escreva("-----------------------------------------")
		escreva  ("\nTotal Geral: ",m.arredondar(totalGeral, 2)," - IMPOSTO (9%): ",m.arredondar((totalGeral*0.09), 2),"\n")
		escreva("-----------------------------------------\n")
		escreva(	"\nEscolha a forma de pagamento\n",
				"\n0. DESISTIR DA COMPRA",
				"\n1. A VISTA - 10% DESCONTO: ",(m.arredondar((totalGeral*0.9), 2)),
				"\n2. CARTÃO - 1 VEZ: ",m.arredondar((totalGeral), 2)," - SEM DESCONTO",
				"\n3. CARTÃO - 2 VEZES - JUROS (10%) - PARCELAS DE: ",m.arredondar((totalGeral*1.1/2), 2)," - TOTAL DE: ",m.arredondar((totalGeral*1.1), 2),
				"\n4. CARTÃO - 3 VEZES - JUROS (15%) - PARCELAS DE: ",m.arredondar((totalGeral*1.15/3), 2)," - TOTAL DE:",m.arredondar((totalGeral*1.15), 2),
				"\n\nInsira Aqui: ")
		leia(opcao)

		se(opcao == 0){
			para(inteiro i=0;i<nItens;i++)
			{
				estoqueA[i] += carrinhoA[i] 
				carrinhoA[i] = 0
				totalGeral = 0.0
			}
			inicio()
		
		}
		senao se(opcao == 1){
			formaPagamento = "A VISTA"
			totalPagar = m.arredondar((totalGeral*0.9), 2)
		}
		senao se(opcao == 2){
			formaPagamento = "1 VEZ NO CARTÃO"
			totalPagar = m.arredondar((totalGeral), 2)
		}
		senao se(opcao == 3){
			formaPagamento = "2 VEZES NO CARTÃO"
			totalPagar = m.arredondar((totalGeral*1.1), 2)
		}
		senao se(opcao == 4){
			formaPagamento = "3 VEZES NO CARTÃO"
			totalPagar = m.arredondar((totalGeral*1.15), 2)
		}senao{
			escreva("\ncaracter invalido!\nTente novamente")
			u.aguarde(2000)
			carrinho()
		}
		
		escreva("\nVocê deseja efeturar a compra na opção ",formaPagamento," no valor de ",totalPagar,"? (S/N): ")
		leia(efetuarCompra)

		se(efetuarCompra=='S' ou efetuarCompra=='s')
		{
			limpa()
			escreva("Compra efetuada com sucesso!")
			u.aguarde(1500)
			limpa()
			escreva(	"CAFEE-COMMERCEER\n",
					"----------------------------------\n",
					"VALOR DO IMPOSTO (9%): ",m.arredondar((totalGeral*0.09), 2),"\n\n")
			escreva("Carrinho\tPreço\tProduto\n")
			para(inteiro i=0;i<nItens;i++){
				se (carrinhoA[i] != 0){
				escreva(carrinhoA[i],"\t\t",(precoA[i]*carrinhoA[i]),"\t",produtoA[i],"\n")
				}
			}

			escreva(	"\nTOTAL GERAL: ",totalGeral,
					"\nOPÇÃO DE PAGAMENTO: ",formaPagamento,
					"\nTOTAL A SER PAGO:",totalPagar,"\n",
					"\nVolte sempre!")
			u.aguarde(10000)
			nome = ""
			tratamento = ""
			para(inteiro i=0;i<nItens;i++)
			{
				carrinhoA[i] = 0
			}
			inicio()
		}
		senao se(efetuarCompra=='N' ou efetuarCompra=='n')
		{
			carrinho()
		}
		senao
		{
			escreva("\ncaracter invalido!\nTente novamente")
			u.aguarde(2000)
			carrinho()
		}
		
	}

	funcao cadeia faleConosco()
	{
		limpa()
		escreva("#FALE CONOSCO")
		cadeia feedBack
		escreva("\n\nOlá,",tratamento,nome," por favor, escreva abaixo a sua mensagem:\n\n")
		leia(feedBack)
		u.aguarde(1500)
		inicio()

		retorne feedBack
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1641; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {totalGeral, 13, 6, 10}-{opcao, 15, 9, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */