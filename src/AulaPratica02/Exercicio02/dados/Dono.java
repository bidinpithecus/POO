package AulaPratica02.Exercicio02.dados;

public class Dono {
    private String nome;
    private Endereco endereco;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nCpf: " + this.cpf + '\n' + "Endereço:\n" + this.endereco.toString();
    }
}
