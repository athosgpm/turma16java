package exercicio01;

import java.util.Scanner;

public class questao04 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Escreva o valor de A: ");
		a = ler.nextInt();
		System.out.println("Escreva o valor de B: ");
		b = ler.nextInt();
		System.out.println("Escreva o valor de C: ");
		c = ler.nextInt();

		a = (int) Math.pow(a+b, 2);
		b = (int) Math.pow(b+c,2);
		c = (a+b)/2;
		
		System.out.println("O resultado da expressão é: "+c);
	}
}
