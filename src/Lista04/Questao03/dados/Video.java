package Lista04.Questao03.dados;

import Lista04.Questao03.exceptions.NomeInvalidoException;

public class Video extends Arquivo {
    private Qualidade qualidade;

    public Video(String nome) throws NomeInvalidoException {
        super(nome);
    }

    public Qualidade getQualidade() {
        return qualidade;
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public String toString() {
        return super.toString() + "\tQualidade: " + this.qualidade;
    }
}
