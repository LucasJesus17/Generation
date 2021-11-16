package Herança;

public class Cavalo extends Animal{
	final String movimento = "Corre";
	private String som;
	
	public Cavalo(String nome, int idade, String som) {
		super(nome,idade);
		this.som = som;
	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public void imprimirInfo() {
		System.out.println("O nome dele é " + getNome() + " ele tem " + getIdade() + " Anos " + som + " este é o som que ele faz e ele " + movimento);		
	}
}
