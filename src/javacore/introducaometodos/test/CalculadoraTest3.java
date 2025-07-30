package javacore.introducaometodos.test;

import javacore.dominio.Estudante;
import javacore.dominio.Professor;
import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        double result = calculadora.divideDoisNumeros(100.00,20.00);
        System.out.println(result);
    }

    public static class EstudanteTeste {
        public static void main(String[] args) {
            Estudante estudante = new Estudante();
            estudante.nome = "Lucas";
            estudante.idade =  15;
            estudante.sexo = "M";

            System.out.println(estudante.idade);
            System.out.println(estudante.sexo);

        }
    }

    public static class Professortest01 {
        public static void main(String[] args) {
            Professor professor = new Professor();
            professor.nome = "Lucas raiz";
            professor.idade = 23;
            professor.sexo = "M";
            System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
        }
    }
}
