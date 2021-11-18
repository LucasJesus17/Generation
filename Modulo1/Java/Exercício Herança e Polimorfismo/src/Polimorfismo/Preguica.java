package Polimorfismo;


	public class Preguica extends Animal {

		public Preguica()
		{
			super("Animal Pregui�a");
		}
		
		@Override
		public void nome(String nomeAnimal)
		{
			System.out.println("\nNome da pregui�a: "+nomeAnimal);
		}
		
		@Override
		public void idade(int idadeAnimal)
		{
			System.out.println("\nIdade da pregui�a: "+idadeAnimal);
		}
		
		@Override
		public void som(String somAnimal)
		{
			System.out.println("\nSom que a sua pregui�a emite: "+somAnimal);
		}
		
		public void SubirArvores()
		{
			System.out.println("\nUma das caracter�sticas da pregui�a � subir em �rvores!!!");
		}
	}


