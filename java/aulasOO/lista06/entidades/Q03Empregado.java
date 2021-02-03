package entidades;

public class Q03Empregado extends Q01Pessoa {
	
	public Q03Empregado() {
		super();
	}
	
	public Q03Empregado(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public double calcularSalario() {
		return salarioBase*(1-(imposto/100));
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
}
