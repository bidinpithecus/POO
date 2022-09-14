package AulaPratica06.dados;

public class Quadrados extends Gerador {
    public void gerar(int n) {
        for (int i = 0; i <= n; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                sequencia.add(i);
            }
        }
    }
}
