package AulaPratica06.dados;

public class Naturais extends Gerador{

    public void gerar(int n) {
        for (int i = 0; i < n; i++) {
            sequencia.add(i);
        }
    }
}
