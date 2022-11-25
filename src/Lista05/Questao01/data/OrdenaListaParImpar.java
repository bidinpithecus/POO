package Lista05.Questao01.data;

public class OrdenaListaParImpar<T> implements Iterator<T> {
    private final Lista<T> lista;
    private final IteratorPar<T> iteratorPar;
    private final IteratorImpar<T> iteratorImpar;

    public OrdenaListaParImpar(Lista<T> lista) {
        this.lista = lista;
        iteratorPar = new IteratorPar<>(lista);
        iteratorImpar = new IteratorImpar<>(lista);
    }

    @Override
    public boolean hasNext() {
        if (this.iteratorPar.hasNext()) {
            return true;
        } else return this.iteratorImpar.hasNext();
    }

    @Override
    public T next() {
        if (this.iteratorPar.hasNext()) {
            return this.iteratorPar.next();
        } else return this.iteratorImpar.next();
    }

    @Override
    public void reset() {
        this.iteratorPar.reset();
        this.iteratorImpar.reset();
    }
}
