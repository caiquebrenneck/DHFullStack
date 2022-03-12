package Aulas;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = null; 
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) // captura da possivel excecao
		{
			System.out.println("\nA frase inicial est� nula, para solucionar tal problema, "
					+ "foi lhe atribuido um valor default...");
			frase = "Agora tem algo aqui";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antia: " + frase);
		System.out.println("\nNova frase: " + novaFrase);
		
	}

}