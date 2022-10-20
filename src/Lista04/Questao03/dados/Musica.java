package Lista04.Questao03.dados;

import Lista04.Questao03.exceptions.NomeInvalidoException;

public class Musica extends Arquivo {
    private int duracao;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Musica(String nome) throws NomeInvalidoException {
        super(nome);
    }

    public String toSring() {
        return super.toString() + "\tDuração: " + this.duracao;
    }
}
