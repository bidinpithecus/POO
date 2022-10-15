package AulaPratica09.apresentacao;

import AulaPratica09.dados.*;
import AulaPratica09.exceptions.EspacoIndisponivelException;
import AulaPratica09.negocio.Zoologico;

import java.util.Scanner;

public class Main {
	private static final Zoologico zoologico = new Zoologico();
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = -1;

		while (opcao != 0) {
			menu();
			opcao = scanner.nextInt();

			if (opcao == 1) {
				cadastrarViveiro();
			} else if (opcao == 2) {
				cadastrarAnimal();
			} else if (opcao == 3) {
				try {
					alocarAnimal();
				} catch (EspacoIndisponivelException e) {
					System.out.println(e.getMessage());
				}
			} else if (opcao == 4) {
				mostrarViveiros();
			} else if (opcao == 5) {
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
		System.out.println("3 - Alocar Animal");
		System.out.println("4 - Exibir Viveiros");
		System.out.println("5 - Exibir Animais");
	}

	public static void cadastrarViveiro() {
		System.out.println("Qual tipo de viveiro deseja cadastrar?");
		System.out.println("1 - Viveiro");
		System.out.println("2 - Aquário");
		int opcao = scanner.nextInt();
		scanner.nextLine();

		if (opcao == 1) {
			zoologico.cadastrarViveiro(novoViveiro());
		} else if (opcao == 2) {
			zoologico.cadastrarViveiro(novoAquario());
		} else {
			System.out.println("Comando não reconhecido.");
		}
	}

	public static Aquario novoAquario() {
		Aquario aquario = new Aquario();
		System.out.println("Digite o comprimento:");
		aquario.setComprimento(scanner.nextFloat());
		System.out.println("Digite o largura:");
		aquario.setLargura(scanner.nextFloat());
		System.out.println("Digite o altura:");
		aquario.setAltura(scanner.nextFloat());
		System.out.println("Digite o temperatura:");
		aquario.setTemperatura(scanner.nextFloat());

		return aquario;
	}

	public static Viveiro novoViveiro() {
		Viveiro viveiro = new Viveiro();
		System.out.println("Digite o comprimento:");
		viveiro.setComprimento(scanner.nextFloat());
		System.out.println("Digite o largura:");
		viveiro.setLargura(scanner.nextFloat());

		return viveiro;
	}

	public static void cadastrarAnimal() {
		System.out.println("Qual tipo de animal deseja cadastrar?");
		System.out.println("1 - Animal");
		System.out.println("2 - Peixe");
		int opcao = scanner.nextInt();
		scanner.nextLine();

		if (opcao == 1) {
			Animal novoAnimal = novoAnimal();
			if (novoAnimal != null) {
				zoologico.cadastrarAnimal(novoAnimal);
			} else {
				System.out.println("Ocorreu um erro.");
			}
		} else if (opcao == 2) {
			Peixe novoPeixe = novoPeixe();
			if (novoPeixe != null) {
				zoologico.cadastrarAnimal(novoPeixe);
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
		peixe.setNome(scanner.nextLine());
		System.out.println("Digite o cor:");
		peixe.setCor(scanner.nextLine());
		System.out.println("Digite a especie:");
		peixe.setEspecie(scanner.nextLine());
		System.out.println("Digite a idade:");
		peixe.setIdade(scanner.nextInt());
		System.out.println("Digite a largura:");
		peixe.setLargura(scanner.nextFloat());
		System.out.println("Digite a comprimento:");
		peixe.setComprimento(scanner.nextFloat());
		System.out.println("Digite a altura:");
		peixe.setAltura(scanner.nextFloat());
		System.out.println("Digite a temperatura ideal:");
		peixe.setTemperaturaIdeal(scanner.nextFloat());

		return peixe;
	}

	public static Animal novoAnimal() {
		Animal animal = new Animal();
		System.out.println("Digite o nome:");
		animal.setNome(scanner.nextLine());
		System.out.println("Digite o cor:");
		animal.setCor(scanner.nextLine());
		System.out.println("Digite a especie:");
		animal.setEspecie(scanner.nextLine());
		System.out.println("Digite a idade:");
		animal.setIdade(scanner.nextInt());
		System.out.println("Digite a largura:");
		animal.setLargura(scanner.nextFloat());
		System.out.println("Digite a comprimento:");
		animal.setComprimento(scanner.nextFloat());
		System.out.println("Digite a altura:");
		animal.setAltura(scanner.nextFloat());

		return animal;
	}

	public static void alocarAnimal() throws EspacoIndisponivelException {
		System.out.println("Escolha o viveiro que deseja inserir o animal");
		for (Viveiro viveiro : zoologico.getViveiros()) {
			System.out.println("Viveiro #" + zoologico.getViveiros().indexOf(viveiro) + "\n" + viveiro);
		}
		int indexViveiro = Integer.parseInt(scanner.nextLine());
		if (indexViveiro < zoologico.getViveiros().size() && indexViveiro >= 0) {
			for (Animal animal : zoologico.getAnimais()) {
				System.out.println("Animal #" + zoologico.getAnimais().indexOf(animal) + "\n" + animal);
			}
			int indexAnimais = Integer.parseInt(scanner.nextLine());
			if (indexAnimais < zoologico.getAnimais().size() && indexAnimais >= 0) {
				zoologico.alocarAnimal(zoologico.getAnimais().get(indexAnimais), zoologico.getViveiros().get(indexViveiro));
			}
		}
	}

	public static void mostrarViveiros() {
		if (zoologico.getViveiros().size() > 0) {
			System.out.println("Dentre os viveiros, deseja:");
			System.out.println("1 - Ver todos:");
			System.out.println("2 - Ver somente aquários:");
			System.out.println("3 - Ver somente viveiros:");
			int opcao = scanner.nextInt();
			if (opcao == 1) {
				for (Viveiro viveiro: zoologico.getViveiros()) {
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
		if (zoologico.getOnlyViveiros().size() > 0) {
			for (int i = 0; i < zoologico.getOnlyViveiros().size(); i++) {
				System.out.println("Viveiro #" + i + "\n" + zoologico.getOnlyViveiros().get(i));
			}
		} else {
			System.out.println("Nenhum viveiro cadastrado.");
		}
	}

	public static void mostrarOnlyAquarios() {
		if (zoologico.getOnlyAquarios().size() > 0) {
			for (Aquario aquario : zoologico.getOnlyAquarios()) {
				System.out.println("Viveiro #" + zoologico.getOnlyAquarios().indexOf(aquario) + "\n" + aquario);
			}
		} else {
			System.out.println("Nenhum aquário cadastrado.");
		}
	}

	public static void mostrarAnimais() {
		if (zoologico.getAnimais().size() > 0) {
			for (Animal animal : zoologico.getAnimais()) {
				System.out.println(animal);
			}
		} else {
			System.out.println("Nenhum animal cadastrado.");
		}
	}

}
