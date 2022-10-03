package AulaPratica07.dados;

public class Fibonacci extends Gerador {
    public void gerar(int size) {
        for (int i = 0; sequencia.size() < size; i++) {
            sequencia.add(fibb(i));
        }
    }

    public int fibb(int num) {
        int f0 = 0;
        int f1 = 1;
        int next = f0 + f1;
        for (int i = 0; i < num; i++) {
            next = f0 + f1;
            f0 = f1;
            f1 = next;
        }
        return next;
    }
}