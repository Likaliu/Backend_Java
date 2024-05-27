package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	private String titulo;
	private String descricao;
	protected final static double XP_PADRAO = 10d;

	public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public abstract double calcularXp();

}
