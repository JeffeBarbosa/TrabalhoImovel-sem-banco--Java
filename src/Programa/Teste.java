package Programa;

import entidades.Novo;
import entidades.Usado;
import enums.Situacao;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Informe o nome do proprietario");
		String nome=teclado.nextLine();
		System.out.println("Informe o endereço");
		String endereco=teclado.nextLine();
		System.out.println("Informe o tamanho da área");
	    double area=teclado.nextDouble();
	    System.out.println("Informe o valor da residencia");
	    double valor=teclado.nextDouble();
	    int altern;
	    do{
	    	System.out.println("O imovel e usado ou novo     1-Novo   2-Usado");
	    	altern=teclado.nextInt();
	    	if((altern<1) || (altern>2)) {
	    		System.out.println("Entrada invalida");
	    	}
	    }while((altern<1) || (altern>2));
	    if(altern==1) {
	    	teclado.nextLine();
	    	System.out.println("Informe a data que estará disponivel o imovel");
	    	String data=teclado.nextLine();
	    	Novo novo=new Novo(nome,endereco,area,valor,data);
	    	System.out.println(novo);
	    	System.out.println("O valor da venda do imovel é R$ " + String.format("%.2f",novo.mostrarValorVenda()) +" Reais");
	    }
	    else {
	    	teclado.nextLine();
	    	System.out.println("Informe a situação do imovel     1-Desocupado  2-Ocupado  3-Em Reforma");
	    	int situacao=teclado.nextInt();
	    	Situacao x=Situacao.DESOCUPADO;
	    	switch(situacao) {
	    	case 2:
	    		x=Situacao.OCUPADO;
	    		break;
	    	case 3:
	    		x=Situacao.EMREFORMA;
	    		break;
	        }
	    	Usado usado=new Usado(nome,endereco,area,valor,x);
	    	System.out.println(usado);
	    	System.out.println("O valor de venda do imovel é R$ " + String.format("%.2f",usado.mostrarValorVenda())+" Reais");
	    }	
	teclado.close();
	}
}