package exercicio01;

import java.util.Scanner;

public class Questao02 {
	public static void main(String args[]) {
		int ano,mes,dia;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva quantos dias de vida vc tem: ");
		dia = ler.nextInt();
		
		ano=dia/365;
		mes=(dia%365)/30;
		dia=(dia%365)%30;
		
		System.out.println("Você possui aproximadamente: ");
		System.out.print(ano);
		System.out.print(" anos, ");
		System.out.print(mes);
		System.out.print(" meses e ");
		System.out.print(dia);
		System.out.print(" dias de vida!");
	}
}
