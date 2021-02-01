package desafios;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ECommercer {
	
	static String tratamento = "";
	static String nome = "";
	
	static DecimalFormat formatar = new DecimalFormat("0.00");
	
	static final int nItens = 10;
	static int IDProduto = 0, qtd = 0;
	static String produtoA[] = {"Café Expresso","Café Com Leite","Cappuccino","Mocha","Pingado","Latte","Breve","Macchiato","Café Com Panna","Americano"};
	static double precoA[] = {0.5,1.0,1.5,2.5,3.0,3.5,4.0,4.5,5.0,5.5};
	static double totalGeral = 0.0;
	static int carrinhoA[]=new int[nItens];
	static int estoqueA[]=new int[nItens];
	static int opcao = 0;	
	
	public static void main(String[] args) {
		
		if(opcao == 0){					
			for(int i=0;i<nItens;i++){	
				estoqueA[i] = 10;			
			}							
		}								
		do {
			opcao = menu(tratamento, nome);
			String feedBack;
			
			switch (opcao)
			{
				case 1:
				cadastro();
				break;
	
				case 2:
				produtos();
				break;
	
				case 3:
				carrinho();
				break;
				
				case 4:
				int gamb=0;
				for(int i=0;i<nItens;i++) {
					if(estoqueA[i]==0) {
						gamb++;
					}
				}
				if(gamb==nItens) {
					for(int i=0;i<nItens;i++)
					{
						estoqueA[i] = 10; 
						carrinhoA[i] = 0;
						totalGeral = 0.0;
					}
				}
				break;
	
				default:
				System.out.println("Opção invalida!\n\nTente novamente. ");
				try {
					   Thread.sleep(3000);
					} catch (Exception e) {
					   e.printStackTrace();
					}
				main(null);
			}
		}while(true);
	}
	
/////////////////
//MENU///////////
/////////////////	
	
	public static int menu(String tratamento1, String nome1) {
		Scanner leia =new Scanner(System.in);
		String virgula="";
		String estok="";
		int gamb=0;
		if(tratamento!="")
		{
			virgula = ",";		
		}
		
		for(int i=0;i<nItens;i++) {
			if(estoqueA[i]==0) {
				gamb++;
			}
		}
		if(gamb==nItens) {
			estok="4. Renovar estoque";
		}
		System.out.println("\n==================================================\n");
		System.out.print("\nCafee-Commercer Generation\nTornando o mundo melhor!\n\n"+"Olá"+ tratamento1+ nome1+virgula+
				" por favor, escolha umas das opções a seguir"+"\ndigitando o numero correspondente a opção desejada:");
		System.out.print(	"\n__  _"+
							"\n___  |________________\t\t1. Cadastro/login"+
							"\n __  |Cafee-commercer/\t\t2. Produtos"+
							"\n  _  |  Generation  /\t\t3. Carrinho"+
							"\n___  |_____________/\t\t"+estok+
							"\n __  /____________\t\t"+
	             			"\n____ O          O\t\tInsira aqui: ");
		opcao = leia.nextInt();
	
		return opcao;
	}
	
	public static void cadastro()
	{
		Scanner leia = new Scanner (System.in);
		char sexo;
		for( int i =0; i<nItens;i++){
			
			estoqueA[i] += carrinhoA[i];
			carrinhoA[i] =0;
			totalGeral = 0.0;
		}
		
		System.out.println("\n==================================================\n");
		System.out.println("\n#CADASTRO");
		System.out.println("\nescreva o seu nome");
		nome = leia.next();
		System.out.println("Insira o seu sexo(F/M):");
		sexo = leia.next().charAt(0);
		
		if(sexo=='M'||sexo=='m'){
			tratamento = "Sr.";
				 }
		else if( sexo=='F'|| sexo=='f'){
			tratamento="Sra.";
		}
		else
		{
			tratamento="Srx.";	
		}
		
		try {
			   Thread.sleep(1000);
			} catch (Exception e) {
			   e.printStackTrace();
			}
		System.out.println("\ncadastro concluido!");
		try {
			   Thread.sleep(2000);
			} catch (Exception e) {
			   e.printStackTrace();
			}
		return;
	}
	
/////////////////
//PRODUTOS///////
/////////////////	
	
	public static void produtos() {
		
		Scanner ler= new Scanner(System.in);
		
		totalGeral = 0.0;
		
		System.out.println("\n==================================================\n");
		System.out.println("\n\n#PRODUTOS");
		
		System.out.print("\n|\tID\t|\tPreço\t|    Carrinho   |     Estoque   |\tProduto\t\n");
		System.out.print("----------------------------------------------------------------------------------------\n");
					
		for(int i=0;i<nItens;i++)
		{
			System.out.print("|\t"+(i+1)+"\t|\t"+precoA[i]+"\t|\t"+carrinhoA[i]+"\t|\t"+estoqueA[i]+"\t|\t"+produtoA[i]+"\n");
			if (carrinhoA[i] != 0){
			totalGeral += carrinhoA[i]*precoA[i];
			}
		}
		System.out.print("--------------------------");
		System.out.printf("\nTotal Geral: %.2f\n",totalGeral);
		System.out.print("--------------------------");
		
		System.out.print("\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:\n"
						+"[Caso deseje voltar, insira 0 (Zero)]."
						+" Insira aqui: ");
		IDProduto=ler.nextInt();

		if(IDProduto == 0)
		{
			try {
				   Thread.sleep(1000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			System.out.print("\nRetornando para o menu.\n");
			try {
				   Thread.sleep(1500);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			return;	
		}
		else if (IDProduto>nItens || IDProduto<0)
		{
			System.out.print("\ncaracter invalido!\nTente novamente.");
			try {
				   Thread.sleep(2000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			produtos();
		}
		else if (estoqueA[IDProduto-1] == 0){
			System.out.print("\nSinto muito!\nEste produto esta sem estoque, selecione outro produto");
			try {
				   Thread.sleep(5000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			produtos();
		}
				
		System.out.printf("\nInsira quantas unidades do produto (%s) você deseja: ",produtoA[IDProduto-1]);
		qtd=ler.nextInt();
	
		if (qtd > estoqueA[IDProduto-1]){
			System.out.print("\nInfelizmente só temos "+estoqueA[IDProduto-1]+" unidades de "+produtoA[IDProduto-1]+" em estoque."+
			"\nEscolha outro produto ou selecione uma quantidade menor para este produto");
			try {
				   Thread.sleep(8000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			produtos();
			}
		else if (qtd <= 0){
			System.out.print("\nQuantidade invalida!\nEscolha outro produto.");
			try {
				   Thread.sleep(8000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			produtos();
		}	
		
		estoqueA[IDProduto-1] -= qtd;
		carrinhoA[IDProduto-1] += qtd;

		do{
		System.out.print("\nForam adicionadas "+carrinhoA[IDProduto-1]+" unidades de "+produtoA[IDProduto-1]+" ao seu carrinho!"+
		"\nVocê deseja continuar comprando?\n1. Sim\n2. Não\n\nInsira aqui: ");
		opcao=ler.nextInt();
		
		if(opcao!=1 && opcao!=2){
			System.out.print("Opção invalida!");
			try {
				   Thread.sleep(8000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
		}
		}while (opcao!=1 && opcao!=2);

		if (opcao==1){
			produtos();
		}
		else{
			carrinho();
		}
	}
	
/////////////////
//CARRINHO///////
/////////////////
	
	public static void carrinho() {
		
		Scanner ler = new Scanner(System.in);
		
		char efetuarCompra;
		String formaPagamento = "";
		double totalPagar = 0.0;
		totalGeral = 0.0;
		int verificaCarrinho = 0;
		
		System.out.println("\n==================================================\n");
		System.out.print("#CARRINHO");
		
		for (int i=0; i<nItens; i++)
		{
			if (carrinhoA[i] == 0)
			{
				verificaCarrinho++;
			}
			if (verificaCarrinho == nItens)
			{
				System.out.println("O carrinho esta vazio");
				totalGeral = 0.0;
				try {
					   Thread.sleep(2000);
					} catch (Exception e)
					{
					   e.printStackTrace();
					}
				return;
			}
		}
		
		System.out.println("\n\n|\tID\t|\tPreço\t|    Carrinho   |\tProduto");
		System.out.println("---------------------------------------------------------------------");
		
		for (int i=0; i<nItens; i++)
		{
			if (carrinhoA[i] != 0)
			{
				System.out.print("|\t"+(i+1)+"\t|\t"+precoA[i]+"\t|\t"+carrinhoA[i]+"\t|\t"+produtoA[i]+"\n");
				totalGeral += carrinhoA[i]*precoA[i];
			}
		}
		System.out.println("-----------------------------------------");
		System.out.print("\nTotal Geral: "+formatar.format(totalGeral)+" - IMPOSTO (9%): "+formatar.format(totalGeral*0.09)+"\n");
		System.out.println("-----------------------------------------");
//####		
		System.out.println("\nEscolha uma das opções a seguir: "
				+ "\n1. Continuar comparando"
				+ "\n2. Adicionar/Subtrair Itens do carrinho"
				+ "\n3. Desistir da compra"
				+ "\n4. Efetuar compra!");
			opcao=ler.nextInt();
			while(opcao>4 || opcao<1){
				System.out.println("Por favor, escolha uma das opções disponiveis!");
				opcao=ler.nextInt();
			}
			if(opcao==1){
				produtos();
			}else if (opcao==2) {
				boolean confere=false;
				System.out.println("Insira o ID do produto que você quer adicionar/Subtrair: ");
				IDProduto=ler.nextInt(); 				
				
				for(int i=0;i<nItens;i++) {
					if (carrinhoA[i] != 0 && IDProduto == (i+1))
					{
						confere=true;
					}
				}
				
				if (IDProduto>nItens || IDProduto<1 || confere==false)
				{
					System.out.print("\nID invalido!.");
					try {
						   Thread.sleep(1000);
						} catch (Exception e) {
						   e.printStackTrace();
						}
					carrinho();
				}else {
					System.out.println("Selecione uma opção: "
									+ "\n1. Adicionar"
									+ "\n2. Subtrair");
					opcao=ler.nextInt();
					while(opcao>2||opcao<1) {
						System.out.println("caracter invalido, tente novamento");
						opcao=ler.nextInt();
					}
					
					if(opcao==1) {
						System.out.printf("\nInsira quantas unidades do produto (%s) você deseja: ",produtoA[IDProduto-1]);
						qtd=ler.nextInt();
					
						if (qtd > estoqueA[IDProduto-1]){
							System.out.print("\nInfelizmente só temos "+estoqueA[IDProduto-1]+" unidades de "+produtoA[IDProduto-1]+" em estoque."+
							"\nEscolha outro produto ou selecione uma quantidade menor para este produto");
							try {
								   Thread.sleep(8000);
								} catch (Exception e) {
								   e.printStackTrace();
								}
							carrinho();
							}
						else if (qtd <= 0){
							System.out.print("\nQuantidade invalida!");
							try {
								   Thread.sleep(8000);
								} catch (Exception e) {
								   e.printStackTrace();
								}
							carrinho();
						}	
						
						carrinhoA[IDProduto-1] += qtd;
						estoqueA[IDProduto-1] -= qtd;
						carrinho();
					}else {
						System.out.printf("\nInsira quantas unidades do produto (%s) você deseja: ",produtoA[IDProduto-1]);
						qtd=ler.nextInt();
					
						if (qtd > estoqueA[IDProduto-1]){
							System.out.print("\nInfelizmente só temos "+estoqueA[IDProduto-1]+" unidades de "+produtoA[IDProduto-1]+" em estoque."+
							"\nEscolha outro produto ou selecione uma quantidade menor para este produto");
							try {
								   Thread.sleep(8000);
								} catch (Exception e) {
								   e.printStackTrace();
								}
							carrinho();
							}
						else if (qtd <= 0){
							System.out.print("\nQuantidade invalida!.");
							try {
								   Thread.sleep(8000);
								} catch (Exception e) {
								   e.printStackTrace();
								}
							carrinho();
						}	
						
						carrinhoA[IDProduto-1] -= qtd;
						estoqueA[IDProduto-1] += qtd;
						carrinho();
					}
				}
			}else if (opcao==3) {
				for(int i=0;i<nItens;i++)
				{
					estoqueA[i] += carrinhoA[i]; 
					carrinhoA[i] = 0;
					totalGeral = 0.0;
				}
				main(null);
			}
//####		
		System.out.println("\nEscolha a forma de pagamento"
						+ "\n0. DESISTIR DA COMPRA"
						+ "\n1. A VISTA - 10% DESCONTO: "+ formatar.format(totalGeral*0.10)+" Total: "+formatar.format(totalGeral*0.90)
						+ "\n2. CARTÃO - 1 VEZ: - SEM DESCONTO"+ formatar.format(totalGeral)
						+ "\n3. CARTÃO - 2 VEZES  JUROS(10%) - PARCELAS DE: "+ formatar.format(totalGeral*1.1/2)+" Total: "+formatar.format(totalGeral*1.1)
						+ "\n4. CARTÃO - 3 VEZES JUROS (15%) - PARCELAS DE: "+ formatar.format(totalGeral*1.15/3)+" Total: "+formatar.format(totalGeral*1.15)
						+ "\nInsira Aqui: ");
		opcao = ler.nextInt();
		
		if(opcao == 0)
		{
			for(int i = 0; i< nItens; i++)
		{
			estoqueA[i] += carrinhoA[i];
			carrinhoA[i] = 0;
			totalGeral = 0.0;
		}
		return;	
		}
		else if ( opcao == 1)
		{
			formaPagamento = "A VISTA";
			totalPagar = Math.round((totalGeral*0.9)*100.0)/100.0;
		}
		else if (opcao == 2)
		{
			formaPagamento = "1 VEZ NO CARTÃO";
			totalPagar = Math.round(totalGeral);
		}
		else if (opcao == 3)
		{
			formaPagamento = "2 VEZES NO CARTÃO";
			totalPagar = Math.round((totalGeral*1.1)*100.0)/100.0;
		}
		else if (opcao == 4)
		{
			formaPagamento = "3 VEZES NO CARTÃO";
			totalPagar = Math.round((totalGeral*1.15)*100.0)/100.0;					
		}
		else
		{
			System.out.println("caracter invalido!\n Tente novamente");
			return;
		}
		
		System.out.println("Você deseja efetuar a compra na opção " + formaPagamento + " no valor de " + totalPagar +"? (S/N)");
		efetuarCompra = ler.next().charAt(0);
				
		if((efetuarCompra == 'S') || (efetuarCompra == 's'))
		{
			System.out.println("Compra efetuada com sucesso!");
			
			try {
				   Thread.sleep(1000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			
			System.out.print("\nCAFEE-COMMERCEER\n");
			System.out.print("----------------------------------\n");
			System.out.print("VALOR DO IMPOSTO (9%): "+ formatar.format(totalGeral*0.09)+ "\n\n");
			System.out.print("CARRINHO\tPREÇO\tPRODUTO\n");
			for(int i = 0; i<nItens;i++)
			{
				if(carrinhoA[i] != 0)
				{
					System.out.print(carrinhoA[i] + "\t\t" + (precoA[i]*carrinhoA[i]) + "\t" + produtoA[i] + "\n");
				}
			}
			
			System.out.println("TOTAL GERAL : " + totalGeral);
			System.out.println("OPÇÃO DE PAGAMENTO: " + formaPagamento);
			System.out.println("TOTAL A SER PAGO: " + formatar.format(totalPagar));
			System.out.println("VOLTE SEMPRE! :) ");
			
			try {
				   Thread.sleep(5000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			
			nome = " ";
			tratamento = " ";
			
			for(int i=0; i<nItens;i++)
			{
				carrinhoA[i] = 0;
			}
			return;												
		}
		else if((efetuarCompra =='N') || (efetuarCompra == 'n'))
		{
			return;
		}
		else
		{
			System.out.println("Caracter invalida \nTente novamente");
			return;
		}
	}
	
	
}
