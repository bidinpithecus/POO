package Lista04.Questao01.dados;

public class Mdc implements IOperacaoInteira{
    public int executar(int valor1, int valor2) {
        int remainder = 0;
        while (valor2 != 0) {
            remainder = valor1 % valor2;
            valor1 = valor2;
            valor2 = remainder;
        }
        return remainder;
    }
}
