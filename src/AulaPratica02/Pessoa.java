package AulaPratica02;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double massa;
    private double imc;

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void SetIdade(int idade) {
        this.idade = idade;
    }

    public void SetAltura(double altura) {
        this.altura = altura;
    }

    public void SetMassa(double massa) {
        this.massa = massa;
    }

    private void SetImc() {
        this.imc = this.massa / (this.altura * this.altura);
    }

    public String GetNome() {
        return this.nome;
    }

    public int GetIdade() {
        return this.idade;
    }

    public double GetAltura() {
        return this.altura;
    }

    public double GetMassa() {
        return this.massa;
    }

    public double GetImc() {
        return this.imc;
    }

    /*
    public void constructor(String nome, int idade, double altura, double massa) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.massa = massa;
    }
    */

}

/*
    Pessoa pessoa1 = new Pessoa();

    pessoa1.setNome("yuri");

    pessoa1.constructor("Yuri", 20, muitos, poco);
    pessoa1.CalculaImc();

 */