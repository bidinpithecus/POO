package Lista05.Questao01.data;

public interface Iterator<T> {
    public boolean hasNext();
    public T next();
    public void reset();
}
