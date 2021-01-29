package exercicio04;

import java.util.Random;

public class Q02DadoMediaMaior {
	public static void main(String[] args) {
		Random num = new Random();
		int pontos[]=new int[10];
		int soma=0, maior=0, vezes=0;

				for(int i=0;i<10;i++)
				{
					pontos[i] = (num.nextInt(6)+1);

					soma += pontos[i];
					
					if(pontos[i]>maior)
					{
						vezes = 0;
						maior = pontos[i];
					}
					
					if(pontos[i]==maior)
					{
						vezes++;
					}

					System.out.printf("O valor do %dº Lançamento é de: %d\n",(i+1),pontos[i]);
				}
				
				System.out.printf("\nA media dos valores é: %.2f",soma/10.0);
				System.out.printf("\nO maior valor foi: %d. E ele ocorreu: %d vezes",maior,vezes);
	}
}
