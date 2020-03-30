package entidades;

public class Imovel {

	private String nome;
	private String endereco;
	private double area;
	private double valor;
	public Imovel(String nome, String endereco, double area, double valor) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.area = area;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public double getArea() {
		return area;
	}
	public double getValor() {
		return valor;
	}
	public double mostrarValorVenda() {	
	 return this.valor;
	}
	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "  Imovel \n" +
				 "Proprietario = " + nome + 
				"\nEndereço = " + endereco + 
				"\nÁrea = " + area + 
				"\nValor = " + valor;
	}
	
	
	
}
