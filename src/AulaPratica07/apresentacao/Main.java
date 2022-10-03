package AulaPratica07.apresentacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import AulaPratica07.dados.*;

public class Main {

    public static void main(String[] args) {
        Map<String, List<Integer>> sequencias = new HashMap<>();
        Gerador gerador;
        int num = 10;

        gerador = new Fibonacci();
        gerador.gerar(num);
        sequencias.put("Fibonacci", gerador.getSequencia());

        gerador = new Fatoriais();
        gerador.gerar(num);
        sequencias.put("Fatoriais", gerador.getSequencia());

        gerador = new Naturais();
        gerador.gerar(num);
        sequencias.put("Naturais", gerador.getSequencia());

        gerador = new Quadrados();
        gerador.gerar(num);
        sequencias.put("Quadrados", gerador.getSequencia());

        gerador = new NumerosPrimos();
        gerador.gerar(num);
        sequencias.put("Primos", gerador.getSequencia());

        /*
        gerador = new Perfeitos();
        gerador.gerar(num);
        sequencias.put("Perfeitos", gerador.getSequencia());
         */

        gerador = new Abundantes();
        gerador.gerar(num);
        sequencias.put("Abundantes", gerador.getSequencia());

        sequencias.forEach((string, sequencia) -> {
            System.out.println(string + ":");
            System.out.println(sequencia);
        });

        Map<String, List<Integer>> variacoes = new HashMap<>();

        variacoes.put("Somatorio", new ArrayList<>());
        variacoes.put("Media Aritmetica", new ArrayList<>());
        variacoes.put("Media Geometrica", new ArrayList<>());
        variacoes.put("Variancia", new ArrayList<>());
        variacoes.put("Desvio Padrao", new ArrayList<>());
        variacoes.put("Amplitude", new ArrayList<>());
    }


}
