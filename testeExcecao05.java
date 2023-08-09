package br.com.fiap.main;

public class testeExcecao05 {

	public static void main(String[] args) {
		int [] numeros = {2, 4, 10, 25, 33, 45};
		int [] divisores = {2, 2, 0, 5};
		
		for (int i = 0; i < numeros.length; i++) {
			try {// Pode ter varios catch e só um try 
				System.out.println("resultado: " + (numeros[i] /divisores[i]));
			} 
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}  
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} finally { //sempre execulta indenpendente se o tray funciona ou não
				System.out.println(" *_* FIM DE PROGRAMA *_* ");
			}
		}	
	}

}
