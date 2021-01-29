package exercicio04;

import java.util.Scanner;

public class Q00PontosTimes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//String times[] = new String[4];
		String times[] = {"teme1","time2","time3","time4"};
		int pontos[] = new int[4];
		int resultado;
		for(int j=0;j<4;j++) {
			System.out.printf("#Placar da %dª rodada\n",(j+1));
			for(int i=0;i<4;i++) {
				System.out.printf("O time %s (1-ganhou/2-empatou/3-perdeu)",times[i]);
				resultado=ler.nextInt();
				
				while(resultado<1||resultado>3) {
					System.out.println("Por favor, insira uma das opções disponiveis:");
					resultado=ler.nextInt();
				}
				
				if(resultado==1) {
					pontos[i]+=3;
				}else if(resultado==2) {
					pontos[i]+=1;
				}
			}
		}
		System.out.println("\n#CLASSIFICAÇÃO:");
		for(int i=0;i<4;i++) {
			System.out.printf("O time %s obteve %d pontos\n",times[i],pontos[i]);
		}
		System.out.println("\nObrigado por acessar!");
	}
}
