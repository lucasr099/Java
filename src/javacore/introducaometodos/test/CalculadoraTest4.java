package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNuemros(num1, num2);
        System.out.println("Dentro Calculadoratest4");
        System.out.println(num1);
        System.out.println(num2);
    }
}
