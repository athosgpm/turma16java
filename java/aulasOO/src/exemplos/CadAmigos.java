package exemplos;

import java.util.Scanner;

import entidades.Pessoa;

public class CadAmigos {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		Pessoa cliente = new Pessoa("Athos",true);
		
		System.out.println(cliente.nome);
		System.out.println(cliente.taVivo);
		
		
	}

}