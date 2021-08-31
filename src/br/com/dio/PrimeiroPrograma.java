package br.com.dio;

import br.com.dio.model.gatos;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		gatos gato = new gatos();
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("hello World " + (a+b));*/
	}

	}

class Livros{
	private String nome;
	private String npag;
}
