package exercicio03;

import java.util.Scanner;

public class Q03RangeIdade {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;

		System.out.println("escreva um valor de idade (-99 pra parar contagem): ");
		idade = ler.nextInt();

		while (idade != -99) {
			if (idade >= 0 && idade <= 21) {
				menor++;
			} else if (idade >= 50) {
				maior++;
			}
			System.out.println("escreva um valor de idade (-99 pra parar contagem): ");
			idade = ler.nextInt();
		}
		
		// esse codigo conta com o bom senso do usuario, oq é ruim pq ele pode não ter
		System.out.printf("Tem um total de %d usuarios até 21 anos.\n E um total de %d usuarios acima de 50 anos.",menor, maior);
	}
}
