package Lista04.Questao02.negocio;

import Lista04.Questao02.dados.*;
import Lista04.Questao02.excptions.ProcessoSemJuizException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaProcessos {
    private final List<Processo> listaProcessos = new ArrayList<>();
    private final List<Juiz> listaJuizes = new ArrayList<>();
    Random random = new Random();

    public void cadastarProcesso(Processo processo) {
        listaProcessos.add(processo);
    }

    public void cadastrarJuiz(Juiz juiz) {
        listaJuizes.add(juiz);
    }

    public void distribuirProcessos() throws ProcessoSemJuizException {
        List<Juiz> livres = new ArrayList<>();
        List<Processo> auxProcessos = new ArrayList<>(listaProcessos);

        for (Juiz juiz : listaJuizes) {
            if (juiz.getPilhaProcessos().getSize() < juiz.getLimite()) {
                livres.add(juiz);
            }
        }

        for (Processo processo : auxProcessos) {
            if (!livres.isEmpty()) {
                int rValue = random.nextInt(livres.size());
                Juiz juiz = livres.get(rValue);

                juiz.cadastrarProcesso(processo);
                listaProcessos.remove(processo);

                if (juiz.getPilhaProcessos().getSize() >= juiz.getLimite()) {
                    livres.remove(juiz);
                }
            } else {
                throw new ProcessoSemJuizException();
            }
        }
    }
}
