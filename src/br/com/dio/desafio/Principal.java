package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Principal {
	public static void main(String[] args) {

		Curso curso1 = new Curso("Curso Java", "Sintaxe Basica", 8);

		Mentoria mentoria1 = new Mentoria("Java essencial", "Torne-se um dev programador", LocalDate.now());

		Bootcamp bootcamp1 = new Bootcamp("Bootcamp Java Developer", "Produzindo com Java");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(mentoria1);

		Dev dev1 = new Dev("Liane");
		dev1.inscreverBootcamp(bootcamp1);
		dev1.getConteudoConcluido().add(curso1);
		dev1.progredir();
		System.out.println(dev1.getConteudoInscrito());
		System.out.println(dev1.getConteudoConcluido());

		Curso curso2 = new Curso("Curso IA generativa", "Prompt essencais", 8);

		Mentoria mentoria2 = new Mentoria("Fixando Conteúdo", "IA Generativa", LocalDate.now());

		Bootcamp bootcamp2 = new Bootcamp("Bootcamp IA Generativa", "Produzindo com IA");
		bootcamp2.getConteudos().add(curso2);
		bootcamp2.getConteudos().add(mentoria2);

		Dev dev2 = new Dev("João");
		dev2.inscreverBootcamp(bootcamp2);
		dev2.progredir();
		System.out.println(dev2.getConteudoInscrito());

	}

}
