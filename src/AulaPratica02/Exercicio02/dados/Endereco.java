package AulaPratica02.Exercicio02.dados;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

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
        return "* Estado: " + this.estado + "\n* Cidade: " + this.cidade + "\n* Bairro: " + this.bairro + "\n* Rua: " + this.rua + "\n* Numero: " + this.numero + "\n* CEP: " + this.cep;
    }

}
