package AulaPratica06.dados;

public class Fatoriais extends Gerador {
    public void gerar(int n) {
        int fat;
        for (int i = 1; i <= n; i++) {
            fat = 1;
            for (int j = 2; j <= i; j++) {
                fat *= j;
            }
            if (fat < n) {
                sequencia.add(fat);
            } else {
                return;
            }
        }
    }
}
