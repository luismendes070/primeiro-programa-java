package br.com.dio.model;

import java.util.Objects;

public class Livros {
	
	private String nome;
	private int npag;
	
	public Livros(String nome, int npag) {
		super();
		this.nome = nome;
		this.npag = npag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, npag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(npag, other.npag);
	}

	@Override
	public String toString() {
		return "Livros{" +
				"nome='" + nome + '\'' +
				", npag=" + npag +
				'}';
	}
}
