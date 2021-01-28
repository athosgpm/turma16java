package exercicio02;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero;
		
		System.out.println("Escreva um numero par e receba sua raiz quadrada."
						+ "\nEscreva um numero impar e receba o seu valor quadratico."
						+ "\nInsira aqui:");
		numero = ler.nextDouble();
		
		if(numero%2==0) {
			if(numero>=0) {
				System.out.printf("a raiz quadrada de %.2f é: %.2f",numero,Math.sqrt(numero));
			}else {
				System.out.printf("a raiz quadrada de %.2f é: %.2f*i",numero,Math.sqrt(numero*(-1)));
			}
		}else {
			System.out.printf("a potencia quadratica de %.2f é: %.2f",numero,Math.pow(numero,2));
		}
		
	}
}



