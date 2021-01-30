package exercicio04;

import java.util.Scanner;

public class Q00Agenda {
	public static void main(String[] args) {
	
		Scanner ler=new Scanner(System.in);
		String agenda[][]= new String[31][24];
		String nome;
		int dia=0, hora=0, opcao=0;
		
		System.out.println("\nOlá! Bem-Vindo a sua agenda, insira seu nome para iniciar a sua agenda:");
		nome=ler.next();
		
		do {
		System.out.printf("Olá %s escolha uma das opções a seguir: "
						+ "\n1 - Cadastrar evento"
						+ "\n2 - Ver eventos cadastrados"
						+ "\n3 - deslogar\n",nome);
		opcao=ler.nextInt();
		while(opcao<1||opcao>3) {
			System.out.println("Por favor, escolha uma das opções disponiveis: ");
			opcao=ler.nextInt();
		}
		if(opcao==1) {
			System.out.println("Escolha um dia para o cadastro [1/31]: ");
			dia=ler.nextInt();
			while(dia<1 || dia>31){
			System.out.println("\ndia escolhido invalido!\nEscolha um dia para o cadastro [1/31]: ");
			dia=ler.nextInt();
			}
			dia-=1;

			System.out.println("Selecione a hora do envento [0/23]: ");
			hora=ler.nextInt();
			while(hora<0 || hora>23){
			System.out.println("\nnumero inserido invalido,\n\nSelecione a hora do envento [0/23]: ");
			hora=ler.nextInt();
			}
			
			System.out.println("Escreva o evento:\n");
			agenda[dia][hora]=ler.next();
			
			System.out.println("mostrar todos os eventos cadastrados? [1- Sim/2- Não]: ");
			opcao=ler.nextInt();
			
			while(opcao<1||opcao>2) {
				System.out.println("Por favor, escolha uma das opções disponiveis: ");
				opcao=ler.nextInt();
			}
			if(opcao==1){
				opcao=2;
			}else {
				opcao=1;
			}
		}
		if(opcao==2) {
			System.out.printf("Olá, %s, Os eventos cadastrados para a sua agenda são: \n",nome);
			
			for(int d = 0; d< 31; d++)
			{
				for(int h = 0; h<24; h++)
				{
					if( agenda[d][h] != null)
					{
							System.out.printf("Dia %d às %d:00h - %s\n",(d+1),h,agenda[d][h]);
					}
				}
			}
			System.out.println("\n#Pressione para seguir para o menu");
			opcao=ler.nextInt();
		}else {
			break;
		}
		}while(true);
	}
}