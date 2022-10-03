package AulaPratica07.dados;

public class Abundantes extends Gerador {

    public void gerar(int size) {
        for (int i = 0; sequencia.size() != size; i++) {
            if (isAbundante(i)) {
                sequencia.add(i);
            }
        }
    }

    public boolean isAbundante(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum > num;
    }
}
