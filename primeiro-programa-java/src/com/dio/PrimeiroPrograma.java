package com.dio;

import java.util.Scanner;

import com.dio.model.Calculadora;
import com.dio.model.Gato;
import com.dio.model.Livros;

public class PrimeiroPrograma {
	
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		Livros livros = new Livros();
		
		System.out.println(gato);
		
		System.out.println(livros);
		
		// Calculadora c = new Calculadora();
		
		int a = 2;
		int b = 3;
		
		int soma = Calculadora.soma(a,b);
		
		System.out.println(soma);
		
		// System.out.println("Olá Mundo! " + (a+b));
		
	}

}
