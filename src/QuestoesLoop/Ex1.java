package QuestoesLoop;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* (1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
		* rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
		* estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de
		* R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
		* (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
		* vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
		* com o conte�do ZERO.
		*/
		
		float tomate, multa = 0, excesso = 0;
		
		Scanner peso = new Scanner(System.in);
		
		System.out.println("Qual o peso dos tomates (kg)?");
		tomate = peso.nextFloat();
		
		if(tomate > 50) {
			excesso = (tomate - 50);
			multa = (excesso * 4);
			System.out.printf("Voc� ultrapassou %.2fkg do limite m�ximo permitido pelo regulamento e pagar� "
					+ "R$4,00 por kg excedido. O valor de sua multa ser� de: R$ %.2f.", excesso,multa);
		} else {
			System.out.printf("Peso do tomate: %.2fkg;"
					+ "\nPeso excedido: %.0fkg;"
					+ "\nValor da multa: R$%.0f.", tomate,excesso,multa);
		}
	}

}
