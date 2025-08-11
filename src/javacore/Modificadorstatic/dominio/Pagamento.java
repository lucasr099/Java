package javacore.Modificadorstatic.dominio;

public class Pagamento {
    private String nome;
    private double salario;
    public static double descontoSalario = 0;
    private double desconto = 0;


    public Pagamento(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimi(){
        System.out.println("----------------------");
        double desconto = 0;
        if (salario > 1518 && salario < 2793.88 ){
             desconto = salario * 0.09;
        } else if (salario > 2793.89 && salario < 3000) {
            desconto = salario * 0.12;
        }else if (salario < 1518){
            System.out.println("Funcionario "+ getNome() + ", Salario desatualizado, procure o rh da sua empresa!!!");
            return;
        }else {
            desconto = salario *0.12;
        }
        double salarioLiquido = salario - desconto;
        System.out.println("Nome: " + getNome()
                + " | Salário Bruto: R$ " + salario
                + " | Desconto: R$ " + desconto
                + " | Salário Líquido: R$ " + salarioLiquido);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
