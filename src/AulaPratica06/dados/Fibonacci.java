package AulaPratica06.dados;

public class Fibonacci extends Gerador {
    public void gerar(int n) {
        int f0 = 0;
        int f1 = 1;
        int next = f0 + f1;
        sequencia.add(f0);
        sequencia.add(f1);
        for (int i = 0; i < n; i++) {
            if (next + f1 <= n) {
                next = f0 + f1;
                f0 = f1;
                f1 = next;
                sequencia.add(next);
            }
        }

    }

}
