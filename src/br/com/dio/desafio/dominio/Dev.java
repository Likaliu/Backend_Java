package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

	public Dev(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscrito().add(this);

	}

	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		} else {
			System.err.println("Você não está inscrito em nenhum conteúdo.");
		}

	}

	public double calcultarTotalXp() {
		return this.conteudoConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();

	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluido, conteudoInscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluido, other.conteudoConcluido)
				&& Objects.equals(conteudoInscrito, other.conteudoInscrito) && Objects.equals(nome, other.nome);
	}

}
