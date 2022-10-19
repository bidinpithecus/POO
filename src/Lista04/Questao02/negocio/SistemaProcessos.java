package Lista04.Questao02.negocio;

import Lista04.Questao02.dados.*;
import Lista04.Questao02.excptions.ProcessoSemJuizException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaProcessos {
    private List<Processo> listaProcessos = new ArrayList<>();
    private List<Juiz> listaJuizes = new ArrayList<>();
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
            if (livres.size() > 0) {
                Random random = new Random();
                Juiz juiz = livres.get(random.nextInt(livres.size()));

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
