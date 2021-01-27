package exercicio01;

import java.util.Scanner;

public class questao07 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Escreva o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Escreva o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Escreva o valor de C: ");
		c = ler.nextDouble();
		System.out.println("Escreva o valor de D: ");
		d = ler.nextDouble();
		System.out.println("Escreva o valor de E: ");
		e = ler.nextDouble();
		System.out.println("Escreva o valor de F: ");
		f = ler.nextDouble();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.printf("O valor de X é: %.2f",x);
		System.out.printf("\nO valor de Y é: %.2f",y);
	}
}
