package Lista05.Questao01.presentation;

import Lista05.Questao01.data.Lista;
import Lista05.Questao01.data.OrdenaListaParImpar;

public class Main {
    public static void main(String[] args) {
        Lista<Character> lista = new Lista<>(8);
        Character[] charLista = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        lista.setList(charLista);

        OrdenaListaParImpar<Character> iteratorParImpar = new OrdenaListaParImpar<>(lista);

        while(iteratorParImpar.hasNext()){
            System.out.print(iteratorParImpar.next() + "\t");
        }
    }
}
