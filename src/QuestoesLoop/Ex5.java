package QuestoesLoop;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
		* ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
		* varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
		* suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
		* intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
		* notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
		* medido e emita a notifica��o adequada aos diferentes grupos de empresas.
		*/
		
		float indice;
		String g1 = "Grupo 1", g2 = "Grupo 2", g3 = "Grupo 3";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t�ndice de polui��o:");
		indice = leia.nextFloat();
				
		if (indice <= 0.25) {
			System.out.println("\n\t�ndice de polui��o em n�vel aceit�vel.");
		} else if (indice < 0.4) {
			System.out.printf("\n\t�ndice de polui��o acima do aceit�vel. "
					+ "%s, interromper as atividades imediatamente.",g1);
		} else if (indice < 0.5) {
			System.out.printf("\n\t�ndice de polui��o acima do aceit�vel. "
					+ "%s e %s, interromper as atividades imediatamente.",g1,g2);
		} else {
			System.out.printf("\n\t�ndice de polui��o acima do aceit�vel. "
					+ "%s, %s e %s, interromper as atividades imediatamente.",g1,g2,g3);
		}
	}

}
