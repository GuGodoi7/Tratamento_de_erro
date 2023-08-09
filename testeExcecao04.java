package br.com.fiap.main;

public class testeExcecao04 {

	public static void main(String[] args) {
		int [] numeros = {2, 4, 10, 25, 33, 45};
		int [] divisores = {2, 2, 0, 5};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("resultado: " + (numeros[i] /divisores[i]));
			
		}
		
		System.out.println(" *_* FIM DE PROGRAMA *_* ");

	}

}
