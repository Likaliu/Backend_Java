package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
		// TODO Auto-generated constructor stub
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * this.cargaHoraria;
	}

}
