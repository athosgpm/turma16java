package BANK16;

public class Conta {

	private String numero;
	private String cpf;
	private double saldo;
	
	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	public String getNumero() {
		return numero;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void creditar(double valor) {
		if(valor<0) {
			System.out.println("Valor digitado invalido!");
		} else {
			saldo+=valor;
		}
	}
	
	public void debitar(double valor) {
		if(valor<0) {
			System.out.println("Valor digitado invalido!");
		} else if ((saldo-valor)<0) {
			System.out.println("Sua conta não possui saldo suficiente para esta operação");
		} else {
			saldo-=valor;
		}
	}
	
	
	
}
