package Lista04.Questao02.excptions;

public class ProcessoSemJuizException extends Exception{
    public ProcessoSemJuizException() {
        super("Processo sem juiz!");
    }
}
