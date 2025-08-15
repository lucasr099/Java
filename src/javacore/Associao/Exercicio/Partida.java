package javacore.Associao.Exercicio;

public class Partida {
    private Time timeDaCasa;
    private Time timeVisitante;
    private Estadio estadio;

    public Partida(Time timeDaCasa, Time timeVisitante, Estadio estadio) {
        this.timeDaCasa = timeDaCasa;
        this.timeVisitante = timeVisitante;
        this.estadio = estadio;
    }
    public void imprime() {
        System.out.println("Estádio: " + estadio.getNome() + " - " + estadio.getEndereco());

        System.out.println("Time da Casa: " + timeDaCasa.getNome());
        for (Jogador j : timeDaCasa.getJogadores()) {
            System.out.println(" - " + j.getNome() + " (" + j.getPosicao() + ")");
        }

        System.out.println("Time Visitante: " + timeVisitante.getNome());
        for (Jogador j : timeVisitante.getJogadores()) {
            System.out.println(" - " + j.getNome() + " (" + j.getPosicao() + ")");
        }
    }

    public Time getTimeDaCasa() {
        return timeDaCasa;
    }

    public void setTimeDaCasa(Time timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }


}
