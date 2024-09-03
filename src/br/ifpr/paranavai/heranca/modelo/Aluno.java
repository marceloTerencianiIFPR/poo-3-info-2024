package br.ifpr.paranavai.heranca.modelo;

public class Aluno {
	private String nome;
	private String cpf;
	private int matricula;
	private String endereco;
	private String contaCorrente;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String cpf, int matricula, String endereco, String contaCorrente) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
		this.contaCorrente = contaCorrente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	
}
