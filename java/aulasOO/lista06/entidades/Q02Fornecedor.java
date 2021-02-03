package entidades;

public class Q02Fornecedor extends Q01Pessoa {
	
	public Q02Fornecedor() {
		super();
	}
	
	public Q02Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	private double valorCredito;
	private double valorDivida;
	
	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
