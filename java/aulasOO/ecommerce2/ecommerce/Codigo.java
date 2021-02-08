package ecommerce;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entidadesEcommerce.Carrinho;
import entidadesEcommerce.Cliente;
import entidadesEcommerce.ItemCarrinho;
import entidadesEcommerce.Pagamento;
import entidadesEcommerce.Produto;

public class Codigo {

	static DecimalFormat formatar = new DecimalFormat("0.00");
	
	public static Map<String, Produto> produtos = new HashMap<String, Produto>();
	public static Carrinho carrinho = new Carrinho();
	public static Cliente clientes = new Cliente();
	public static Produto prod = new Produto();
	public static Pagamento p1 = new Pagamento(0,0,carrinho);
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			if (produtos.isEmpty()) {
				renovarEstoque();
			}
			int op = menu();
			switch (op) {
			case 1:
				cadastro();
				break;
			case 2:
				produto();
				break;
			case 3:
				carrinhoFunc();
				break;
			case 4:
				renovarEstoque();
				break;
			default:
				System.out.println("Opção invalida!\n\nTente novamente. ");
				delay(2000);
				main(null);
			}
		}while(true);
		
	}
//////////////////////////////////////////////////		MENU PRINCIPAL
	public static int menu() {
		int op;
		String virgula="";
//TRATAMENTO DA FORMATAÇÃO DE TEXTO		
		if(clientes.tratamentoGenero()!="")
		virgula = ", ";		
//MENU PRINCIPAL		
		linha1();
		System.out.print("\nCafee-Commercer Generation\nTornando o mundo melhor com café!\n\n" + "Olá, " + clientes.tratamentoGenero() + clientes.getNome() + virgula +
				"por favor, escolha umas das opções a seguir"+"\ndigitando o numero correspondente a opção desejada:");
		System.out.print(	"\n__  _"+
							"\n___  |________________\t\t1. Cadastro/login"+
							"\n __  |Cafee-commercer/\t\t2. Produtos"+
							"\n  _  |  Generation  /\t\t3. Carrinho"+
							"\n___  |_____________/\t\t4. Renovar estoque"+
							"\n __  /____________\t\t"+
	             			"\n____ O          O\t\tInsira aqui: ");
		op = ler.nextInt();
		return op;
	}	
//////////////////////////////////////////////////		MENU CADASTRO
	public static void cadastro() { 
		char sexo;
		String nome;
//DEVOLVER ITENS DO CARRINHO PARA O ESTOQUE		
		cacelarCompra();
//MENU DE CADASTRO		
		linha1();
		System.out.println("\n#CADASTRO");
		System.out.println("\nescreva o seu nome: ");
		nome = ler.next();
		System.out.println("Insira o seu sexo (F/M): ");
		sexo = ler.next().toUpperCase().charAt(0);		
		clientes.setGenero(sexo);
		clientes.setNome(nome);
		
		System.out.println("\nCadastro concluido!");
		delay(1000);
	}	
//////////////////////////////////////////////////		MENU COMPRAS
	public static void produto() {
		int op=0;
//MENU PRODUTOS			
		linha1();
		System.out.println("\n#PRODUTOS");
		listaProdutos();
		System.out.print("--------------------------");
		System.out.print("\nTotal Geral:"+formatar.format(carrinho.valorSubtotal())+"\n");
		System.out.print("--------------------------");	
		System.out.print("\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:\n"
						+"[Caso deseje voltar, insira 0 (Zero)]."
						+" Insira aqui: ");
		String idProd=ler.next();
		int a = Integer.parseInt(idProd);
		if (a==0) {
			System.out.print("\nRetornando para o menu.\n");
			delay(1000);
			main(null);
		}else {
			adicionarCarrinho(idProd);
		}
		
		System.out.print("\nO produto foi adicionado ao seu carrinho!"+
		"\nVocê deseja continuar comprando?\n1. Sim\n2. Não\n\nInsira aqui: ");
		op=ler.nextInt();
		
		while (op!=1 && op!=2){
			System.out.print("Por favor, insira uma das opções disponiveis");
			op=ler.nextInt();
		}
		if (op==1){
			produto();
		}
		else{
			carrinhoFunc();
		}
	}
//////////////////////////////////////////////////		MENU CARRINHO
	public static void carrinhoFunc() {
		int op=0;
		String formaPagamento="";
//MENU CARRINHO
		linha1();
		System.out.println("\n#CARRINHO");
//VERIFICA SE ESTA VAZIO
		if (carrinho.getMapItemCarrinho().isEmpty()) {
			System.out.println("\nO carrinho esta vazio");
			delay(1000);
			main(null);
		}
		listaCarrinho();
		
		System.out.println("-----------------------------------------");
		System.out.print("Total Geral: "+formatar.format(carrinho.valorSubtotal())+" - IMPOSTO (9%): "+formatar.format(p1.calcularImposto())+"\n");
		System.out.println("-----------------------------------------");		
		System.out.println("\nEscolha uma das opções a seguir: "
				+ "\n1. Continuar comprando"
				+ "\n2. Adicionar/Subtrair Itens do carrinho"
				+ "\n3. Desistir da compra"
				+ "\n4. Efetuar compra!");
			op=ler.nextInt();
		while(op>4 || op<1){
			System.out.println("Por favor, escolha uma das opções disponiveis!");
			op=ler.nextInt();
		}
		
		if(op==1){
			produto();
		}else if(op==2) {
			System.out.println("Você deseja\n1 - Adicionar\n2 - Subtrair");
			int opcao = ler.nextInt();
			while(opcao!=1||opcao!=2) {
				System.out.println("Por favor, insira uma das opções disponiveis:");
				opcao = ler.nextInt();
			}
			System.out.println("Digite o código do produto: ");
			String id = ler.next();
			if(opcao==1) {
				adicionarCarrinho(id);
			}else {
				removerCarrinho(id);
			}
			carrinhoFunc();
		}else if(op==3) {
			cacelarCompra();
			main(null);
		}
				
		System.out.println("\nEscolha a forma de pagamento"
				+ "\n0. DESISTIR DA COMPRA"
				+ "\n1. A VISTA - 10% DESCONTO: "+formatar.format(p1.valorTotalGeral(0.10))+" Total: "+formatar.format(p1.valorTotalGeral(0.90))
				+ "\n2. CARTÃO - 1 VEZ: - SEM DESCONTO total: "+ formatar.format(p1.valorTotalGeral(1))
				+ "\n3. CARTÃO - 2 VEZES  JUROS(10%) - PARCELAS DE: "+ formatar.format(p1.valorTotalGeral(1.1)/2) +" Total: "+formatar.format(p1.valorTotalGeral(1.1))
				+ "\n4. CARTÃO - 3 VEZES JUROS (15%) - PARCELAS DE: "+ formatar.format(p1.valorTotalGeral(1.15)/3) +" Total: "+formatar.format(p1.valorTotalGeral(1.15))
				+ "\nInsira Aqui: ");
		op = ler.nextInt();
		
		if(op==0) {
			cacelarCompra();
			return;
		}else if ( op == 1) {
			formaPagamento = "A VISTA";
			formatar.format(p1.valorTotalGeral(0.90));
		} else if (op == 2) {
			formaPagamento = "1 VEZ NO CARTÃO";
			formatar.format(p1.valorTotalGeral(1));
		} else if (op == 3) {
			formaPagamento = "2 VEZES NO CARTÃO";
			formatar.format(p1.valorTotalGeral(1.1));
		} else if (op == 4) {
			formaPagamento = "3 VEZES NO CARTÃO";
			formatar.format(p1.valorTotalGeral(1.15));
		} else {
			System.out.println("caracter invalido!\n Tente novamente");
			carrinhoFunc();
		}
		
		System.out.println("Você deseja efetuar a compra na opção " + formaPagamento + " no valor de " + formatar.format(p1.getTotalGeral()) +"? (S/N)");
		char efetuarCompra = ler.next().toUpperCase().charAt(0);
//NOTA FISCAL				
		if(efetuarCompra == 'S') {
			System.out.println("Compra efetuada com sucesso!");
			delay(1000);
			
			System.out.print("\nCAFEE-COMMERCEER\n");
			System.out.print("----------------------------------\n");
			listaCarrinho();
			System.out.println("TOTAL GERAL : " + formatar.format(carrinho.valorSubtotal()));
			System.out.println("VALOR DO IMPOSTO (9%): "+ formatar.format(p1.getImposto()));
			System.out.println("OPÇÃO DE PAGAMENTO: " + formaPagamento);
			System.out.println("TOTAL A SER PAGO: " + formatar.format(p1.getTotalGeral()));
			System.out.println("VOLTE SEMPRE! :) ");
			
			delay(5000);
			clientes.setNome("");
			clientes.setGenero('░');
			
			carrinho.getMapItemCarrinho().clear();											
		}
		else if(efetuarCompra =='N')
		{
			main(null);
		}
		else
		{
			System.out.println("Caracter invalida \nTente novamente");
			carrinhoFunc();
		}
	}
//////////////////////////////////////////////////		ADICIONAR/REMOVER
	public static void adicionarCarrinho(String id) {
		
		if (produtos.containsKey(id)) {
			System.out.println("Digite a quantidade que deseja adicionar: ");
			int qtd = ler.nextInt();
			while(qtd<=0) {
				System.out.println("Por favor, digite um valor positivo maior que zero");
				qtd = ler.nextInt();
			}
			if(qtd <= produtos.get(id).getQtdProduto()) {
				produtos.get(id).setQtdProduto(produtos.get(id).getQtdProduto() - qtd);
				
				if(carrinho.getMapItemCarrinho().containsKey(id)) {
					carrinho.getMapItemCarrinho().get(id).setqtdCarrinho(carrinho.getMapItemCarrinho().get(id).getqtdCarrinho()+qtd);
				}else {
					ItemCarrinho itemCarrinho = new ItemCarrinho(produtos.get(id), qtd);
					carrinho.addItemCarrinho(itemCarrinho);
				}
			}else {
				System.out.println("A quantidade inserida é invalida!");
				delay(1500);
				main(null);
			}
		}else {
			System.out.println("O Id inserido não é valido!");
			delay(1500);
			main(null);
		}
		
	}
	
	public static void removerCarrinho(String id) {
		if(carrinho.getMapItemCarrinho().containsKey(id)) {
			System.out.println("Digite a quantidade que deseja subtrair: ");
			int qtd = ler.nextInt();
			while(qtd<=0) {
				System.out.println("Por favor, digite um valor positivo maior que zero");
				qtd = ler.nextInt();
			}
			if(qtd <= carrinho.getMapItemCarrinho().get(id).getqtdCarrinho()) {
				produtos.get(id).setQtdProduto(produtos.get(id).getQtdProduto() + qtd);
				
				if(carrinho.getMapItemCarrinho().containsKey(id)) {
					carrinho.getMapItemCarrinho().get(id).setqtdCarrinho(carrinho.getMapItemCarrinho().get(id).getqtdCarrinho()-qtd);
				}else {
					ItemCarrinho itemCarrinho = new ItemCarrinho(produtos.get(id), qtd);
					carrinho.addItemCarrinho(itemCarrinho);
				}
			}else {
				System.out.println("A quantidade inserida é invalida!");
				delay(1500);
				main(null);
			}
			if(carrinho.getMapItemCarrinho().get(id).getqtdCarrinho()==0) {
				carrinho.getMapItemCarrinho().remove(id);
				}
		}else {
			System.out.println("O Id inserido não é valido!");
			delay(1500);
			main(null);
		}
	}
//////////////////////////////////////////////////		CANCELAR COMPRA	
	public static void cacelarCompra() {
		for (int i = 1; i <= 10; i++) {
			if(i<10) {
				String a ="0" + i;
				if (carrinho.getMapItemCarrinho().containsKey(a)) {
					produtos.get(a).setQtdProduto(produtos.get(a).getQtdProduto()+carrinho.getMapItemCarrinho().get(a).getqtdCarrinho());
					carrinho.getMapItemCarrinho().get(a).setqtdCarrinho(0);
				}
			}
			if (carrinho.getMapItemCarrinho().containsKey("10")) {
				produtos.get("10").setQtdProduto(produtos.get("10").getQtdProduto()+carrinho.getMapItemCarrinho().get("10").getqtdCarrinho());
				carrinho.getMapItemCarrinho().get("10").setqtdCarrinho(0);
			}
		}
		carrinho.getMapItemCarrinho().clear();
	}
//////////////////////////////////////////////////		RENOVAR ESTOQUE (COLOCAR POR TXT)	
	public static void renovarEstoque() {
		carrinho.getMapItemCarrinho().clear();
		produtos.clear();
		FileInputStream leitura = null;
		BufferedReader conversao = null;
		try {
			leitura = new FileInputStream("produtos.txt");
			InputStreamReader conteudo = new InputStreamReader(leitura);
			conversao = new BufferedReader(conteudo);

			while (conversao.ready()) {
				String linha = conversao.readLine();
				String item[] = linha.split(";");					
				Produto prod = new Produto(item[0], item[1],(Integer.parseInt(item[3])), Double.parseDouble(item[2]));
				
				produtos.put(item[0], prod);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		main(null);
	}
//////////////////////////////////////////////////		LISTA OS PRODUTOS PARA COMPRAR
	public static void listaProdutos() {
		System.out.print("\tID\t|    Estoque\t|\tPreço\t|\tProduto\t\n");
		linha2();
		for (Produto o : produtos.values()) {
			System.out.println(o);
		}
	}
//////////////////////////////////////////////////		LISTA OS PRODUTOS DO CARRINHO	
	public static void listaCarrinho() {
		System.out.print("\tID\t|   Carrinho\t|\tPreço\t|\tProduto\t\n");
		linha2();
		for (ItemCarrinho o : carrinho.getMapItemCarrinho().values()) {
			System.out.println(o);
		}
	}
//////////////////////////////////////////////////		UTILIDADES		
	public static void linha1() {
		System.out.println();
		for(int i =0;i<150;i++) {System.out.print("▒");}
		System.out.println();
	}
	
	public static void linha2() {
		for(int i =0;i<100;i++) {System.out.print("-");}
		System.out.println();
	}
	
	public static void delay(int time) {
		try { Thread.sleep(time);
		} catch (Exception e) {
		e.printStackTrace();
	}
}
}
