package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		// TODO Auto-generated constructor stub
		this.data = LocalDate.now();
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
	}

}
