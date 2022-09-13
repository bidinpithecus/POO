package AulaPratica05.apresentacao;

import AulaPratica05.dados.Contato;
import AulaPratica05.negocio.ListaTelefonica;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static ListaTelefonica listaTelefonica = new ListaTelefonica();

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            menu();
            opcao = input.nextInt();

            if (opcao == 1) {
                adicionarContato();
            } else if (opcao == 2) {
                removerContato();
            } else if (opcao == 3) {
                mostrarContatos();
            } else if (opcao == 0) {
                System.out.println("Encerrando.");
            } else {
                System.out.println("Comando não reconhecido. Tente novamente");
            }
        }
    }

    public static void menu() {
        System.out.println("~~~ Lista Telefônica ~~~");
        System.out.println("0 - Sair;");
        System.out.println("1 - Adicionar contato;");
        System.out.println("2 - Remover contato;");
        System.out.println("3 - Exibir contatos;");
    }

    public static void adicionarContato() {
        Contato contato = new Contato();
        System.out.println("Digite o nome do contato:");
        input.nextLine();
        contato.setNome(input.next());
        System.out.println("Agora o telefone do contato:");
        contato.setTelefone(input.nextLine());

        listaTelefonica.adicionaContato(contato);
    }

    public static void removerContato() {
        System.out.println("Digite a inicial do contato a ser removido:");
        char letra = (char) input.nextByte();

        if (listaTelefonica.buscarContatos(letra).size() > 0) {
            System.out.println("Qual dos contatos a seguir deseja que seja removido?");
            System.out.println("Insira seu código:");
            exibirContatos(letra);
            int index = input.nextInt();

            if (index < listaTelefonica.buscarContatos(letra).size()) {
                listaTelefonica.removerContato(listaTelefonica.buscarContatos(letra).remove(index));
                System.out.println("Contato removido.");
            } else {
                System.out.println("Código não reconhecido.");
            }
        } else {
            System.out.println("Não há contatos para que sejam removidos.");
        }


    }

    public static void mostrarContatos() {
        System.out.println("Deseja:");
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar todos os contatos");
        System.out.println("2 - Filtrar algum");
        int opcao = input.nextInt();

        if (opcao == 0) {
            System.out.println("Retornando");
        } else if (opcao == 1) {
            System.out.println("Lista:");
            exibirContatos();
        } else if (opcao == 2) {
            System.out.println("Digite a inicial do contato a ser buscado:");
            char letra = (char) input.nextByte();
            exibirContatos(letra);
        } else {
            System.out.println("Comando inválido.");
        }
    }

    public static void exibirContatos(char letra) {
        if (listaTelefonica.buscarContatos(letra).size() > 0) {
            for (int i = 0; i < listaTelefonica.buscarContatos(letra).size(); i++) {
                System.out.println("Contato# " + i + '\n' + listaTelefonica.buscarContatos(letra).get(i));
            }
        } else {
            System.out.println("Não há contatos que iniciam com " + letra);
        }
    }

    public static void exibirContatos() {
        if (listaTelefonica.buscarContatos().size() > 0) {
            listaTelefonica.buscarContatos().forEach((chave, lista) -> {
                System.out.println(chave + ":\n\t");

            for (Contato contato : lista) {
                System.out.println(contato);
            }
            });
        } else {
            System.out.println("Não há contatos na lista.");
        }
    }

}
