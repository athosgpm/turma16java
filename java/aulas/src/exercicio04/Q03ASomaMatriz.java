package exercicio04;

import java.util.Random;
import java.util.Scanner;

public class Q03ASomaMatriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random num = new Random();
		double N1[][]=new double[4][6];
		double N2[][]=new double[4][6];
		double M1[][]=new double[4][6];

				for(int m=0;m<2;m++)
				{
					for(int l=0;l<4;l++)
					{
						for(int c=0;c<6;c++)
						{
							if(m==0)
							{
								N1[l][c]=num.nextInt(10);
							}
							
							if(m==1)
							{
								N2[l][c]=num.nextInt(10);
							}
							
							M1[l][c] = N1[l][c]	+ N2[l][c];				
						}
					}
				}

				for(int l=0;l<4;l++)
				{	
					System.out.println();
					for(int c=0;c<6;c++)
					{	
					System.out.printf(" | %.2f |",N1[l][c]);
					}
				}
	}
}
