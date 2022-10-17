package Lista04.Questao01.dados;

public class Multiplicacao implements IOperacaoInteira{
    public int executar(int valor1, int valor2) {

        if (valor1 < valor2) {
            return executar(valor2, valor1);
        } else if (valor2 != 0) {
          return (valor1 + executar(valor1, valor2 - 1));
        }
        else return 0;
    }
}
