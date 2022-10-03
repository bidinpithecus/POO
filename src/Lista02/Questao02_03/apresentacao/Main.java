package Lista02.Questao02_03.apresentacao;

import Lista02.Questao02_03.dados.Matriz;
import Lista02.Questao02_03.dados.Quadrante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        while (option != -1) {
            Matriz<Integer> matriz = new Matriz<>(5, 5);
            for (int i = 0; i < matriz.getLine(); i++) {
                for (int j = 0; j < matriz.getCol(); j++) {
                    System.out.print("matriz[" + i + "][" + j + "] = ");
                    matriz.set(Integer.parseInt(input.nextLine()), i, j);
                }
            }

            List<Integer> primeiro = matriz.getElementsQuadrante(Quadrante.PRIMEIRO);
            List<Integer> segundo = matriz.getElementsQuadrante(Quadrante.SEGUNDO);
            List<Integer> terceiro = matriz.getElementsQuadrante(Quadrante.TERCEIRO);
            List<Integer> quarto = matriz.getElementsQuadrante(Quadrante.QUARTO);

            List<Integer> minQuadrs = new ArrayList<>();

            minQuadrs.add(Collections.min(primeiro));
            minQuadrs.add(Collections.min(segundo));
            minQuadrs.add(Collections.min(terceiro));
            minQuadrs.add(Collections.min(quarto));

            System.out.println("\nMatriz: ");
            System.out.println(matriz);

            System.out.println("Primeiro Quadrante: " + primeiro);
            System.out.println("Menor: " + minQuadrs.get(0));

            System.out.println("Segundo Quadrante: " + segundo);
            System.out.println("Menor: " + minQuadrs.get(1));

            System.out.println("Terceiro Quadrante: " + terceiro);
            System.out.println("Menor: " + minQuadrs.get(2));

            System.out.println("Quarto Quadrante: " + quarto);
            System.out.println("Menor: " + minQuadrs.get(3));

            System.out.println("Menor dentre eles: " + Collections.min(minQuadrs));

            System.out.println("Digite qualquer valor para continuar (-1 para encerrar): ");
            option = Integer.parseInt(input.nextLine());
        }
    }
}
