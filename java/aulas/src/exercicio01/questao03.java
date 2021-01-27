package exercicio01;

import java.util.Scanner;

public class questao03 {
	public static void main(String args[]) {
		int hora, minuto, segundo;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva quantos segundos durou o evento da fabrica: ");
		segundo = ler.nextInt();
		
		hora=segundo/3600;
		minuto=(segundo%3600)/60;
		segundo=(segundo%3600)%60;
		
		System.out.println("O evento de fabrica durou: ");
		System.out.print(hora);
		System.out.print(" horas, ");
		System.out.print(minuto);
		System.out.print(" minutos e ");
		System.out.print(segundo);
		System.out.print(" segundos!");
	}
}
