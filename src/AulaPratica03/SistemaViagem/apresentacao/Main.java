package AulaPratica03.SistemaViagem.apresentacao;

import java.util.Scanner;

import AulaPratica03.SistemaViagem.dados.Cidade;
import AulaPratica03.SistemaViagem.dados.Cliente;
import AulaPratica03.SistemaViagem.dados.Reserva;
import AulaPratica03.SistemaViagem.negocio.ReservaPassagem;

public class Main {
    private static ReservaPassagem sistema = new ReservaPassagem();
    private static Scanner input = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Encerrar");
        System.out.println("1 - Cadastrar cidade");
        System.out.println("2 - Cadastrar cliente");
        System.out.println("3 - Realizar reserva");
        System.out.println("4 - Mostrar reservas");
    }
    public static void main(String[] args) {
        int opcao = -1;

        do {
            printMenu();
            opcao = input.nextInt();
            switch(opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("Cadastrar cidade");
                    cadastrarCidade();
                    break;
                case 2:
                    System.out.println("Cadastrar cliente");
                    cadastrarCliente();
                    break;
                case 3:
                    System.out.println("Realizar reserva");
                    realizarReserva();
                    break;
                case 4:
                    mostrarReservas();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }

    public static void cadastrarCidade() {
        Cidade cidade = new Cidade();
        input.nextLine();
        System.out.println("Insira o nome da cidade:");
        cidade.setNome(input.nextLine());

        System.out.println("Insira o estado da cidade:");
        cidade.setEstado(input.nextLine());

        sistema.cadastrarCidade(cidade);
    }

    public static void cadastrarCliente() {
        Cliente cliente = new Cliente();

        System.out.println("Insira o cpf:");
        cliente.setCpf(input.next());
        input.nextLine();
        System.out.println("Insira o nome:");
        cliente.setNome(input.nextLine());

        System.out.println("Insira o endereço:");
        cliente.setEndereco(input.nextLine());

        System.out.println("Insira o telefone:");
        cliente.setTelefone(input.next());

        sistema.cadastrarCliente(cliente);
    }

    public static void realizarReserva() {
        Cliente cliente = buscarCliente();

        if (cliente != null) {
            System.out.println("0 - Sair");
            System.out.println("1 - Reservar somente ida");
            System.out.println("2 - Reservar ida e volta");
            int opcao = input.nextInt();
            if (opcao == 0) {
                System.out.println("Saindo");
            } else if (opcao == 1) {
                System.out.println("IDA:");
                sistema.reservarIda(cliente, novaReserva());
            } else if (opcao == 2) {
                System.out.println("IDA:");
                Reserva ida = novaReserva();
                System.out.println("VOLTA:");
                sistema.reservarVolta(cliente, ida, novaReserva());
            } else {
                System.out.println("Opção inválida");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public static Cliente buscarCliente() {
        if (sistema.getNumClientes() != 0) {
            for (int i = 0; i < sistema.getNumClientes(); i++) {
                System.out.println(sistema.getClientes()[i].toString());
            }
            System.out.println("Digite o CPF do cliente desejado:");
            return sistema.buscarCliente(input.next());
        }
        return null;
    }

    public static void mostrarReservas() {
        Cliente cliente = buscarCliente();
        if (cliente != null) {
            for (int i = 0; i < cliente.getNumReservas(); i++) {
                System.out.println(cliente.getReservas()[i].toString());
            }
        } else {
            if (sistema.getNumClientes() == 0) {
                System.out.println("Nenhum usuário cadastrado");
                return;
            }
            System.out.println("CPF não encontrado.");
        }
    }

    public static Cidade escolherCidade() {
        System.out.println("Escolha a cidade pelo ID dela a seguir:");
        for (int i = 0; i < sistema.getNumCidades(); i++) {
            System.out.println("Cidade #" + (i+1));
            System.out.println(sistema.getCidades()[i].toString());
        }
        return sistema.getCidades()[input.nextInt()-1];
    }

    public static Reserva novaReserva() {
        Reserva reserva = new Reserva();
        System.out.println("Digite a data do voo:");
        reserva.setDataVoo(input.next());
        System.out.println("Digite a hora do voo:");
        reserva.setHoraVoo(input.next());
        System.out.println("Digite o preço do voo:");
        reserva.setPreco(input.nextDouble());
        System.out.println("Digite a classe do voo:");
        reserva.setClasseVoo(input.next());
        System.out.println("Digite a poltrona do voo:");
        reserva.setPoltrona(input.next());
        System.out.println("Origem:");
        reserva.setOrigem(escolherCidade());
        System.out.println("Destino:");
        reserva.setDestino(escolherCidade());

        return reserva;
    }
}
