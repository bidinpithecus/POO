package Lista04.Questao03.dados;

public class Documento extends Arquivo {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Documento(String nome) {
        super(nome);
    }

    public Documento(String nome, String extensao) {
        super(nome, extensao);
    }

    public String toString() {
        return "";
    }
}
