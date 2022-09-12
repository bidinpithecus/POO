package AulaPratica05.apresentacao;

import AulaPratica05.dados.Contato;
import AulaPratica05.negocio.ListaTelefonica;

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
                buscarContatos();
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

    }

    public static void buscarContatos() {
        
    }
}
