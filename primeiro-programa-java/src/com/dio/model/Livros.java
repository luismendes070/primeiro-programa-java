package com.dio.model;

import java.util.Objects;

public class Livros {
	
	private String nome;
	private String npag;
	
	public Livros() {
		super();
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
	
}
