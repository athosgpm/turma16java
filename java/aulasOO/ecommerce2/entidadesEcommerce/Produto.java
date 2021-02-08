package entidadesEcommerce;

public class Produto {

	private String id;
	private String descricao;
	private int qtdProduto;
	private double valor;
	
	
	public Produto(String id, String descricao, int qtdProduto, double valor) {
		this.id = id;
		this.descricao = descricao;
		this.qtdProduto = qtdProduto;
		this.valor = valor;
	}

	public Produto() {

	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public double getvalor() {
		return valor;
	}

	public void setvalor(double valor) {
		this.valor = valor;
	}
	
	@Override
	 public String toString(){
		 return  "\t"+id +"\t|\t"+ qtdProduto +"\t|\t"+ String.format("%.2f", this.valor) +"\t|\t"+ descricao;
	}
}
