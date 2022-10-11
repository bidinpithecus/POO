package AulaPratica07.dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Gerador implements ISequencia {
    protected List<Integer> sequencia = new ArrayList<>();
    private final Random random = new Random();

    public abstract void gerar(int quantidade);

    public List<Integer> getSequencia() {
        return sequencia;
    }

    public int sortear() {
        // utilize random
        return sequencia.get(random.nextInt(sequencia.size() - 1));
    }

    public long somatorio() {
        long sum = 0;
        for (Integer num : sequencia) {
            sum += num;
        }
        return sum;
    }

    public double mediaAritmetica() {
        return (double) somatorio() / sequencia.size();
    }

    public double mediaGeometrica() {
        long product = 1;
        for (Integer num : sequencia) {
            product *= num;
        }
        return Math.pow(product, 1.0 / sequencia.size());
    }

    public double variancia() {
        double arithAvg = mediaAritmetica();
        double variance = 0;

        for (Integer num : sequencia) {
            variance += Math.pow(num - arithAvg, 2);
        }
        return variance / sequencia.size() - 1;
    }

    public double desvioPadrao() {
        return Math.sqrt(variancia());
    }

    public long amplitude() {
        return (long) Collections.max(sequencia) - Collections.min(sequencia);
    }
}