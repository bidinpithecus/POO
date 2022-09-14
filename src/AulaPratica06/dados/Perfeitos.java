package AulaPratica06.dados;

public class Perfeitos extends Gerador {
    @Override
    public void gerar(int n) {
        for (int i = 0; i < n; i++) {
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

        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }
}
