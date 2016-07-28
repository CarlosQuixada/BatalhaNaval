package br.carlos.controller;

import java.util.List;

import br.carlos.model.Posicao;
import br.carlos.model.Tabuleiro;

public class ControllerTabuleiro {
	
	private Tabuleiro tabuleiro_jogador;
	private Tabuleiro tabuleiro_adversario;
	
	public ControllerTabuleiro() {
		tabuleiro_jogador = new Tabuleiro();
		tabuleiro_adversario = new Tabuleiro();
		tabuleiro_jogador.criarTabuleiro();
		tabuleiro_adversario.criarTabuleiro();
	}

	public List<Posicao> getTabuleiro_jogador() {
		return tabuleiro_jogador.getTabuleiro();
	}

	public List<Posicao> getTabuleiro_adversario() {
		return tabuleiro_adversario.getTabuleiro();
	}
}
