package entidades;

public class Pessoa {

	public String nome;
	public char sexo;
	public int anoNascimento;
	public boolean taVivo;
	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, boolean taVivo) {
		this.nome = nome;
		this.taVivo = taVivo;
	}

	public void nome() {
		System.out.println(nome);
	}
	
	public int idade()
	{
		int idade;
		idade=2021 - anoNascimento;
		return idade;
	}
	
	public String statusTratamento() {
		String mensagem;
		if (sexo=='M') {
			mensagem = "Sr.";
		} else if(sexo=='F') {
			mensagem = "Sra.";
		}else {
			mensagem = "Sre.";
		}
		return mensagem;
	}
	
	
}
