package exercicio01;

import java.util.Scanner;

public class Questao08 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double custoFabrica;
		
		System.out.println("Escreva o custo de fabrica: ");
		custoFabrica = ler.nextDouble();
		
		System.out.printf("\nO custo do veiculo para o consumidor é de: %.2f",(custoFabrica*(1+0.28+0.45)));
	}
}
