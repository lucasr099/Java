package javacore.Herança.Teste;

import javacore.Herança.dominio.Endereco;
import javacore.Herança.dominio.Funcionario;
import javacore.Herança.dominio.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua do Parque, 40");
        endereco.setCep("40320465");
        Pessoa pessoa = new Pessoa("Tanramina");
        pessoa.setCpf("456789844651");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Lucas");
        funcionario.setCpf("789466684654");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5465);
        System.out.println("-----------------------------");
        funcionario.imprime();

    }
}
