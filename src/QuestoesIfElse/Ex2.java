package QuestoesIfElse;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
		* horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
		* por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
		* armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
		* trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
		* excedente. */
		
		String operario;
		float horas, salario = 500, excedente, horaExtra, salarioTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tQual seu c�digo de trabalho?");
		operario = leia.nextLine();
		System.out.println("\n\tQuantas horas voc� trabalhou?");
		horas = leia.nextFloat();
		
		if(horas > 50) {
			excedente = (horas - 50);
			horaExtra = (excedente * 20);
			salarioTotal = (horaExtra + salario);
			
			System.out.printf("\nC�digo de oper�rio: %s"
					+ "\nSal�rio: R$%.2f"
					+ "\nHora(s) Extra(s): %.0f hora(s), equivalente a R$%.2f"
					+ "\nSal�rio total: R$%.2f",
					operario,salario,excedente,horaExtra,salarioTotal);
		} else {
			System.out.printf("\nC�digo de oper�rio: %s"
					+ "\nSal�rio total: R$%.2f",
					operario,salario);
		}
	}

}
