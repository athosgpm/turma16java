package entidadesEcommerce;

public class Pagamento {
	
	private double totalGeral;
	private double imposto;
	private Carrinho carrinho;
	
	public Pagamento(double totalGeral, double imposto, Carrinho carrinho) {
		this.totalGeral = totalGeral;
		this.imposto = imposto;
		this.carrinho = carrinho;
	}

	public Pagamento() {
		super();
	}

	public double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(double totalGeral) {
		this.totalGeral = totalGeral;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	public double valorTotalGeral(double juros) {
		totalGeral=carrinho.valorSubtotal()*juros;
		return totalGeral;
	}
	
	public double calcularImposto() {
		imposto=carrinho.valorSubtotal()*0.09;
		return imposto;
	}
	
}
