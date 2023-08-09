package br.com.fiap.main;

import javax.swing.JOptionPane;

public class testeExcecao06 {

	public static void main(String[] args) {
		String aux;
		int numero;
		
		aux = JOptionPane.showInputDialog("Digite um nº inteiro entre 1 e 20 ");
		numero = Integer.parseInt(aux);
		JOptionPane.showInputDialog("Vc digitou: " + numero);
	}

}
