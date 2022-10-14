package AulaPratica08.apresentacao;

import AulaPratica08.dados.Contato;
import AulaPratica08.negocio.ListaTelefonica;

import java.util.Scanner;

public class Main {
	private static final ListaTelefonica listaTelefonica = new ListaTelefonica();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = -1;

		while (opcao != 0) {
			menu();
			opcao = scanner.nextInt();

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

	public static void adicionarContato() {
		Contato contato = new Contato();

		System.out.println("Digite o nome:");
		scanner.nextLine();
		String tempNome = scanner.next();
		while (true) {
			if (tempNome.toUpperCase().charAt(0) < 65 || tempNome.toUpperCase().charAt(0) > 90) {
				System.out.println("Primeiro caractere do nome deve ser uma letra.");
				System.out.println("Tente novamente:");
				tempNome = scanner.next();
			} else {
				break;
			}
		}
		contato.setNome(tempNome);
		scanner.nextLine();
		System.out.println("Digite o telefone:");
		contato.setTelefone(scanner.nextLine());

		System.out.println(contato);

		listaTelefonica.adicionarContato(contato);
	}

	public static void removerContato() {
		System.out.println("Digite a inicial do contato a ser removido:");
		char letra = scanner.next().toUpperCase().charAt(0);
		if (!(letra >= 65 && letra <= 90)) {
			System.out.println("Letra inválida.");
			return;
		}
		if (listaTelefonica.buscarContatos(letra).size() > 0) {
			System.out.println("Qual dos contatos a seguir deseja que seja removido?");
			for (Contato contato : listaTelefonica.buscarContatos(letra)) {
				System.out.println("#" + listaTelefonica.buscarContatos(letra).indexOf(contato));
				System.out.println(contato);
			}
			System.out.println("Insira seu código:");
			int index = scanner.nextInt();

			if (index < listaTelefonica.buscarContatos(letra).size()) {
				listaTelefonica.removerContato(listaTelefonica.buscarContatos(letra).get(index));
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
		int opcao = scanner.nextInt();

		if (opcao == 0) {
			System.out.println("Retornando");
		} else if (opcao == 1) {
			System.out.println("Lista:");
			exibirContatos();
		} else if (opcao == 2) {
			System.out.println("Digite a inicial do contato a ser buscado:");
			char letra = scanner.next().toUpperCase().charAt(0);
			if (letra >= 65 && letra <= 90) {
				exibirContatos(letra);
			} else {
				System.out.println("Letra inválida.");
			}
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
		if (listaTelefonica.listarContatos().size() > 0) {
			listaTelefonica.listarContatos().forEach((chave, lista) -> {
				System.out.println(chave + ":");

				for (Contato contato : lista) {
					System.out.println("\t" + contato + ';');
				}
			});
		} else {
			System.out.println("Não há contatos na lista.");
		}
	}

	public static void menu() {
		System.out.println("~~~ Lista Telefônica ~~~");
		System.out.println("0 - Sair;");
		System.out.println("1 - Adicionar contato;");
		System.out.println("2 - Remover contato;");
		System.out.println("3 - Exibir contatos;");
	}

}
