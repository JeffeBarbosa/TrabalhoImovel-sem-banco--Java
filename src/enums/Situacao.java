package enums;

public enum Situacao {
	DESOCUPADO(1,"O imovel esta Desocupado"),
	OCUPADO(2,"O imovel esta Ocupado"),
	EMREFORMA(3,"O imovel esta em reforma");
	
    private int situacao;
    private String situanome;
	
    
    private Situacao(int situacao, String situanome) {
		this.situacao = situacao;
		this.situanome = situanome;
	}


	public int getSituacao() {
		return situacao;
	}


	public String getSituanome() {
		return situanome;
	}


    
}
