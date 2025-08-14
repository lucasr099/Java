package javacore.Associao.teste;

import javacore.Associao.dominio.Jogador;
import javacore.Associao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cr7");

        Time time = new Time("Bahia");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
