package QuestoesLoop;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
		* categorias:
		* Infantil A = 5 a 7 anos
		* Infantil B = 8 a 11 anos
		* Juvenil A = 12 a 13 anos
		* Juvenil B = 14 a 17 anos
		* Adultos = Maiores de 18 anos
		 */

		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a idade do nadador?");
		idade = leia.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("\n\tClassifica��o: Infantil A");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("\n\tClassifica��o: Infantil B");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println("\n\tClassifica��o: Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("\n\tClassifica��o: Juvenil B");
		} else if (idade >= 18) {
			System.out.println("Classifica��o: Adulto");
		} else {
			System.out.println("Voc� ainda n�o possui idade o suficiente para nadar.");
		}
	}

}
