package AulaPratica07.apresentacao;

import java.util.*;

import AulaPratica07.dados.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Gerador> sequencias = new HashMap<>();
        int num = 10;
        List<String> geradores = new ArrayList<>();
        geradores.add("Primos");
        geradores.add("Fatoriais");
        geradores.add("Abundantes");
        geradores.add("Quadrados");
        geradores.add("Fibonacci");
        geradores.add("Naturais");
//        geradores.add("Perfeitos");

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.gerar(num);
        sequencias.put("Fibonacci", fibonacci);

        Fatoriais fatoriais = new Fatoriais();
        fatoriais.gerar(num);
        sequencias.put("Fatoriais", fatoriais);

        Naturais naturais = new Naturais();
        naturais.gerar(num);
        sequencias.put("Naturais", naturais);

        Quadrados quadrados = new Quadrados();
        quadrados.gerar(num);
        sequencias.put("Quadrados", quadrados);

        NumerosPrimos primos = new NumerosPrimos();
        primos.gerar(num);
        sequencias.put("Primos", primos);

        // Comentado pois não consegue gerar 10 numeros perfeitos em um tempo viável, pois este demanda muito processamento
        /*
        * Perfeitos perfeitos = new Perfeitos();
        * perfeitos.gerar(num);
        * sequencias.put("Perfeitos", perfeitos);
        */

        Abundantes abundantes = new Abundantes();
        abundantes.gerar(num);
        sequencias.put("Abundantes", abundantes);

        sequencias.forEach((string, sequencia) -> {
            System.out.println(string + ":");
            System.out.println(sequencia.getSequencia());
        });
        System.out.println("");

        List<Long> listLong = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();

        sequencias.forEach((string, sequencia) -> listLong.add(sequencia.somatorio()));
        System.out.println("Somatorio: ");
        System.out.println(listLong);
        System.out.println("Max:" + "\n" + geradores.get(listLong.indexOf(Collections.max(listLong))));
        listLong.clear();

        sequencias.forEach((string, sequencia) -> listDouble.add(sequencia.mediaAritmetica()));
        System.out.println("Media Aritmética: ");
        System.out.println(listDouble);
        System.out.println("Max:" + "\n" + geradores.get(listDouble.indexOf(Collections.max(listDouble))) + "\n");
        listDouble.clear();

        sequencias.forEach((string, sequencia) -> listDouble.add(sequencia.mediaGeometrica()));
        System.out.println("Media Geométrica: ");
        System.out.println(listDouble);
        System.out.println("Max:" + "\n" + geradores.get(listDouble.indexOf(Collections.max(listDouble))) + "\n");
        listDouble.clear();

        sequencias.forEach((string, sequencia) -> listDouble.add(sequencia.variancia()));
        System.out.println("Variância: ");
        System.out.println(listDouble);
        System.out.println("Max:" + "\n" + geradores.get(listDouble.indexOf(Collections.max(listDouble))) + "\n");
        listDouble.clear();

        sequencias.forEach((string, sequencia) -> listDouble.add(sequencia.desvioPadrao()));
        System.out.println("Desvio Padrão: ");
        System.out.println(listDouble);
        System.out.println("Max:" + "\n" + geradores.get(listDouble.indexOf(Collections.max(listDouble))) + "\n");
        listDouble.clear();

        sequencias.forEach((string, sequencia) -> listLong.add(sequencia.amplitude()));
        System.out.println("Amplitude: ");
        System.out.println(listLong);
        System.out.println("Max:" + "\n" + geradores.get(listLong.indexOf(Collections.max(listLong))));
    }

}
