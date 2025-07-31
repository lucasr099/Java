package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Pessoa;

public class Pessoatest1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jirayão");
        pessoa.setIdade(70);

    //    pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }


}
