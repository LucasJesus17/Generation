package Polimorfismo;

public class Cavalo extends Animal{
	public Cavalo()
	{
		super("Animal Cavalo");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade do cavalo: "+idadeAnimal);
	}
	
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom que o seu cavalo emite: "+somAnimal);
	}
	
	public void Corre()
	{
		System.out.println("\nUma das caracter�sticas do cavalo � correr!!!");
	}

}


