package javacore.Blocosinicializacao.teste;

import javacore.Blocosinicializacao.dominio.Anime;

public class AnimeTeste1 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }


    }
}
