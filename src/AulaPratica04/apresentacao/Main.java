package AulaPratica04.apresentacao;

import AulaPratica04.dados.*;
import AulaPratica04.negocio.Zoologico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Zoologico zoo = new Zoologico();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            menu();
            opcao = input.nextInt();

            if (opcao == 1) {
                cadastrarViveiro();
            } else if (opcao == 2) {
                cadastrarAnimal();
            } else if (opcao == 3) {
                mostrarViveiros();
            } else if (opcao == 4) {
                mostrarAnimais();
            } else {
                System.out.println("Comando não reconhecido. Tente novamente");
            }
        }
    }

    public static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Encerrar");
        System.out.println("1 - Cadastrar Viveiro");
        System.out.println("2 - Cadastrar Animal");
        System.out.println("3 - Exibir Viveiros");
        System.out.println("4 - Exibir Animais");
    }

    public static void cadastrarViveiro() {

    }
    public static void cadastrarAnimal() {

    }

    public static void mostrarViveiros() {
        System.out.println("Dentre os viveiros, deseja:");
        System.out.println("1 - Ver todos:");
        System.out.println("2 - Ver somente aquários:");
        System.out.println("3 - Ver somente viveiros:");
        int opcao = input.nextInt();
        if (opcao == 1) {
            for (Viveiro viveiro: zoo.getViveiros()) {
                System.out.println(viveiro);
            }
        } else if (opcao == 2) {
            for (Aquario aquario : zoo.getOnlyAquarios()) {
                System.out.println(aquario);
            }
        } else if (opcao == 3) {
            for (Viveiro viveiro : zoo.getOnlyViveiros()) {
                System.out.println(viveiro);
            }
        } else {
            System.out.println("Comando não reconhecido.");
        }
    }

    public static void mostrarAnimais() {
        for (Animal animal: zoo.getAnimais()) {
            System.out.println(animal);
        }
    }

}
