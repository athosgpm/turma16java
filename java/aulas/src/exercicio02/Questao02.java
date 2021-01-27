package exercicio02;

import java.util.Scanner;

public class Questao02 {
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
			if(b>=c) {
				System.out.printf("%d -> %d -> %d",c,b,a);
			}else {
				System.out.printf("%d -> %d -> %d",b,c,a);
			}
		}else if(b>=a && b>=c) {
			if(a>=c) {
				System.out.printf("%d -> %d -> %d",c,a,b);
			}else {
				System.out.printf("%d -> %d -> %d",a,c,b);
			}
		}else if(c>=a && c>=c){
			if(a>=b) {
				System.out.printf("%d -> %d -> %d",b,a,c);
			}else {
				System.out.printf("%d -> %d -> %d",a,b,c);
			}
		}
	}

}
