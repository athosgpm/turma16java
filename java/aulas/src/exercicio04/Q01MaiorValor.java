package exercicio04;

import java.util.Scanner;

public class Q01MaiorValor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pontos[] = new double[5];
		double maior=0.0;

				for(int i=0;i<5;i++)
				{
					System.out.println("insira o valor da pontuação: ");
					pontos[i]=ler.nextDouble();
					if(pontos[i]>maior)
					{
						maior = pontos[i];
					}
				}
				System.out.println("numeros inseridos:");
				for(int i=0;i<5;i++)
				{
					System.out.printf("%.2f ",pontos[i]);
				}
				
				System.out.printf("\n\no maior numero é: %.2f",maior);
	}
}
