package javacore.Contrutoresmetodos.dominio;

public class Anime {
    public String genero;
    private String nome;
    private String tipo;
    private int espisodios;
    private String estudio;

    public Anime(String nome,String tipo, int espisodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
        this.genero = genero;
    }
    public Anime(String nome,String tipo, int espisodios, String genero, String estudio){
        this(nome, tipo, espisodios, genero);
        this.estudio = estudio;
    }
    public Anime(){
        System.out.println("Eu sou vazio!!!!");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.espisodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEspisodios(int espisodios){
        this.espisodios = espisodios;
    }
    public int getEspisodios(){
        return this.espisodios;
    }
}
