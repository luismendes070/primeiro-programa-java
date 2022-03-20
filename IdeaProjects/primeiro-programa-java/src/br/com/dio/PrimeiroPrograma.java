package br.com.dio;

import br.com.dio.model.Calculadora;
import br.com.dio.model.Gato;
import br.com.dio.model.Livros;

import java.util.Scanner;

public class PrimeiroPrograma {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Gato gato = new Gato();
        // System.out.println(gato);

        Livros livro1 = new Livros("O Problema dos Três Corpos.", 300);
        System.out.println(livro1);

        int a, b;

        System.out.println("Digite o primeiro valor.");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor.");
        b = scan.nextInt();

        System.out.println(Calculadora.soma(a,b));
    }
}
