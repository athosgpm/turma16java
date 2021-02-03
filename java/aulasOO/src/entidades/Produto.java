package entidades;

public class Produto {
	public String descrição;
	public String codigo;
	public double valor;
	
	public Produto(String descrição, String codigo,double valor) {
		this.codigo = codigo;
		this.descrição = descrição;
		this.valor = valor;
	}

	public Produto(String descrição, String codigo) {
		this.codigo = codigo;
		this.descrição = descrição;
	}

	public Produto(String descrição) {
		this.descrição = descrição;
	}

	public Produto() {
		super();
	}
	
}
