package entidadesEcommerce;

public class ItemCarrinho {

	
	private Produto produto;
	private int qtdCarrinho;
	private double totalItem;
	
	
	public ItemCarrinho(Produto produto, int qtdCarrinho) {
		this.produto = produto;
		this.qtdCarrinho = qtdCarrinho;
		this.totalItem();
	}

	public int getqtdCarrinho() {
		return qtdCarrinho;
	}


	public void setqtdCarrinho(int qtdCarrinho) {
		this.qtdCarrinho = qtdCarrinho;
	}

	public double getTotalItem() {
		return totalItem;
	}

	public void setTotal(double totalItem) {
		this.totalItem = totalItem;
	}
	
	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public double totalItem() {
		double valor = this.produto.getvalor();
		this.totalItem = valor * this.qtdCarrinho;
		
		return this.totalItem;
	}
	
	public String toString(){
		 return "\t"+ produto.getid() +"\t|\t"+ qtdCarrinho+"\t|\t"+ String.format("%.2f", this.produto.getvalor())+"\t|\t"+produto.getdescricao();
	    }
	
}
