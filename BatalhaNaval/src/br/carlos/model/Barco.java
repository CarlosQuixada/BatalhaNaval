package br.carlos.model;

import java.util.List;

public class Barco {
	private char tipo;
	private int tamanho;
	private List<int[][]> posicoes;

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public List<int[][]> getPosicoes() {
		return posicoes;
	}

	public void setPosicoes(List<int[][]> posicoes) {
		this.posicoes = posicoes;
	}

}
