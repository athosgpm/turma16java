package exercicio03;

import java.util.Scanner;

public class Q02ParImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,par=0,impar=0;
		
		for(int i=0;i<10;i++) {
			System.out.printf("digite o %dº numero",(i+1));
			a = ler.nextInt();
			
			if(a%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.printf("Você digitou %d numeros pares e %d numeros impares",par,impar);
	}
}
