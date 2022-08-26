package AulaPratica02.Exercicio02.apresentacao;

import java.util.Scanner;

import AulaPratica02.Exercicio02.dados.Animal;
import AulaPratica02.Exercicio02.dados.Dono;
import AulaPratica02.Exercicio02.dados.Endereco;
import AulaPratica02.Exercicio02.dados.Veterinario;

public class SistemaPetShop {
    private static int numVeterinarios = 0;
    private static int maxVeterinarios = 10;
    private static Veterinario[] veterinarios = new Veterinario[maxVeterinarios];
    private static Scanner input = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Veterinário");
        System.out.println("2 - Exibir Veterinários");
        System.out.println("3 - Cadastrar Endereço do Veterinário");
        System.out.println("4 - Cadastrar Animal");
        System.out.println("5 - Exibir Animais");
        System.out.println("6 - Cadastrar Dono");
    }

    public static void Main(String[] args) {
        int option = -1;

        while (option != 0) {
            printMenu();
            option = input.nextInt();
            switch(option) {
                case 0:
                    break;
                case 1:
                    cadastrarVeterinario();
                    break;
                case 2:
                    mostrarVeterinarios();
                    break;
                case 3:
                    cadastrarEnderecoVeterinario();
                    break;
                case 4:
                    cadastrarAnimal();
                    break;
                case 5:
                    mostrarAnimais();
                    break;
                case 6:
                    cadastrarDono();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
    }

    public static void cadastrarVeterinario() {
        if (numVeterinarios < maxVeterinarios) {
            Veterinario veterinario = new Veterinario(10);

            System.out.println("Insira o nome do novo veterinário");
            veterinario.setNome(input.next());
            System.out.println("Insira o salário do novo veterinário");
            veterinario.setSalario(input.nextDouble());

            veterinarios[numVeterinarios++] = veterinario;
        } else {
            System.out.println("Número máximo de veterinários já cadastrado");
        }
    }

    public static void mostrarVeterinarios() {
        for (int i = 0; i < numVeterinarios; i++) {
            System.out.println("Veterinário #" + i);
            System.out.println(veterinarios[i].toString() + '\n');
        }
    }

    public static int escolherVeterinario() {
        int indexVet;
        System.out.println("Aqui está a lista de veterinários cadastrados. Escolha-o pelo seu código.");
        mostrarVeterinarios();
        indexVet = input.nextInt();

        if (indexVet < 0 || indexVet > numVeterinarios) {
            System.out.println("Código de veterinário inválido");
            indexVet = -1;
        }

        return indexVet;
    }

    public static int escolherAnimal(Veterinario veterinario) {
        int indexAnimal;
        System.out.println("Aqui está a lista de animais cadastrados a este veterinário. Escolha-o pelo seu código.");
        mostrarAnimais();
        indexAnimal = input.nextInt();

        if (indexAnimal < 0 || indexAnimal > veterinario.getNumAnimais()) {
            System.out.println("Código de animal inválido");
            indexAnimal = -1;
        }

        return indexAnimal;
    }

    public static Endereco novoEndereco() {
        Endereco endereco = new Endereco();

        System.out.print("Rua: ");
        endereco.setRua(input.next());
        System.out.print("Numero: ");
        endereco.setNumero(input.next());
        System.out.print("Bairro: ");
        endereco.setBairro(input.next());
        System.out.print("Cidade: ");
        endereco.setCidade(input.next());
        System.out.print("Estado: ");
        endereco.setEstado(input.next());
        System.out.print("CEP: ");
        endereco.setCep(input.next());

        return endereco;
    }

    public static void cadastrarEnderecoVeterinario() {
        int indexVet = escolherVeterinario();

        System.out.println("Endereço do veterinário #" + indexVet);
        veterinarios[indexVet].setEndereco(novoEndereco());

    }

    public static void cadastrarAnimal() {
        int indexVet = escolherVeterinario();

        Animal animal = new Animal();
        System.out.println("Animal do veterinário #" + indexVet);
        System.out.print("Nome: ");
        animal.setNome(input.next());
        System.out.print("Espécie: ");
        animal.setEspecie(input.next());
        System.out.print("Descrição: ");
        animal.setDescricao(input.next());

        veterinarios[indexVet].setAnimais(animal);

    }

    public static void mostrarAnimais() {
        int indexVet = escolherVeterinario();

        for (int i = 0; i < veterinarios[indexVet].getNumAnimais(); i++) {
            System.out.println("Animal #" + i);
            System.out.println(veterinarios[indexVet].getAnimais()[i].toString());
        }
    }

    public static void cadastrarDono() {
        int indexVet = escolherVeterinario();
        int indexAnimal = -1;
        if (indexVet >= 0) {
            indexAnimal = escolherAnimal(veterinarios[escolherVeterinario()]);
        }

        if (indexAnimal > -1) {
            Dono dono = new Dono();
            System.out.println("Digite o nome do dono deste animal");
            dono.setNome(input.next());
            System.out.println("Insira o endereço do dono deste animal");
            dono.setEndereco(novoEndereco());
            System.out.println("Digite o CPF do dono deste animal");
            dono.setCpf(input.next());

            veterinarios[indexVet].getAnimais()[indexAnimal].setDono(dono);
        }
    }

}
