package Lista01.Questao01_02.dados;


public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {
    }

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Estado: " + this.estado + ", Cidade: " + this.cidade + ", Bairro: " + this.bairro + ", Rua: " + this.rua + ", Numero: " + this.numero + ", CEP: " + this.cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return rua.equals(endereco.rua) && numero.equals(endereco.numero) && bairro.equals(endereco.bairro) && cidade.equals(endereco.cidade) && estado.equals(endereco.estado) && cep.equals(endereco.cep);
    }

}
