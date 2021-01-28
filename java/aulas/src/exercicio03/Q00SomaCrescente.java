package exercicio03;

import java.util.Scanner;

public class Q00SomaCrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero,cont=0; 
		int soma=0;
		
		System.out.println("insira o numero: ");  	
		numero = ler.nextInt();
		
		//solução while (decrescente)
/*		while (numero>0){
			soma+=numero;			
			numero--;				
		}
		
		while (numero<0){			
			soma+=numero;
			numero++;
		}
*/		
		//solução do...while (imprimindo soma)
		if(numero>0) {
			do {
				cont++;
				System.out.print((cont<=1)?cont:"+"+cont);
				soma+=cont;
			}while(cont<numero);
		}else {
			do {
				System.out.print(numero);
				soma+=numero;
				numero++;
			}while(numero<0);
		}
		
		System.out.printf("=%d",soma); 	
	}
}
