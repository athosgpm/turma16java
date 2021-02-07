package entidades;

public class Q03Eletronico {
	private int codigo;
	private String marca;
	
	public Q03Eletronico(int codigo, String marca) {
		super();
		this.codigo = codigo;
		this.marca = marca;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override 
	public String toString() {
		return "Produto eletronico da marca: "+marca;
	}
}
