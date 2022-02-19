package Aulas;

public class TesteEmpregados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregados[] lista = new Empregados[3];
		
		lista[0] = new Empregados("Ana Kélvia", 10000);
		lista[1] = new Empregados("Lucas Theberge", 11000);
		lista[2] = new Empregados("Adrielle Barros", 15000);
		
		for(Empregados passar:lista)
		{
			passar.imprimir();
		}
		
		System.out.println("***************");
		
		for(Empregados passar:lista)
		{
			passar.aumentarSalario(10);
			passar.imprimir();
		}
		
		
	}

}