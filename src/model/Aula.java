package model;

public class Aula implements Comparable<Aula> {

    private int tempo;

    private String titulo;

    // constructors
    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    // getters and setters

    public int getTempo() {
        return tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    // methods

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }

    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
}
