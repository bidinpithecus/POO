package AulaPratica06.dados;

import java.util.LinkedList;
import java.util.List;

public abstract class Gerador {
    protected List<Integer> sequencia = new LinkedList<>();

    public abstract void gerar(int n);

    public List<Integer> getSequencia() {
        return sequencia;
    }
}
