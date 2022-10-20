package Lista04.Questao03.dados;

import Lista04.Questao03.exceptions.NomeInvalidoException;

public class Documento extends Arquivo {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Documento(String nome) throws NomeInvalidoException {
        super(nome);
    }

    public String toString() {
        return super.toString();
    }
}
