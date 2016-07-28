package br.carlos.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.carlos.controller.ControllerTabuleiro;
import br.carlos.model.Posicao;

import javax.swing.JButton;

public class TelaJogo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaJogo() {
		ControllerTabuleiro control_tabuleiro = new ControllerTabuleiro();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		List<Posicao> posicoes_jogador = control_tabuleiro.getTabuleiro_jogador();
		
		String ref_primeiraLetra = "0";
		int ref_x = 13;
		int ref_y = 23;
		for (Posicao pos : posicoes_jogador) {
			if (ref_primeiraLetra.equals(pos.getNome().substring(0, 1))) {
				System.out.print(pos.getNome() + " ");
				if (pos.getNome().substring(1, 2).equals("0")) {
					ref_x = 13;
					pos.getBotao().setBounds(ref_x, ref_y, 98, 26);
					pos.getBotao().setName(pos.getNome());
					contentPane.add(pos.getBotao());
				} else {
					ref_x = ref_x + 110;
					pos.getBotao().setBounds(ref_x, ref_y, 98, 26);
					pos.getBotao().setName(pos.getNome());
					contentPane.add(pos.getBotao());
				}
			} else {
				System.out.println();

				if (pos.getNome().substring(1, 2).equals("0")) {
					ref_x = 13;
					ref_y = ref_y + 39;
					pos.getBotao().setBounds(ref_x, ref_y, 98, 26);
					contentPane.add(pos.getBotao());
				} else {
					ref_x = ref_x + 110;
					ref_y = ref_y + 39;
					pos.getBotao().setBounds(ref_x, ref_y, 98, 26);
					pos.getBotao().setName(pos.getNome());
					contentPane.add(pos.getBotao());
				}

				System.out.print(pos.getNome() + " ");
				ref_primeiraLetra = pos.getNome().substring(0, 1);
			}

		}
	}
}
