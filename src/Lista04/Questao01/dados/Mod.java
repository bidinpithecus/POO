package Lista04.Questao01.dados;

public class Mod implements IOperacaoInteira{
    public int executar(int valor1, int valor2) {
        return valor1 - ((valor1 / valor2) * valor2);
    }
}
