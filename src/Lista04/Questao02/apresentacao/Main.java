package Lista04.Questao02.apresentacao;

import Lista04.Questao02.dados.Juiz;
import Lista04.Questao02.dados.Processo;
import Lista04.Questao02.excptions.ProcessoSemJuizException;
import Lista04.Questao02.negocio.SistemaProcessos;

public class Main {
    public static SistemaProcessos sistemaProcessos = new SistemaProcessos();

    public static void main(String[] args) {
        Juiz juiz1 = new Juiz(5);
        Juiz juiz2 = new Juiz(5);
        Juiz juiz3 = new Juiz(5);

        juiz1.setNome("Enzo Rocha");
        juiz1.setNome("Maria Alice");
        juiz1.setNome("Paulo Moraes");

        sistemaProcessos.cadastrarJuiz(juiz1);
        sistemaProcessos.cadastrarJuiz(juiz2);
        sistemaProcessos.cadastrarJuiz(juiz3);

        Processo processo1 = new Processo();
        Processo processo2 = new Processo();
        Processo processo3 = new Processo();
        Processo processo4 = new Processo();
        Processo processo5 = new Processo();

        processo1.setId(21);
        processo1.setNome("Mirella Aragão");
        processo2.setId(23);
        processo2.setNome("Ana Clara");
        processo3.setId(38);
        processo3.setNome("Marina Lopes");
        processo4.setId(71);
        processo4.setNome("Kevin Santos");
        processo5.setId(70);
        processo5.setNome("Ana Vitória");

        sistemaProcessos.cadastarProcesso(processo1);
        sistemaProcessos.cadastarProcesso(processo2);
        sistemaProcessos.cadastarProcesso(processo3);
        sistemaProcessos.cadastarProcesso(processo4);
        sistemaProcessos.cadastarProcesso(processo5);

        try {
            sistemaProcessos.distribuirProcessos();
        } catch (ProcessoSemJuizException e) {
            System.out.println(e.getMessage());
        }
    }
}
