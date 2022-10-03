package AulaPratica07.dados;

public class Naturais extends Gerador {
    public void gerar(int size) {
        for (int i = 0; sequencia.size() < size; i++) {
            sequencia.add(i);
        }
    }
}
