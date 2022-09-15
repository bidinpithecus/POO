package AulaPratica06.dados;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, List<Integer>> sequencias = new HashMap<>();
        Gerador gerador;
        int num = 30;

        // Fibonacci
        gerador = new Fibonacci();
        gerador.gerar(num);
        sequencias.put("Fibonacci", gerador.getSequencia());

        // Fatoriais
        gerador = new Fatoriais();
        gerador.gerar(num);
        sequencias.put("Fatoriais", gerador.getSequencia());

        // Naturais
        gerador = new Naturais();
        gerador.gerar(num);
        sequencias.put("Naturais", gerador.getSequencia());

        // Quadrados
        gerador = new Quadrados();
        gerador.gerar(num);
        sequencias.put("Quadrados", gerador.getSequencia());

        // Primos
        gerador = new NumerosPrimos();
        gerador.gerar(num);
        sequencias.put("Primos", gerador.getSequencia());

        // Perfeitos
        gerador = new Perfeitos();
        gerador.gerar(num);
        sequencias.put("Perfeitos", gerador.getSequencia());

        // Abundantes
        gerador = new Abundantes();
        gerador.gerar(num);
        sequencias.put("Abundantes", gerador.getSequencia());

        sequencias.forEach((string, sequencia) -> {
            System.out.println(string + ":");
            System.out.println(sequencia);
        });
    }


}
