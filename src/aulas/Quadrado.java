package Aulas;

public class Quadrado extends BaseFigura implements Figuras {

	Quadrado(double lado, String nome){
		super(lado, lado, nome);
		nomeClass = "Quadrado";
		
	}
	
	@Override
	public double getDiagonal() {
		return Math.sqrt(2) * lado1;
	}
}
