package BANK16;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Conta bank = new Conta("123.123-1","123.123.123-12");
		
	}
	
	public void transacao() {
		Scanner ler = new Scanner(System.in);
		Conta bank = new Conta("123.123-1","123.123.123-12");
		
		int opcao=0;
		double valor = 0.0;
		
		do {
			System.out.println("\n======================================");
			System.out.printf("numero de conta: %s\n",bank.getNumero());
			System.out.printf("CPF: %s\n",bank.getCpf());
			System.out.println("\n--------------------------------------");
			System.out.println("você deseja:\n1 - Creditar\n2 - Debitar");
			opcao=ler.nextInt();
			
			while(opcao<1||opcao>2) {
				System.out.println("Por favor, digite uma das opções disponiveis: ");
				opcao=ler.nextInt();
			}
			
			if(bank.getSaldo()==0 && opcao==2) {
				System.out.println("você não tem saldo!");
			}else {
				if (opcao==1) {
					System.out.println("digite o valor desejado: ");
					valor = ler.nextDouble();
					
					bank.creditar(valor);
				}else {
					
					System.out.println("digite o valor desejado: ");
					valor = ler.nextDouble();
					
					bank.debitar(valor);
				}
			}
			
			if(opcao==1||opcao==2) {
				System.out.printf("\nseu saldo é de: %.2f \n",bank.getSaldo());
			}
			
			System.out.println("\ndeseja sair da conta?\n> se sim digite 0 (zero).\n> Do contrario, digite qualquer valor. ");
			opcao=ler.nextInt();
		}while(opcao!=0);
	}
}
