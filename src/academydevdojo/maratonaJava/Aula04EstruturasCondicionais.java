package academydevdojo.maratonaJava;

public class Aula04EstruturasCondicionais {
    public static void main(String[] args) {
        int idade  = 0;
        boolean isIdadeVerdade = idade >= 18;
        if (isIdadeVerdade){
            System.out.println("Autorizado a compra de bebida ");
        }
        else if (!isIdadeVerdade){
            System.out.println("Não está autorizado a bebida");
        }

    }
}
