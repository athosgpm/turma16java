import java.util.Scanner;

public class Pagamento{
	
	public static void main (String args[]){
		
		Scanner leia = new Scanner(System.in);
		
		
		double pagamento []= new double [5];
		char opcaoPagamento; 
		double valorTotal = 0.00, juros = 0.00;
		String descricaoProduto[] = {"L01,L02,L03,L04"};
		double valorProduto[] = {10.90 , 11.90, 12.90 , 13.50};
		int estoque[] = {10 , 10 , 10 , 10};
		int unidades = 0 , compra = 0;
		
		if (compra> 0 && compra <=10 && estoque[compra-1]>0) {
			System.out.printf("\nQuantas unidades do livro", descricaoProduto[compra -1]," deseja comprar? : " );
			unidades= leia.nextInt();
		}
		estoque[compra-1] -= unidades;
		pagamento[compra-1] = (unidades * valorProduto[compra-1]);
		valorTotal += pagamento[compra-1];
	
		System.out.printf("\n TOTAL GERADO R$ %.2f",valorTotal);
		System.out.print("\n === OPÇÕES PAGEMENTO ====");
	
		System.out.print(" 1 - A VISTA - 10% DESCONTO"
				  + "\n 2 - CARTÃO  - 1x, SEM DESCONTO" 
				  + "\n 3 - CARTÃO  - 2x, JUROS DE 10% " 
				  + "\n 4 - CARTÃO  - 3x, JUROS DE 15% "
				  + "\n"
				  + "SELECIONE A OPÇÃO DESEJADA: ");
		
		opcaoPagamento = (char) leia.nextInt();
		
		if(opcaoPagamento == 1) {
			valorTotal=valorTotal-(valorTotal*0.1);
			System.out.printf("\n Valor a ser pago: R$ %.2f ",valorTotal);
		}
		if(opcaoPagamento == 2) {
			
			System.out.printf("\n Valor a ser pago: R$ %f ",valorTotal);
		}
		if(opcaoPagamento == 3) {
			valorTotal=valorTotal+(valorTotal*0.1);
			juros = valorTotal+(valorTotal*0.1)/2;
			System.out.printf("\n Valor a ser pago: R$ %.2f em 2x de R$ %.2f ",valorTotal,juros);
		}
		if(opcaoPagamento == 4) {
			valorTotal=valorTotal-(valorTotal*0.1);
			juros = valorTotal+(valorTotal*0.1)/3;
			System.out.printf("\n Valor a ser pago: R$ %.2f em 3x de R$ %.2f ",valorTotal,juros);
		}
		else{
			System.out.print("Opção inválida, selecione uma opção de [1-4]:  ");
			opcaoPagamento = (char) leia.nextInt();
		}
		
	}
	
}	
