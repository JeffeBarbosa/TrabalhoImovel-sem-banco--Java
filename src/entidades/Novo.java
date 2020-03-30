package entidades;


public final class  Novo extends Imovel{

	private String data;

	
	public Novo(String nome, String endereco, double area, double valor,String data) {
		super(nome, endereco, area, valor);
		this.data=data;
	}
	
	@Override
	public double mostrarValorVenda() {
		Double resultado=this.getValor()+(this.getValor()*0.1);
		return resultado;
	}

	@Override
	public String toString() {
		return "   Imovel Novo " +
				"\nProprietario = " + getNome() + 
				"\nEndereço = " + getEndereco() + 
				"\nÁrea = " + String.format("%.2f", getArea()) +
				"\nData Disponivel = " + this.data ;
	}
	
}
