package Lista01.Questao01_02.dados;

import java.util.Objects;

public class Veiculo {
    private String modelo;
    private String marca;
    private String cor;
    private String placa;
    private Data devolucao;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, String cor, String placa, int ano, Data devolucao) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.devolucao = devolucao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Data devolucao) {
        this.devolucao = devolucao;
    }

    public String toString() {
        return "Modelo: " + this.modelo + ", Marca: " + this.marca + ", Ano: " + this.ano + ", Cor: " + this.cor + ", Placa: " + this.placa + ", Data para devolução: " + this.devolucao.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return ano == veiculo.ano && Objects.equals(modelo, veiculo.modelo) && Objects.equals(marca, veiculo.marca) && Objects.equals(cor, veiculo.cor) && Objects.equals(placa, veiculo.placa) && Objects.equals(devolucao, veiculo.devolucao);
    }

}
