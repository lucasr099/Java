package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionarios;

public class FuncionariosTest1 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();

        funcionarios.setNome("Lucas");
        funcionarios.setIdade(23);
        funcionarios.setSalario(new double[]{1800.00, 2000.00, 3900.0});

        funcionarios.imprime();
        System.out.println("Média " + funcionarios.getMedia());
    }
}






