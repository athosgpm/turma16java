package BANK16;

public class Corrente extends Conta{

	public Corrente(String numero, String cpf, int qtMesTalao) {
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}

	private int qtMesTalao;

	public int getQtMesTalao() {
		return qtMesTalao;
	}

	public void setQtMesTalao(int qtMesTalao) {
		this.qtMesTalao = qtMesTalao;
	}
	
	public void emitirTalao(int qtde) {
		if(qtMesTalao>qtde) {
			qtMesTalao--;
		}else {
			System.out.println("Você não pode mais emitir talões!");
		}
	}
	
}
