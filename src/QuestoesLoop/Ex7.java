package QuestoesLoop;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
		* (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
		*/
		
		int base,altura,area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o tamanho da base (cm)?");
		base = leia.nextInt();
		System.out.println("Qual a altura (cm)?");
		altura = leia.nextInt();
		
		if (base <= 0 || altura <= 0) {
			System.out.println("Por favor, informe valores maiores do que zero.");
		} else {
			area = (base * altura) / 2;
			System.out.printf("\nA �rea do tri�ngulo �: %dcm�.",area);
		}
	}

}
