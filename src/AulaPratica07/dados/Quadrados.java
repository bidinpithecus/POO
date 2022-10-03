package AulaPratica07.dados;

public class Quadrados extends Gerador {
    public void gerar(int size) {
        for (int i = 0; sequencia.size() < size; i++) {
            if (isQuadrado(i)) {
                sequencia.add(i);
            }
        }
    }

    public boolean isQuadrado(int num) {
        return Math.sqrt(num) % 1 == 0;
    }
}
