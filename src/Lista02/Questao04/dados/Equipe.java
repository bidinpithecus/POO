package Lista02.Questao04.dados;

import java.util.ArrayList;
import java.util.List;

public class Equipe<T> {
    private String nome;
    private List<T> membros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public List<T> getMembros() {
        return membros;
    }

    public String toString() {
     StringBuilder string = new StringBuilder();

     string.append("EQUIPE ").append(this.nome).append("\n");

     for (T t : membros) {
         string.append(t);
     }

     return string.toString();
    }
}
