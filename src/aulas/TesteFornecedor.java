package Aulas;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fornecedor fornecedor = new Fornecedor("Otávio", "Rua Paulista", "83460515839", 956792523, 45, "Óleo", 5600, 15);
		fornecedor.imprimirInfo();
		fornecedor.calcularDesconto();
	}

}
