package entidades;

public class Q00Pessoas 
{
	//atributos
	public String nome;
	public char sexo;
	public int anoNascimento;
	
	
	public int idade()
	{
		return 2021 - anoNascimento;
	}
	
	public void mostraIdade()
	{
		System.out.println(2021 - anoNascimento);
	}
	
	public String statusTratamento() {
		if (sexo=='M') {
			return "Sr.";
		} else if(sexo=='F') {
			return "Sra.";
		}else {
			return "Sre.";
		}
	}
	
	public String statusIdade()
	{
		int idade;
		String mensagem;
		idade = 2021 - anoNascimento;
		if (idade <18) 
		{
			mensagem = "Jovem menor de 18 anos.\n Infelizmente, você não pode entrar";
		} else
		{
			mensagem = "Cliente maior de 18 anos.\nPor aqui camarada, como podemos lhe servir! ";
		}
		return mensagem;
	}
	
}


/*
package entidades;

public class Pessoas {
	//ATRIBUTOS
	
	public String nome;
	public char sexo;
	public int anoNascimento;
	 
	 * herança
	 * abstração
	 * delegação de responsabilidade
	 * segurança
	 
	
	
	
	
	//CONSTRUTORES
	public Pessoas() { //construtores tem o mesmo nome que a classe
	// botão direito>source>generate contructors using fields
	 *	this.nome = nome;
	 *
	}
	//~sobrecargas
	
	//ENCAPSULAMENTO
	
	//METODOS
	//~sobrecargas
	
	public int idade() {
		int idade;
		
		
		return 2021-anoNascimento;
	}
	
	//OVERHIDE
	//*sobrecarga da sobrecarga
	
}

*/
