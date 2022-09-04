package AulaPratica03.SistemaViagem.negocio;

import AulaPratica03.SistemaViagem.dados.Cidade;
import AulaPratica03.SistemaViagem.dados.Cliente;
import AulaPratica03.SistemaViagem.dados.Reserva;

import java.util.Objects;

public class ReservaPassagem {
    private Cidade[] listaCidades = new Cidade[50];
    private Cliente[] listaClientes = new Cliente[50];
    private int numCidades = 0;
    private int numClientes = 0;
    private int numReservas = 0;

    public void cadastrarCidade(Cidade cidade) {
        listaCidades[numCidades++] = cidade;
    }

    public void cadastrarCliente(Cliente cliente) {
        listaClientes[numClientes++] = cliente;
    }

    public void reservarIda(Cliente cliente, Reserva reserva) {
        reserva.setNumReserva(numReservas++);
        cliente.reservarIda(reserva);
    }

    public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta) {
        ida.setNumReserva(numReservas++);
        volta.setNumReserva(numReservas++);
        cliente.reservarVolta(ida, volta);
    }

    public Cliente buscarCliente(String cpf) {
        for (int i = 0; i < numClientes; i++) {
            if (Objects.equals(listaClientes[i].getCpf(), cpf)) {
                return listaClientes[i];
            }
        }
        return null;
    }

    public int getNumCidades() {
        return numCidades;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public Cidade[] getCidades() {
        return listaCidades;
    }

    public Cliente[] getClientes() {
        return listaClientes;
    }

}