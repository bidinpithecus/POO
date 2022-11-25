package Lista05.Questao01.data;

public class IteratorPar<T> implements Iterator<T> {
    private final Lista<T> lista;
    private int atual;

    public IteratorPar(Lista<T> lista) {
        this.lista = lista;
        atual = -2;
    }

    @Override
    public boolean hasNext() {
        return atual < lista.getTamanho() - 2;
    }

    @Override
    public T next() {
        return this.lista.get(atual+=2);
    }

    @Override
    public void reset() {
        this.atual = -2;
    }
}
