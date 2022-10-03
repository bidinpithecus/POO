package AulaPratica07.dados;

public class Fatoriais extends Gerador {
    public void gerar(int size) {
        for (int i = 1; sequencia.size() < size; i++) {
            sequencia.add(fat(i));
        }
    }

    public int fat(int num) {
        int fat = 1;
        for (int i = 2; i < num; i++) {
            fat *= i;
        }
        return fat;
    }
}
