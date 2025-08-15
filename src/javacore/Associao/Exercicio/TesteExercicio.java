package javacore.Associao.Exercicio;

import java.util.Arrays;

public class TesteExercicio {
    public static void main(String[] args) {
        Estadio estadio = new Estadio("Fonte Nova","Ladeira da Fonte das Pedras, s/n - Nazaré, Salvador - BA, 40050-565" );

        Jogador jogadorBahia = new Jogador("Cauly", "Meia");
        Jogador jogadorBahia1 = new Jogador("Lucho", "Atacante");
        Jogador jogadorFlamengo = new Jogador("Arrascaeta", "Meia");
        Jogador jogadorFlamengo1 = new Jogador("Pedro", "Atacante");
        Jogador [] jogadoresDoBahia = {jogadorBahia,jogadorBahia1};
        Jogador [] jogadoresDoFlamengo = {jogadorFlamengo,jogadorFlamengo1};
        Time Bahia = new Time("Bahia", jogadoresDoBahia);
        Time Flamengo = new Time("Flamengo", jogadoresDoFlamengo);
        Partida partida = new Partida(Bahia,Flamengo,estadio);

        partida.imprime();
    }
}
