package exercicio03;

import java.util.Scanner;

public class Q04Senso {
	public static void main(String[] args) {
		
		//limitação: não pode usar outro laço se não o while.
		
		Scanner ler = new Scanner(System.in);
		final int população=3;
		int cadastro=1,idade,sexo,status,calma=0,mulherNervosa=0,homemAgressivo=0,outrosCalma=0,
				maiorNervosa=0,menorCalma=0;
		
		while(cadastro<=população) {
			
			System.out.println("\nDigite sua idade: ");
			idade=ler.nextInt();
			
			while(idade<0) {
				System.out.println("\nVocê digitou uma idade negativa, tente novamente!\n\n"+
									"Digite sua idade:");
				idade=ler.nextInt();			
			}
			
			System.out.printf("\nDigite seu sexo:\n"+
								"1- Femenino\n"+
								"2- Masculino\n"+
								"3- Outros\n"+
								"Insira aqui: ");
			sexo=ler.nextInt();

			while(sexo<1 || sexo>3) {
				System.out.println("\nO numero digitado não é uma opção valida, tente novamente!\n\n"+
									"Digite seu sexo:\n"+
									"1- Femenino\n"+
									"2- Masculino\n"+
									"3- Outros\n"+
									"Insira aqui: ");
				sexo=ler.nextInt();				
			}
			
			System.out.printf("\nDigite sua caracteristica psicológica:\n"+
								"1- Calma\n"+
								"2- Nervosa\n"+
								"3- Agressiva\n"+
								"Insira aqui: ");
			status=ler.nextInt();
			
			while(status<1 || status>3) {
				System.out.println("\nO numero digitado não é uma opção valida, tente novamente!"+
									"Digite sua caracteristica psicológica:\n"+
									"1- Calma\n"+
									"2- Nervosa\n"+
									"3- Agressiva\n"+
									"Insira aqui: ");
				status=ler.nextInt();
			}
			
			if(status==1) {
				if(sexo==3) {
					outrosCalma++;
				}
				if(idade<18) {
					menorCalma++;
				}
				calma++;
			}else if(status==2) {
				if(idade>40) {
					maiorNervosa++;
				}
				if(sexo==1) {
					mulherNervosa++;
				}
			}else if(status==3 && sexo==2) {
				homemAgressivo++;
			}
			cadastro++;
		}
	
		System.out.printf("\nNumero de pessoas calmas: %d\n"+
							"Numero de mulheres nervosas: %d\n"+
							"Numero de homens agressivos: %d\n"+
							"Numero de pessoas do sexo \"outros\" e calmas: %d\n"+
							"Numero de pessoas com idade maior que 40 e nervosas: %d\n"+
							"Numero de pessoas com idade menor que 18 e calmas: %d\n"
							,calma,mulherNervosa,homemAgressivo,outrosCalma,maiorNervosa,menorCalma);
	}
}
