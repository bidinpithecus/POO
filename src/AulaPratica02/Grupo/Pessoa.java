package AulaPratica02.Grupo;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double massa;
    private double imc;

    private void SetImc() {
        this.imc = this.massa / (this.altura * this.altura);
    }

    public double GetImc() {
        return this.imc;
    }

    public Pessoa(String nome, int idade, double altura, double massa) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.massa = massa;
        this.SetImc();
    }

    public void printPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Massa: " + this.massa);
        System.out.println("IMC: " + this.imc);
    }

}