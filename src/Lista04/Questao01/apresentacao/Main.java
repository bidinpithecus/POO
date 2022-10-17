package Lista04.Questao01.apresentacao;

import Lista04.Questao01.dados.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<IOperacaoInteira> listOp = new LinkedList<>();
        listOp.add(new Mdc());
        listOp.add(new Mod());
        listOp.add(new Multiplicacao());
        listOp.add(new Soma());

        for (IOperacaoInteira op : listOp) {
            int num1 = random.nextInt(1,200);
            int num2 = random.nextInt(1,200);
            System.out.print(num1);
            if (op instanceof Mdc) {
                System.out.print(" MDC ");
            }
            if (op instanceof Mod) {
                System.out.print(" MOD ");
            }
            if (op instanceof Multiplicacao) {
                System.out.print(" * ");
            }
            if (op instanceof Soma) {
                System.out.print(" + ");
            }
            System.out.print(num2 + " = ");
            System.out.println(op.executar(num1, num2));
        }
    }
}
