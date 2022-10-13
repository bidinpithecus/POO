package Lista03.Questao02.apresentacao;

import Lista03.Questao02.dados.Circulo;
import Lista03.Questao02.dados.Losango;
import Lista03.Questao02.dados.TrianguloEquilatero;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRaio(5);
        Circulo circulo2 = new Circulo();
        circulo2.setRaio(10);

        TrianguloEquilatero trianguloEquilatero1 = new TrianguloEquilatero();
        trianguloEquilatero1.setLado(5);
        TrianguloEquilatero trianguloEquilatero2 = new TrianguloEquilatero();
        trianguloEquilatero2.setLado(10);

        Losango losango1 = new Losango();
        losango1.setD(10);
        losango1.setd(5);
        Losango losango2 = new Losango();
        losango2.setD(20);
        losango2.setd(10);

        System.out.println("Circulo 1");
        System.out.println(circulo1);
        System.out.println("Circulo 2");
        System.out.println(circulo2);
        System.out.println("Triangulo Equilátero 1");
        System.out.println(trianguloEquilatero1);
        System.out.println("Triangulo Equilátero 2");
        System.out.println(trianguloEquilatero2);
        System.out.println("Losango 1");
        System.out.println(losango1);
        System.out.println("Losango 2");
        System.out.println(losango2);
    }
}
