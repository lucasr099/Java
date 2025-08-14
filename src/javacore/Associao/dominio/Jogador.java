package javacore.Associao.dominio;

public class Jogador {
    private String nome;
    private Time time;


    public void imprime(){
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());
        }
    }
    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static class Professor {
        private String nome;
        private Professor[] professores;

        public void imprime(){
            System.out.println(this.nome);
            if(professores == null){
                return;
            }
            for (Professor professor : professores) {
                System.out.println(professor.getNome());

            }

        }

        public Professor(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Professor[] getProfessores() {
            return professores;
        }

        public void setProfessores(Professor[] professores) {
            this.professores = professores;
        }
    }
}
