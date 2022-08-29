package AulaPratica02.Exercicio02.dados;

public class Animal {
    private String nome;
    private Dono dono;
    private String especie;
    private String descricao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        String string =
                "Nome: " + this.nome +
                "\nEspecie: " + this.especie +
                "\nDescricao: " + this.descricao;
        string += '\n';
        if (this.dono == null) {
            string += "Dono ainda não cadastrado\n";
        } else {
            string += "Dono:\n" + this.dono.toString();
        }
        return string;
    }
}
