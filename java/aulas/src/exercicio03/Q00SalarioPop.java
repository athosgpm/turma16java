//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.

package exercicio03;

import java.util.Scanner;

public class Q00SalarioPop {
 public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double salario, filhos, maior=0.0,somaSalario=0.0,somaFilho=0.0;
	int contador=0;
	final int populacao=3;
	
	for(int i=0;i<populacao;i++) {
		System.out.printf("Insira o salario do %dº cidadão: ",(i+1));
		salario=ler.nextDouble();
		System.out.printf("Insira o numero de filhos do %dº cidadão: ",(i+1));
		filhos=ler.nextDouble();
		
		somaSalario+=salario;
		somaFilho+=filhos;
		
		if(salario>maior) {
			maior=salario;
		}
		if(salario<=100) {
			contador++;
		}
	}
	
	System.out.printf("\nA media de salario é: %.2f\n",(somaSalario/populacao));
	System.out.printf("A media de filhos é: %.2f\n",(somaFilho/populacao));
	System.out.printf("O maior salario é: %.2f\n",maior);
	System.out.printf("O percentual de pessoas com salario até 100 é: %.2f\n",contador*100.0/populacao);
 }
}
