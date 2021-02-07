package BANK16;

public class Poupanca extends Conta{

	public Poupanca(String numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
	}

	private int diaAniversario;

	public int getDataAniverssario() {
		return diaAniversario;
	}

	public void setDataAniverssario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void aniversario(int dia) {
		if (diaAniversario==dia) {
			super.creditar(super.getSaldo()*0.0005);;
		} else {
			System.out.println("\nNão é o aniversário da conta!");
		}
	}
	
}
