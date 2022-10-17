package Lista04.Questao03.dados;

public class Arquivo {
    private String nome;
    private String extensao;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public Arquivo(String nome, String extensao) {
        this.nome = nome;
        this.extensao = extensao;
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
}
