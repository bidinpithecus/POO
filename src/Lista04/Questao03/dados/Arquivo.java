package Lista04.Questao03.dados;

import Lista04.Questao03.exceptions.NomeInvalidoException;

public class Arquivo {
    private String nome;
    private String extensao;

    public Arquivo(String nome) throws NomeInvalidoException {
        String pattern = "[\\n\\[\\]()'\"]";
        if (nome.length() < 10 || nome.length() > 256) {
            throw new NomeInvalidoException("Tamanho do nome inválido");
        } else if (nome.matches(pattern)) {
            throw new NomeInvalidoException("Caractere inválido inserido");
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public String toString() {
        return this.nome + "." + this.extensao;
    }
}
