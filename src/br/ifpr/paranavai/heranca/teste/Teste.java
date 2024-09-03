package br.ifpr.paranavai.heranca.teste;

import br.ifpr.paranavai.heranca.modelo.Atleta;
import br.ifpr.paranavai.heranca.modelo.PIBICJr;

public class Teste extends Object {

	public static void main(String[] args) {
		
		Atleta atleta = new Atleta("Isaac", "111.111.111-11", 2018001, "Peteca", "Rua R","");
		System.out.println(atleta.getNome());
		PIBICJr jr = new PIBICJr("Ana", "111.111.111-11", 2018001, "Jogos", "Rua R","");
		System.out.println(jr.getNome());
		
	}

}
