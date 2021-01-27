package exercicio01;

import java.util.Scanner;

public class Questao05 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double nota1,nota2,nota3;
		
		System.out.println("Escreva a primeira nota:");
		nota1 = ler.nextDouble();
		System.out.println("Escreva a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Escreva a terceira nota: ");
		nota3 = ler.nextDouble();
		
		nota1 = (nota1*2+nota2*3+nota3*5)/10;
		
		System.out.printf("A media do aluno é: %.2f",nota1);
				
	}
}
