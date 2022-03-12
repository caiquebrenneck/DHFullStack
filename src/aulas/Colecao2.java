package Aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n---------------");
			System.out.println("\n(1) Deseja adicionar produtos no estoque? ");
			System.out.println("\n(2) Deseja remover produtos do estoque? ");
			System.out.println("\n(3) Deseja atualzar produtos do estoque? ");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque? ");
			System.out.println("\n(0) Deseja sair do programa? ");
			System.out.println("\n---------------");
			System.out.println("\nDigite uma op��o");
			op = ler.nextInt();
			
			switch(op) {

			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar no estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
			System.out.println(estoque);
			break;
			
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String remover = ler.nextLine();
				if(estoque.contains(remover)) {
					estoque.remove(remover);
					System.out.println("\nO produto: " + remover + ", foi removido do estoque.");
					
				} else {
					System.out.println("\nProduto n�o existe no estoque");
				}
				System.out.println(estoque);
			break;
			
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualiar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto  que entrar� no lugar do " + verifica + " : ");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto n�o existe no estoque");
				}
				
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos do estoque s�o: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nOp��o inv�lida.");
			}
		} while(op != 0);
	}
}
















