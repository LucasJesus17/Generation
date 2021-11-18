package Polimorfismo;


	public class Preguica extends Animal {

		public Preguica()
		{
			super("Animal Preguiça");
		}
		
		@Override
		public void nome(String nomeAnimal)
		{
			System.out.println("\nNome da preguiça: "+nomeAnimal);
		}
		
		@Override
		public void idade(int idadeAnimal)
		{
			System.out.println("\nIdade da preguiça: "+idadeAnimal);
		}
		
		@Override
		public void som(String somAnimal)
		{
			System.out.println("\nSom que a sua preguiça emite: "+somAnimal);
		}
		
		public void SubirArvores()
		{
			System.out.println("\nUma das características da preguiça é subir em árvores!!!");
		}
	}


