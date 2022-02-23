package Aulas;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente("Tadeu", "Rua não sei", "8387770113936", 95677257, 45, "VIP", 545, "Boleto", 2);
		cliente.imprimirInfo();
		cliente.calcularParcela();
	}

}
