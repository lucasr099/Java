package javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10+20);
    }
    public void diminuirDoisNumeros(){
        System.out.println(99-9);
    }
    public void multiplicadora(int num1, int num2){
        System.out.println(num1 * num2);

    }
    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }
   public void alteraDoisNuemros(int num1, int num2){
        num1 = 99;
        num2 = 33;
       System.out.println("Dentro do alteraDoisNumeros");
       System.out.println("num1 " +num1);
       System.out.println("num2 " + num2);
   }
   public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
       System.out.println(soma);
   }
}
