package exercicio02;

import java.util.Scanner;

public class Questao01 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("escreva o valor de A: ");
		a=ler.nextInt();
		System.out.println("escreva o valor de B: ");
		b=ler.nextInt();
		System.out.println("escreva o valor de C: ");
		c=ler.nextInt();
		
		if(a>=b && a>=c) {
			System.out.printf("O maior numero � o: %d",a);
		}else if(b>=a && b>=c) {
			System.out.printf("O maior numero � o: %d",b);
		}else if(c>=a && c>=c){
			System.out.printf("O maior numero � o: %d",c);
		}
		
	}

}
