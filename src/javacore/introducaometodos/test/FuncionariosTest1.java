package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionarios;

public class FuncionariosTest1 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        ImprimirDados imprimirDados = new ImprimirDados();
        funcionarios.nome = "Lucas";
        funcionarios.idade = 23;
        funcionarios.salario = new double[]{1800.00, 2000.00, 3900.0};

        funcionarios.imprime();
        funcionarios.imprimeMediaSalario();
    }
}






