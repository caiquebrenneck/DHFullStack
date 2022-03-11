package Aulas;

public interface Figuras {

	public String nomeInteface = "Figuras";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal(); // ja é publico
	
	
}
