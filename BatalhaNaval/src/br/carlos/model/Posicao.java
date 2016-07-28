package br.carlos.model;

import javax.swing.JButton;

public class Posicao {
	private JButton botao;
	private String nome;
	private Barco barco;
	
	public Posicao(String nome) {
		botao = new JButton(nome);
		this.nome = nome;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public JButton getBotao() {
		return botao;
	}

	public String getNome() {
		return nome;
	}
}
