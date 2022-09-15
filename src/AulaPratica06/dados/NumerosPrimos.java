package AulaPratica06.dados;

public class NumerosPrimos extends Gerador {
    public void gerar(int n) {
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                sequencia.add(i);
            }
        }
    }

    public boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
