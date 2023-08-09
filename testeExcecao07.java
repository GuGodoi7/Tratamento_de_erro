package br.com.fiap.main;

import javax.swing.JOptionPane;

public class testeExcecao07 {

	public static void main(String[] args) {
		String aux;
		int numero;
		try {
			aux = JOptionPane.showInputDialog("Digite um nº inteiro entre 1 e 20 ");
			numero = Integer.parseInt(aux);
			if (numero >= 1 && numero  <= 20) {
				JOptionPane.showInputDialog("Vc digitou: " + numero);
			} else {
				throw new Exception ("Valor fora da faixa permitida ");

			}
			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		JOptionPane.showMessageDialog(null, "*_* fim de programa *_*");
		
	}

}
