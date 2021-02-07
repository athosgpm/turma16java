package exercicio01;

public class Cachorro extends Animal implements DeveCorrer{

	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Au! Au!!! Auuuuu!";
	}
	

}
