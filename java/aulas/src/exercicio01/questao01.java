package exercicio01;

import java.util.Scanner;

public class questao01 {
	public static void main(String args[]) {
		int ano, mes, dia;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva quantos anos você tem: ");
		ano = ler.nextInt();
		System.out.println("E quantos meses: ");
		mes = ler.nextInt();
		System.out.println("E quantos dias: ");
		dia = ler.nextInt();
		
		ano=ano*365;
		ano=ano+(mes*30);
		ano=ano+dia;
		
		System.out.println("Você tem aproximadamente: ");
		System.out.print(ano);		
		System.out.print(" dias de vida!");
	}
}
