package Lista05.Questao01.data;

public class Lista<T> {
    private T[] list;
    private int tamanho;

    public Lista(int tamanho) {
        this.tamanho = tamanho;
        this.list = (T[]) new Object[tamanho];
    }

    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public T get(int index) {
        return this.list[index];
    }

    public void set(int index, T obj) {
        this.list[index] = obj;
    }
}
