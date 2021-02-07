package entidades;

public class Q06ContaBank {
	private int conta;
	private String nome;

	public Q06ContaBank(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override 
	public String toString() {
		return "esta é a conta de: "+nome;
	}
}
