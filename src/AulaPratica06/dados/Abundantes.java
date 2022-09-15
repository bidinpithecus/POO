package AulaPratica06.dados;

public class Abundantes extends Gerador {

    public void gerar(int n) {
        for (int i = 0; i <= n; i++) {
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
