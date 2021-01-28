package exercicio03;

import java.util.Scanner;

public class Q01Div11Rest5 {
	public static void main(String[] args) {
		
		for(int i=1000;i<2000;i++) {
			if(i%11==5) {
				System.out.printf(" %d",i);
			}
		}
	}
}
