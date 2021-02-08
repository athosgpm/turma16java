package entidadesEcommerce;

public class Cliente
{
	private String nome = "";
	private char sexo = '░';
	
	public Cliente(String nome, char sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Cliente()
	{
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return sexo;
	}
	public void setGenero(char sexo) {
		this.sexo = sexo;
	}
	
	public String tratamentoGenero()
	{
		if (sexo == 'M')
		{
			return "Sr. ";
		}
		else if (sexo == 'F')
		{
			return "Sra. ";
		}
		else if (sexo == '░')
		{
			return "";
		}
		else {
			return "Sre. ";
		}
		
	}
}
