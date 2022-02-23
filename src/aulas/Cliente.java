package Aulas;

public class Cliente extends Pessoa {

	private String nivel;
	private double valorAPagar;
	private String formaDePagamento;
	private double parcelamento;

	public Cliente(String nome, String endereco, String cpf, int telefone, int idade, String nivel, double valorAPagar,
			String formaDePagamento, double parcelamento) {
		super(nome, endereco, cpf, telefone, idade);
		this.nivel = nivel;
		this.valorAPagar = valorAPagar;
		this.formaDePagamento = formaDePagamento;
		this.parcelamento = parcelamento;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getValorAPagar() {
		return valorAPagar;
	}

	public void setValorAPagar(double valorAPagar) {
		this.valorAPagar = valorAPagar;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(double parcelamento) {
		this.parcelamento = parcelamento;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do operario: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade()
				+ "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nNível: " + nivel
				+ "\nFormaDePagamento: " + formaDePagamento + "\nParcelamento: " + parcelamento);
	}

	public void calcularParcela() {
		double parcela = valorAPagar / parcelamento;
		System.out.println("\nConsiderando o valor " + valorAPagar + " e as quantidades de parcelas " + parcelamento
				+ "\nA parcela mensal será de " + parcela);
	}
}
