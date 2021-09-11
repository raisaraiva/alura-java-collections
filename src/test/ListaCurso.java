package test;

import model.Aluno;
import model.Aula;
import model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ListaCurso {

	public static void test() {

		Curso curso = new Curso("Nome do curso", "Instrutor");

		curso.adiciona(new Aula("Aula (UM)", 2));
		curso.adiciona(new Aula("AULA (DOIS)", 3));
		curso.adiciona(new Aula("AULA (TRÊS)", 1));

		List<Aula> aulas = curso.getAulas();

		System.out.println("Aulas: ");

		System.out.println(aulas);

		System.out.println("Tempo total do curso: " + curso.getTempoTotal());

		curso.matricula(new Aluno("A", 1));
		curso.matricula(new Aluno("B", 2));
		curso.matricula(new Aluno("C", 3));

		Set<Aluno> alunos = curso.getAlunos();

		System.out.println(alunos);
		
		System.out.println("Quem é o aluno com matricula 2?");

		Aluno aluno = curso.buscaMatriculado(2);

		System.out.println("Aluno: " + aluno.getNome());
	}
}
