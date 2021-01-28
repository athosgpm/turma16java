package exercicio03;

import java.util.Scanner;

public class Q05Soma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,soma=0;
		
		do {
			System.out.println("Digite o valor do numero: ");
			a=ler.nextInt();
			
			soma+=a;
		}while(a!=0);
		
		System.out.printf("O valor da soma dos numeros é: %d",soma);
	}
}
