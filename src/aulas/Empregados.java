package Aulas;

import java.text.NumberFormat;

public class Empregados {

	// Criacao dos atributos
	
	private String nome;
	private double salario;

	public Empregados(String nome, double salario) {
		this.setNome(nome);
		this.setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // Coloque a moeda do país
		nf.setMinimumFractionDigits(2); // Indica a quantidade de casa decimal 
		String formatoMoeda = nf.format(salario); // formata um valor para um formtação monetária 
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome + "\t\t" + "Salário: " + this.formatarMoeda());
	}
	
}








