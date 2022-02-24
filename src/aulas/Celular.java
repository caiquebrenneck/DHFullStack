package Aulas;

public class Celular extends Telefone {

	public Celular() {
		super("Telefone Celular");
	}

	@Override
	public void toca(int codigoToque) {
		switch (codigoToque) {
		case 1:
			System.out.println("\nShalamar... shalamar");
			break;
		case 2:
			System.out.println("\nTanannan mama");
			break;
		default:
			System.out.println("\nTa tana ta tananan");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número " + numero + " é um celular...");
	}
}
