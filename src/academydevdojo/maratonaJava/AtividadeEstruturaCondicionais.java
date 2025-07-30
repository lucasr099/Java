package academydevdojo.maratonaJava;

public class AtividadeEstruturaCondicionais {
    public static void main(String[] args) {
        double salarioAnual =  100252;
        double primeiraTaxa = 0;
        double segundaTaixa = 7.5 / 100;
        double terceiraTaxa = 15 / 100;
        double quartaTaxa = 22.5 / 100;
        double quintaTaxa = 27.5 / 100;
        double valorImposto;
        if(salarioAnual >=  27870 && salarioAnual>= 37751.55  ){
            salarioAnual = salarioAnual * segundaTaixa;
        } else if (salarioAnual >= 37751.56 && salarioAnual<= 50148.25  ) {
            salarioAnual = salarioAnual * terceiraTaxa;
        } else if (salarioAnual >= 50148.26 && salarioAnual <= 64259.59 ) {
            salarioAnual = salarioAnual * quartaTaxa;
        } else if (salarioAnual > 64259.59 ) {
            salarioAnual = salarioAnual * quintaTaxa;

            
        }
        System.out.println(salarioAnual);


    }
}
