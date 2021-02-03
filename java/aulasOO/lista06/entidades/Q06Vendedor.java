package entidades;

public class Q06Vendedor extends Q01Pessoa {
	
	public Q06Vendedor() {
		super();
	}
	
	public Q06Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	private double valorVendas;
	private double comissao;
	
	public double salarioVendedor() {
		return valorVendas*(1+(comissao/100));
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
