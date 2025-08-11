package javacore.Modificadorstatic.teste;

import javacore.Modificadorstatic.dominio.Carro;

public class CarroTeste1 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Volvo", 350);
        Carro c3 = new Carro("Audi A3", 300);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
