package model;

import java.util.*;

public class Curso {

    private String instrutor;

    private String nome;

    private Set<Aluno> alunos = new HashSet<>();

    private List<Aula> aulas = new LinkedList<>();

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    // constructors

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    // getters and setters

    public String getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    // methods

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public Aluno buscaMatriculado(int numero) {
        if (!matriculaParaAluno.containsKey(numero)) {
            throw new NoSuchElementException();
        }

        return matriculaParaAluno.get(numero);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: + " + this.aulas + "]";
    }
}
