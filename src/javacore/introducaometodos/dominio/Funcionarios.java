package javacore.introducaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: salario){
            System.out.println(salario+ "  ");
        }
        imprimeMediaSalario();
    }
    public void imprimeMediaSalario(){
       for (double salario: salario){
           media += salario;
       }
       media/= salario.length;
        System.out.println("\nMédia salário " + media);
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
