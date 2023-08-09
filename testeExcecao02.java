package br.com.fiap.main;

public class testeExcecao02 {

	public static void main(String[] args) {
		int [] numeros = {2, 4, 10, 0, 33};
		try {
			System.out.println(numeros[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(" *_* FIM DE PROGRAMA *_* ");

	}

}
