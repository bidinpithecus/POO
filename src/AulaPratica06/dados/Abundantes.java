package AulaPratica06.dados;

public class Abundantes extends Gerador {

    public void gerar(int n) {
        for (int i = 0; i <= (n) / 2; i++) {
            sequencia.add(i);
        }
    }
}
