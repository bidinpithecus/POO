package AulaPratica02.Exercicio02.dados;

public class Veterinario {
    private String nome;
    private double salario;
    private Endereco endereco;
    private Animal[] animais;
    private int numMaxAnimais;
    private int numAnimais;

    public Veterinario(int numMaxAnimais) {
        this.numMaxAnimais = numMaxAnimais;
        animais = new Animal[this.numMaxAnimais];
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal animal) {
        if (numAnimais < numMaxAnimais) {
            this.animais[this.numAnimais++] = animal;
        }
    }

    public int getNumAnimais() {
        return numAnimais;
    }

    public int getNumMaxAnimais() {
        return numMaxAnimais;
    }

}
