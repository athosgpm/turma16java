package exercicio03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TestaEstoque {

	public static Scanner ler = new Scanner(System.in);
	public static Collection<Estoque> stock = new ArrayList<>();
	Estoque produto = new Estoque();
	
	public static void main(String[] args) {
		
		do {
			System.out.println("\nEste programa considera o cenario perfeito\n");
			
			System.out.println("Escolha uma das opções a seguir: \n"
								+"1 - Armazenar dados \n"
								+"2 - Remover dados\n"
								+"3 - Atualizar dados\n"
								+"4 - Apresentar todos os dados\n");
			int opcao = ler.nextInt();
			
			switch (opcao) {
			case 1:
				armazenar();
				break;
			case 2:
				remover();
				break;
			case 3:
				System.out.println("\nEste programa mantem os dados sempre atualizados");
				break;
			case 4:
				apresentar();
				break;
			
			}
		}while(true);
	}
	
	public static void armazenar() {

		int id;
		String descricao;
		int qtd;
		double valor;
			
		System.out.println("digite o id: ");
		id=ler.nextInt();
		System.out.println("digite a descrição: ");
		descricao=ler.next();
		System.out.println("digite a quantidade");
		qtd=ler.nextInt();
		System.out.println("digite o valor: ");
		valor=ler.nextDouble();
		
		Estoque produto = new Estoque(id,descricao,qtd,valor);
		stock.add(produto);
	}
	
	public static void remover() {
		int idDel;
		
		System.out.print("ID\tQtd\tValor\tDescrição\n");
		for(Estoque o: stock) {
			System.out.println(o);
		}
		
		System.out.println("escolha o ID do produto que você deseja remover: ");
		idDel = ler.nextInt();
		
		/*
		for (Estoque o : stock) {			// NÃO É POSSIVEL USAR O FOR EACH PARA FAZER UMA MODIFICAÇÃO
			if(o.getId() == idDel) {		// ESTRUTURAL DE UMA COLLECTION, POIS ELE FARIA ISSO DURANTE
				stock.remove(o);			// UMA MESMA INTERAÇÃO.
			}								// PARA ISSO É NECESSARIO REALIZAR A ALTERAÇÃO PELO
		}									// ITERATOR (É MAIS COMPLICADO, MAS FUNCIONA BEM)
		*/
		
		for (Iterator<Estoque> iterator = stock.iterator(); iterator.hasNext(); ) {
		    Estoque produto = iterator.next();
		    if (produto.getId()==idDel) {
		        iterator.remove();
		    }
		}
		
	}
	
	public static void apresentar() {

		System.out.print("ID\tQtd\tValor\tDescrição\n");
		for(Estoque o: stock) {
			System.out.println(o);
		}
	}
}
