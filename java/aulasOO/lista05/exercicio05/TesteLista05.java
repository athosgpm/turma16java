package exercicio05;

import entidades.Q01Cliente;
import entidades.Q02Aviao;
import entidades.Q03Eletronico;
import entidades.Q04Funcionario;
import entidades.Q05Patinete;
import entidades.Q06ContaBank;
import entidades.Q07Paciente;

public class TesteLista05 {

	public static void main(String[] args) {
		Q01Cliente cliente1 = new Q01Cliente(1,"ED");
		Q02Aviao aviao1 = new Q02Aviao(1,"Gol");
		Q03Eletronico prod1 = new Q03Eletronico(1,"brastemp");
		Q04Funcionario func1 = new Q04Funcionario(1,"Rafão");
		Q05Patinete patinete1 = new Q05Patinete(1,"patinete feliz");
		Q06ContaBank conta1 = new Q06ContaBank(1,"Athos");
		Q07Paciente paciente1 = new Q07Paciente(1,"Amante de café");
		
		System.out.println(cliente1);
		System.out.println(aviao1);
		System.out.println(prod1);
		System.out.println(func1);
		System.out.println(patinete1);
		System.out.println(conta1);
		System.out.println(paciente1);		
	}
}
