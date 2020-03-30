package entidades;

import enums.Situacao;

public class Usado extends Imovel{
	
	private Situacao stats;
	
	public Usado(String nome, String endereco, double area, double valor, Situacao stats) {
		super(nome, endereco, area, valor);
		this.stats=stats;
	}

	@Override
	public double mostrarValorVenda() {
		Double resultado=super.getValor()-(super.getValor()*0.1);
		return resultado;
	}

	@Override
	public String toString() {
		return "     Imovel Usado"  + 
				"\nNome = " + getNome() + 
				"\nEndereço = " + getEndereco() +
				"\nÁrea = " + String.format("%.2f", getArea()) + 
		        "\nSituação = " +stats.getSituanome();
	}

	 



}
