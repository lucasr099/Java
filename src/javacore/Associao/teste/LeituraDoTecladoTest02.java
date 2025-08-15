package javacore.Associao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grande Software vai te Respinder com sim ou não! ");
        System.out.println("Digite sua pergunta: ");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
