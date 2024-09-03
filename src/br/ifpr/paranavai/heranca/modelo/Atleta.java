package br.ifpr.paranavai.heranca.modelo;

public class Atleta extends Aluno {

	private String modalidadeEsportiva;

	public Atleta() {
		super();
	}

	public Atleta(String nome, String cpf, int matricula, String modalidadeEsportiva, String endereco, String contaCorrente) {
		super(nome, cpf, matricula, endereco,contaCorrente);
		this.modalidadeEsportiva = modalidadeEsportiva;
		//super.setNome(nome);
	}

	public String getModalidadeEsportiva() {
		return modalidadeEsportiva;
	}

	public void setModalidadeEsportiva(String modalidadeEsportiva) {
		this.modalidadeEsportiva = modalidadeEsportiva;
	}

	
	
}
