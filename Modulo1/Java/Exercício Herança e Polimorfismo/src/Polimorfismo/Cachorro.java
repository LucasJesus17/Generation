package Polimorfismo;

public class Cachorro extends Animal{

		public Cachorro()
		{
			super("Animal Cachorro");
		}
		
		@Override
		public void nome(String nomeAnimal)
		{
			System.out.println("\nNome do cachorro: "+nomeAnimal);
		}
		
		@Override
		public void idade(int idadeAnimal)
		{
			System.out.println("\nIdade do cachorro: "+idadeAnimal);
		}
		
		@Override
		public void som(String somAnimal)
		{
			System.out.println("\nSom que o seu cachorro emite: "+somAnimal);
		}
		
		public void Corre()
		{
			System.out.println("\nUma das características do cachorro é correr!!!");
		}

}
