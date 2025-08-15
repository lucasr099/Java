package javacore.Associao.teste;

import javacore.Associao.dominio.Aluno;
import javacore.Associao.dominio.Local;
import javacore.Associao.dominio.Professor;
import javacore.Associao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua do Parque");
        Aluno aluno = new Aluno("Lucas",23);
        Professor professor = new Professor("Gilson", "Ciência");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario =new Seminario("Raio acontece onde ", alunosParaSeminario,local);

        Seminario[] seminariosDisponivel = {seminario};
        professor.setSeminarios(seminariosDisponivel);
        professor.imprime();
    }
}
