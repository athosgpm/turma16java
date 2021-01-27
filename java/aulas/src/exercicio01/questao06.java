package exercicio01;

import java.util.Scanner;

public class questao06 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double x1,x2,y1,y2;
		
		System.out.println("Escreva o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Escreva o valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Escreva o valor de X2: ");
		x2 = ler.nextDouble();
		System.out.println("Escreva o valor de Y2: ");
		y2 = ler.nextDouble();
		
		//x1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); //Desse modo funciona mas e se eu quiser a raiz enezima?
		//x1 = Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 1d/2); //por que não funcionou? 
		x1 = Math.round(Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 1d/2)); // vi que precisa arredondar o valor ou usar o metodo de Newton–Raphson.

		
		System.out.printf("Adistancia entre os dois pontos é de: %.2f", x1);
	}
}
