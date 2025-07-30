package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionarios;

public class ImprimirDados {
    public void imprime(Funcionarios funcionarios){
        System.out.println(funcionarios.nome);
        System.out.println(funcionarios.idade);
        System.out.println(funcionarios.salario);

    }
}
