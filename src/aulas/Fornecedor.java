package Aulas;

public class Fornecedor extends Pessoa {

	private String produto;
	private double custoProdutos;
	private double desconto;

	public Fornecedor(String nome, String endereco, String cpf, int telefone, int idade, String produto,
			double custoProdutos, double desconto) {
		super(nome, endereco, cpf, telefone, idade);
		this.produto = produto;
		this.custoProdutos = custoProdutos;
		this.desconto = desconto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getCustoProdutos() {
		return custoProdutos;
	}

	public void setCustoProdutos(double custoProdutos) {
		this.custoProdutos = custoProdutos;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do fornecedor: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade()
				+ "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nProduto: " + produto
				+ "\nCustos dos produtos:" + custoProdutos + "\nDesconto em %: " + desconto);
	}
	
	public void calcularDesconto() {
		double custosTotal = custoProdutos - (custoProdutos * (desconto / 100));
		System.out.println("\nO custo dos produtos será de: " + custosTotal);
	}
}
