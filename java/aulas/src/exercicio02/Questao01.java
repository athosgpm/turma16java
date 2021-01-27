package exercicio02;

import java.util.Scanner;

public class Questao01 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.println("Escreva o numero inteiro positivo: ");
		x = ler.nextInt();
		
		if (x<0) {
			System.out.println("O numero que você escreveu é negativo");
		}else if(x==0){
			System.out.println("O numero zero é par");
		}else if(x%2==0) {
			System.out.printf("\nO numero %d é par",x);
		}else {
			System.out.printf("\nO numero %d é impar",x);
		}
	}
}
