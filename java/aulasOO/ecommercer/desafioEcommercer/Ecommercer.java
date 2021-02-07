import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {

		// CODIGO
		String codProduto[] = new String[10];

		for (int i = 0; i < codProduto.length; i++) {
			codProduto[i] = ("l0" + (i + 1));
		}

		// DESCRICAO
		String descricaoProduto[] = { "LivroA", "LivroB", "LivroC", "LivroD", "LivroE", "LivroF", "LivroG", "LivroH",
				"LivroI", "LivroJ" };

		// ESTOQUE TOTAL
		int estoqueTotal[] = new int[10];

		for (int i = 0; i < estoqueTotal.length; i++) {
			estoqueTotal[i] = 10;
		}

		// VALOR PRODUTO
		double valorProduto[] = new double[10];
		double aux = 10.00;

		for (int i = 0; i < valorProduto.length; i++) {
			valorProduto[i] = aux;
			aux++;
		}

		mostraProdutos(codProduto, descricaoProduto, estoqueTotal, valorProduto);

	}

	// --------------------------------------------------------------------------

	public static void mostraProdutos(String codProduto[], String descricaoProduto[], int estoqueTotal[],
			double valorProduto[]) {

		System.out.println("CODIGO \t PRODUTO \t PREÇO \t\t QUANTIDADE");
		for (int i = 0; i < 10; i++) {
			System.out.printf("\n %s \t %s \t R$ %.2f \t Qtd:  %d", codProduto[i], descricaoProduto[i], valorProduto[i],
					estoqueTotal[i]);
		}

	}
	
	// --------------------------------------------------------------------------

	static void carrinhoCompra(String codProduto[], String descricaoProduto[], int estoqueTotal[], double valorProduto[]) {
        Scanner leitor = new Scanner(System.in);
        int opc;
        String carrinho[] = new String[10];
        String codigo;
        

        double[] valorCarrinho = new double[10];
        double valorFinal = 0.00;
        
        System.out.println("***************************************");
        System.out.println("\t\t CARRINHO");
        System.out.println("1 - Adicionar novo produto");
        System.out.println("2 - Alterar quantidade de um produto");
        System.out.println("3 - Remover produto");
        opc = leitor.nextInt();
        
        switch(opc) {
        case 1:
        	break;
        case 2: 
        	alterarQtdProduto();
        	break;
        case 3:
        	removerProduto();
        	break;
        }
         
        // adicionar produto - chama função
        
        mostraProdutos(codProduto, descricaoProduto, estoqueTotal, valorProduto);
	}
        
     // --------------------------------------------------------------------------
	
	static void mostrarCarrinho() {
		String carrinho[] = new String[10];
	}

    // --------------------------------------------------------------------------

	static void alterarQtdProduto(String codProduto[], String descricaoProduto[], int estoqueTotal[], double valorProduto[]) {
		
		String carrinho[] = new String[10];
		String codigo;
		int qtd, qtdComprado;
		Scanner leitor = new Scanner(System.in);

		mostrarCarrinho();
		
		System.out.println("Digite o código do produto que deseja alterar: ");
		codigo = leitor.next();

		for (int i = 0; i < 10; i++) {
			if (codigo == codProduto[i]) {
				do {
					System.out.println("Digite a nova quantidade que deseja: ");
					qtd = leitor.nextInt();

					if (qtd > estoqueTotal[i]) {
						System.out.printf("Há apenas %d disponivel no estoque", estoqueTotal[i]);
					} else {
						qtdComprado = qtd;
					}

				} while (qtd > estoqueTotal[i]);
			} else {
				System.out.println("Código inválido!");
			}

		}
	}

	// --------------------------------------------------------------------------

	static void removerProduto(String codProduto[], String descricaoProduto[], int estoqueTotal[], double valorProduto[]) {
		String codigo;
		String carrinho[] = new String[10];
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o código do produto que deseja alterar: ");
		codigo = leitor.nextLine();
				
		for (int i = 0; i < 10; i++) {
			
			if(codigo == carrinho[i]) {
				carrinho[i] = null;
			}
			else {
				System.out.println("Códiigo inválido!");
			}
		}
		
	}

	// --------------------------------------------------------------------------


}