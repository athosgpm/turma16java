package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;
import entidades.Terceiro;

public class TesteCadFun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);
		
		List<Empregado> lista = new ArrayList<>(); 
		Empregado empregado1 = new Empregado();
		Terceiro terceiro1 = new Terceiro();
		
		System.out.print("Enter the number of employees: ");
		int n = ler.nextInt();

		for (int i=1; i<=n; i++) {
			
			System.out.println("Você é terceiro (1-Sim/2-Não)");
			int opcao=ler.nextInt();
			System.out.println("Insira o seu nome: ");
			String nome = ler.next();
			System.out.println("Insira o sua matricula: ");
			int matricula = ler.nextInt();
			System.out.println("Insira o valor de horas trabalhadas no mês: ");
			int horas = ler.nextInt();
			System.out.println("Insira o valor da hora trabalhada");
			double valorHora=ler.nextDouble();
			
	
			if(opcao==1) {
				System.out.println("Insira o valor percentual de acrescimo");
				double acrescimo=ler.nextDouble();
				lista.add(new Terceiro(nome,matricula,horas,valorHora,acrescimo));
			} else {
				lista.add(new Empregado(nome,matricula,horas,valorHora));
			}
		}
		
		System.out.println("\nPAGAMENTOS: ");
		for(Empregado emp : lista) {
			System.out.println(emp.getNome()+" - $ "+ String.format("%.2f", emp.salario()));
		}
		
	}

}

