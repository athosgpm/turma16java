package entidades;

public class Q05Operario extends Q01Pessoa {

	public Q05Operario() {
		super();
	}
	
	public Q05Operario(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	private double valorProducao;
	private double comissao;
	
	public double salarioOperario() {
		return valorProducao*(1+(comissao/100));
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
