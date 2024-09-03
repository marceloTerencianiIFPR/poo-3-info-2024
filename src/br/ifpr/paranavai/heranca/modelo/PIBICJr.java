package br.ifpr.paranavai.heranca.modelo;

public class PIBICJr extends Aluno{
	private String projeto;


	public PIBICJr() {
		super();
	}

	public PIBICJr(String nome, String cpf, int matricula, String projeto, String endereco, String contaCorrente) {
		super(nome, cpf, matricula, endereco, contaCorrente);
		this.projeto = projeto;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	
	

}
