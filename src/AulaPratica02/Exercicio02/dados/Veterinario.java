package AulaPratica02.Exercicio02.dados;

public class Veterinario {
    private String nome;
    private double salario;
    private Endereco endereco;
    private final Animal[] animais;
    private final int numMaxAnimais;
    private int numAnimais;

    public Veterinario(int numMaxAnimais) {
        this.numMaxAnimais = numMaxAnimais;
        animais = new Animal[this.numMaxAnimais];
        this.numAnimais = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Nome: " + this.nome + "\nSalário: R$" + this.salario);
        string.append("\n");
        if (this.endereco == null) {
            string.append("Endereço não cadastrado");
        } else {
            string.append("Endereço:\n").append(endereco.toString()).append('\n');
        }
        string.append("\n");
        if (this.numAnimais > 0) {
            string.append("Animais:\n");
            for (int i = 0; i < this.numAnimais; i++) {
                string.append("Animal #").append(i).append('\n').append(animais[i].toString());
            }
        } else {
            string.append("Nenhum animal cadastrado ainda");
        }

        return string.toString();
    }

}
