package entidades;

public class Terceiro extends Empregado {
	
	private double acrescimo ;

	
	public Terceiro() {
		super();
	}
	
	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}
	
	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	@Override
	public double salario() {
		
		return (getHoras() * ((1 + acrescimo)*getValorHora()));
	}	
}