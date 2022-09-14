package AulaPratica06.dados;

public class Fatoriais extends Gerador {
    public void gerar(int n) {
        int fat = 1;
        for (int i = n; i < 0; i--) {
            fat *= i;
        }
        sequencia.add(fat);
    }
}
