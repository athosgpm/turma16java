package exercicio03;

import java.util.Scanner;

public class Q06SomaDiv3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,soma=0;
		
		do {
			System.out.println("Digite o valor do numero: ");
			a=ler.nextInt();
			if(a%3==0) {
				soma+=a;
			}
		}while(a!=0);
		
		System.out.printf("O valor da soma dos numeros �: %d",soma);
	}
}
