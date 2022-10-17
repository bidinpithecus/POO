package Lista04.Questao02.negocio;

import Lista04.Questao02.dados.*;

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

    public void distribuirProcessos() {

    }
}
