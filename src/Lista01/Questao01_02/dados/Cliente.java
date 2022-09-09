package Lista01.Questao01_02.dados;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Veiculo veiculoAlugado;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Endereco enderco, Veiculo veiculoAlugado) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.veiculoAlugado = veiculoAlugado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Veiculo getVeiculoAlugado() {
        return veiculoAlugado;
    }

    public void setVeiculoAlugado(Veiculo veiculoAlugado) {
        this.veiculoAlugado = veiculoAlugado;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Cpf: " + this.cpf + ", Endereço: " + this.endereco.toString()+ "Veículo alugado: " + veiculoAlugado.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return nome.equals(cliente.nome) && cpf.equals(cliente.cpf) && endereco.equals(cliente.endereco) && veiculoAlugado.equals(cliente.veiculoAlugado);
    }

}
