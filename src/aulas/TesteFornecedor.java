package Aulas;

public class TesteFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fornecedor fornecedor = new Fornecedor("Ot�vio", "Rua Paulista", "83460515839", 956792523, 45, "�leo", 5600, 15);
		fornecedor.imprimirInfo();
		fornecedor.calcularDesconto();
	}

}
