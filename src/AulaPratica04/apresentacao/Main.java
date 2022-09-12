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
            } else if (opcao == 0) {
                System.out.println("Encerrando.");
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
        System.out.println("Qual tipo de viveiro deseja cadastrar?");
        System.out.println("1 - Viveiro");
        System.out.println("2 - Aquário");
        int opcao = input.nextInt();
        input.nextLine();

        if (opcao == 1) {
            zoo.cadastrarViveiro(novoViveiro());
        } else if (opcao == 2) {
            zoo.cadastrarViveiro(novoAquario());
        } else {
            System.out.println("Comando não reconhecido.");
        }
    }

    public static Aquario novoAquario() {
        Aquario aquario = new Aquario();
        System.out.println("Digite o nome:");
        aquario.setNome(input.nextLine());
        System.out.println("Digite o comprimento:");
        aquario.setComprimento(input.nextFloat());
        System.out.println("Digite o largura:");
        aquario.setLargura(input.nextFloat());
        System.out.println("Digite o altura:");
        aquario.setAltura(input.nextFloat());
        System.out.println("Digite o temperatura:");
        aquario.setTemperatura(input.nextFloat());

        return aquario;
    }

    public static Viveiro novoViveiro() {
        Viveiro viveiro = new Viveiro();
        System.out.println("Digite o nome:");
        viveiro.setNome(input.nextLine());
        System.out.println("Digite o comprimento:");
        viveiro.setComprimento(input.nextFloat());
        System.out.println("Digite o largura:");
        viveiro.setLargura(input.nextFloat());

        return viveiro;
    }

    public static void cadastrarAnimal() {
        System.out.println("Qual tipo de animal deseja cadastrar?");
        System.out.println("1 - Animal");
        System.out.println("2 - Peixe");
        int opcao = input.nextInt();
        input.nextLine();

        if (opcao == 1) {
            Animal novoAnimal = novoAnimal();
            if (novoAnimal != null) {
                zoo.cadastrarAnimal(novoAnimal);
            } else {
                System.out.println("Ocorreu um erro.");
            }
        } else if (opcao == 2) {
            Peixe novoPeixe = novoPeixe();
            if (novoPeixe != null) {
                zoo.cadastrarAnimal(novoPeixe);
            } else {
                System.out.println("Ocorreu um erro.");
            }
        } else {
            System.out.println("Comando não reconhecido.");
        }
    }

    public static Peixe novoPeixe() {
        Peixe peixe = new Peixe();
        System.out.println("Digite o nome:");
        peixe.setNome(input.nextLine());
        System.out.println("Digite o cor:");
        peixe.setCor(input.nextLine());
        System.out.println("Digite a especie:");
        peixe.setEspecie(input.nextLine());
        System.out.println("Digite a idade:");
        peixe.setIdade(input.nextInt());
        System.out.println("Digite a largura:");
        peixe.setLargura(input.nextFloat());
        System.out.println("Digite a comprimento:");
        peixe.setComprimento(input.nextFloat());
        System.out.println("Digite a altura:");
        peixe.setAltura(input.nextFloat());
        System.out.println("Digite a temperatura ideal:");
        peixe.setTemperaturaIdeal(input.nextFloat());

        mostrarOnlyAquarios();

        System.out.println("Digite o código do aquário que deseja que o peixe seja inserido:");
        int indexAquario = input.nextInt();
        while (indexAquario >= zoo.getOnlyAquarios().size()) {
            System.out.println("Código inválido.");
            System.out.println("Insira outro código, ou (-1) para sair");
            indexAquario = input.nextInt();
            if (indexAquario == -1) {
                return null;
            }
        }

        while (!zoo.alocarAnimal(peixe, zoo.getOnlyAquarios().get(indexAquario))) {
            System.out.println("Ocorreu um erro ao tentar alocar peixe neste viveiro.");
            mostrarOnlyAquarios();
            System.out.println("Digite o código do viveiro que deseja que o peixe seja inserido, (-1) para sair");
            indexAquario = input.nextInt();
            if (indexAquario == -1) {
                return null;
            }
            while (indexAquario >= zoo.getOnlyAquarios().size()) {
                System.out.println("Código inválido.");
                System.out.println("Insira outro código, ou (-1) para sair");
                indexAquario = input.nextInt();
                if (indexAquario == -1) {
                    return null;
                }
            }
        }
        return peixe;
    }

    public static Animal novoAnimal() {
        Animal animal = new Animal();
        System.out.println("Digite o nome:");
        animal.setNome(input.nextLine());
        System.out.println("Digite o cor:");
        animal.setCor(input.nextLine());
        System.out.println("Digite a especie:");
        animal.setEspecie(input.nextLine());
        System.out.println("Digite a idade:");
        animal.setIdade(input.nextInt());
        System.out.println("Digite a largura:");
        animal.setLargura(input.nextFloat());
        System.out.println("Digite a comprimento:");
        animal.setComprimento(input.nextFloat());
        System.out.println("Digite a altura:");
        animal.setAltura(input.nextFloat());

        mostrarOnlyViveiros();

        System.out.println("Digite o código do viveiro que deseja que o animal seja inserido:");
        int indexViveiro = input.nextInt();
        while (indexViveiro >= zoo.getOnlyViveiros().size()) {
            System.out.println("Código inválido.");
            System.out.println("Insira outro código, ou (-1) para sair");
            indexViveiro = input.nextInt();
            if (indexViveiro == -1) {
                return null;
            }
        }

        while (!zoo.alocarAnimal(animal, zoo.getOnlyViveiros().get(indexViveiro))) {
            System.out.println("Ocorreu um erro ao tentar alocar animal neste viveiro.");
            mostrarOnlyViveiros();
            System.out.println("Digite o código do viveiro que deseja que o animal seja inserido, ou (-1) para sair");
            indexViveiro = input.nextInt();
            if (indexViveiro == -1) {
                return null;
            }
            while (indexViveiro >= zoo.getOnlyViveiros().size()) {
                System.out.println("Código inválido.");
                System.out.println("Insira outro código, ou (-1) para sair");
                indexViveiro = input.nextInt();
                if (indexViveiro == -1) {
                    return null;
                }
            }
        }
        return animal;
    }

    public static void mostrarViveiros() {
        if (zoo.getViveiros().size() > 0) {
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
                mostrarOnlyAquarios();
            } else if (opcao == 3) {
                mostrarOnlyViveiros();
            } else {
                System.out.println("Comando não reconhecido.");
            }
        } else {
            System.out.println("Nenhum viveiro cadastrado.");
        }

    }

    public static void mostrarOnlyViveiros() {
        if (zoo.getOnlyViveiros().size() > 0) {
            for (int i = 0; i < zoo.getOnlyViveiros().size(); i++) {
                System.out.println("Viveiro #" + i + "\n" + zoo.getOnlyViveiros().get(i));
            }
        } else {
            System.out.println("Nenhum viveiro cadastrado.");
        }
    }

    public static void mostrarOnlyAquarios() {
        if (zoo.getOnlyAquarios().size() > 0) {
            for (Aquario aquario : zoo.getOnlyAquarios()) {
                System.out.println("Viveiro #" + zoo.getOnlyAquarios().indexOf(aquario) + "\n" + aquario);
            }
        } else {
            System.out.println("Nenhum aquário cadastrado.");
        }
    }

    public static void mostrarAnimais() {
        if (zoo.getAnimais().size() > 0) {
            for (Animal animal : zoo.getAnimais()) {
                System.out.println(animal);
            }
        } else {
            System.out.println("Nenhum animal cadastrado.");
        }
    }

}
