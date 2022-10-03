package AulaPratica07.dados;

public class Perfeitos extends Gerador {
    public void gerar(int size) {
        for (int i = 0; sequencia.size() < size; i++) {
            if (isPerfeito(i)) {
                sequencia.add(i);
            }
        }
    }

    public boolean isPerfeito(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return num == sum;
    }
}
