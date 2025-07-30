package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante01= new Estudante();
        Estudante estudante02= new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "LArada";
        estudante01.idade = 56;
        estudante01.sexo = "F";

        estudante02.nome = "miranda";
        estudante02.idade = 16;
        estudante02.sexo = "F";

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
