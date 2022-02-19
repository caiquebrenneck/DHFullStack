package Aulas;

public class TesteAutomovel {

	public static void main(String[] args) {

		// instanciando um objeto da classe Automovel

		Automovel auto = new Automovel("Rejane Santos", "Celta", "RSA2J34", 2015);

		auto.imprimirInfo();
		System.out.println("\n***************************");
		System.out.println("\nTransferência de Propietário");
		auto.setNomeProprietario("Emily Pellini");
		System.out.println("\n***************************");
		auto.imprimirInfo();

	}

}
