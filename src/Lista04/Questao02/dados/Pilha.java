package Lista04.Questao02.dados;

import Lista04.Questao02.excptions.PilhaCheiaException;
import Lista04.Questao02.excptions.PilhaVaziaException;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
    private int limite;
    private List<T> elementos = new ArrayList<T>();

    public Pilha(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public List<T> getElementos() {
        return elementos;
    }

    public void setElementos(List<T> elementos) {
        this.elementos = elementos;
    }

    public void inserir(T objeto) throws PilhaCheiaException {
        if (this.getSize() < limite) {
            elementos.add(objeto);
        } else {
            throw new PilhaCheiaException();
        }
    }

    public T remover() throws PilhaVaziaException {
        if (this.getSize() > 0) {
            return elementos.remove(elementos.size() - 1);
        } else {
            throw new PilhaVaziaException();
        }
    }

    public int getSize() {
        return elementos.size();
    }
}
