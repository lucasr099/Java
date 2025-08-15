package javacore.Associao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Local local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno) {
        this.titulo = titulo;
        this.aluno = aluno;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this.titulo = titulo;
        this.aluno = aluno;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
