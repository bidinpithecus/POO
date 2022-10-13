package Lista03.Questao01.apresentacao;

import Lista03.Questao01.dados.*;

public class Main {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        dog1.setName("Max");
        System.out.println(dog1.emitirSom());
        Cachorro dog2 = new Cachorro();
        dog2.setName("Xam");
        System.out.println(dog2.emitirSom());

        Gato cat1 = new Gato();
        cat1.setName("Meg");
        System.out.println(cat1.emitirSom());
        Gato cat2 = new Gato();
        cat2.setName("Gem");
        System.out.println(cat2.emitirSom());

        Burro donkey1 = new Burro();
        donkey1.setName("Lucas");
        System.out.println(donkey1.emitirSom());
        Burro donkey2 = new Burro();
        donkey2.setName("Sacul");
        System.out.println(donkey2.emitirSom());
    }
}
