package Exercicios;

public class Aviao {
	private String nome;
	private String empresa;
	private String cor;
	private int numeroVoo;
	private String descricao;
	
	public Aviao(String nome, String empresa, String cor, int numeroVoo, String drescricao) {
		this.nome = nome;
		this.empresa = empresa;
		this.cor = cor;
		this.numeroVoo = numeroVoo;
		this.descricao = drescricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void imprimirAviao() {
		System.out.println("Este é o " + nome + " da empresa " + empresa + " cor " + cor + " voo: " + numeroVoo);
	}
	
	public void descAviao() {
		System.out.println("Mais oque é um avieão? " + descricao);
	}
	
}
