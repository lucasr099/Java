package javacore.Associao.teste;

import javacore.Associao.dominio.Escola;
import javacore.Associao.dominio.Professor;

public class Escolatest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jesus");
        Professor professor1 = new Professor("Deus");
        Professor[] professors = {professor, professor1};
        Escola escola = new Escola("Mundo", professors);

        escola.imprime();
    }
}
