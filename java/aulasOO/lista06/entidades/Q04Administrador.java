package entidades;

public class Q04Administrador extends Q01Pessoa {

	public Q04Administrador() {
		super();
	}
	
	public Q04Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
