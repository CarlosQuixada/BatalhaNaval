package br.carlos.model;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private List<Posicao> tabuleiro;
	
	public Tabuleiro(){
		tabuleiro = new ArrayList<>();
	}
	
	public void criarTabuleiro() {
		for(int i = 0;i<10;i++){
			for(int j = 0;j<10;j++){
				tabuleiro.add(new Posicao(i+""+j));
			}
		}
	}

	public List<Posicao> getTabuleiro() {
		return tabuleiro;
	}

}
