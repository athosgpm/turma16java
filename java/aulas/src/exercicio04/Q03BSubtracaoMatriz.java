package exercicio04;

import java.util.Scanner;

public class Q03BSubtracaoMatriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double N1[][]=new double[4][6];
		double N2[][]=new double[4][6];
		double M1[][]=new double[4][6];

				for(int m=0;m<2;m++)
				{
					for(int l=0;l<4;l++)
					{
						for(int c=0;c<6;c++)
						{
							System.out.printf("insira o valor da matriz N%d, Linha %d Coluna %d: ",(m+1),l,c);
							
							if(m==0)
							{
								N1[l][c]=ler.nextDouble();
							}
							
							if(m==1)
							{
								N2[l][c]=ler.nextDouble();
							}
							
							M1[l][c] = N1[l][c]	- N2[l][c];				
						}
					}
				}

				for(int l=0;l<4;l++)
				{	
					System.out.println();
					for(int c=0;c<6;c++)
					{	
					System.out.printf(" | %.2f |",M1[l][c]);
					}
				}
	}
}
