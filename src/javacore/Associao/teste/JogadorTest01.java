package javacore.Associao.teste;

import javacore.Associao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 =  new Jogador("CR7");
        Jogador jogador2 =  new Jogador("Messi");
        Jogador jogador3 =  new Jogador("Cauly");
        Jogador jogador4 =  new Jogador("Neymar");

        Jogador[] jogadors = {jogador1,jogador2,jogador3, jogador4};
        for (Jogador jogador : jogadors) {
            jogador.imprime();


        }


    }

}
