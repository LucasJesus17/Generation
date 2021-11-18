package Herança;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro Animal1 = new Cachorro("Jorge", 15, "AU AU");
		Cavalo Animal2 = new Cavalo("Antonio", 62, "IROOO");
		Pregica Animal3 = new Pregica("Mario", 35, "Hmm");
		
		Animal1.imprimirInfo();
		Animal2.imprimirInfo();
		Animal3.imprimirInfo();

		
	}

}
