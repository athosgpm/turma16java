package exercicio03;

public class Estoque {

	private int id;
	private String descricao;
	private int quantidade;
	private double valor;
	
	public Estoque(int id, String descricao, int quantidade, double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Estoque() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
    public String toString(){
        return  id + "\t" + quantidade + "\t" + valor + "\t" + descricao;
    }
	
	
}
