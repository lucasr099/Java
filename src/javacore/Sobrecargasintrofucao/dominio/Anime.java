package javacore.Sobrecargasintrofucao.dominio;

public class Anime {
    public String genero;
    private String nome;
    private String tipo;
    private int espisodios;


    public void init(String nome, String tipo, int espisodios){

        this.nome = nome;
        this.tipo = tipo;
        this.espisodios = espisodios;
    }

    public void  init(String nome, String tipo, int espisodios, String genero){
        this.init(nome, tipo, espisodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.espisodios);
        System.out.println(this.genero);
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
