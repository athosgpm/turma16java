package exercicio04;

import java.util.Scanner;

public class Q04SomaValorDiag {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double N1[][]=new double[3][3];
		double somaTotal=0.0, somaDiagonal=0.0;

				for(int l=0;l<3;l++)
				{
					for(int c=0;c<3;c++)
					{
						System.out.printf("insira o valor da matriz, Linha %d Coluna %d: ",c,l);
						N1[l][c]=ler.nextDouble();
		               	
				     	somaTotal +=  N1[l][c];
		               
		              	if(l==c)
		               	{
		               		somaDiagonal += N1[l][c];
		               	}
					}
				}
			System.out.printf("\nA soma de todos os valores da matriz é: %.2f",somaTotal);
			System.out.printf("\nA soma de todos os valores da diagonal principal da matriz é: %.2f",somaDiagonal);
	}

}
