package Lista01.Questao01_02.negocio;

import Lista01.Questao01_02.dados.Veiculo;
import Lista01.Questao01_02.dados.Cliente;

import java.util.Arrays;

public class Negocio {
    private Veiculo[] veiculos = new Veiculo[2];
    private int numVeiculos = 0;
    private Cliente[] clientes = new Cliente[2];
    private int numClientes = 0;

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculos[this.numVeiculos++] = veiculo;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setCliente(Cliente cliente) {
        this.clientes[this.numClientes++] = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Negocio negocio = (Negocio) o;
        return numVeiculos == negocio.numVeiculos && numClientes == negocio.numClientes && Arrays.equals(veiculos, negocio.veiculos) && Arrays.equals(clientes, negocio.clientes);
    }

    public String toString() {
        return "\n~~~Veículos~~~\n" + Arrays.toString(veiculos) + "\n~~~Clientes~~~\n" + Arrays.toString(clientes);
    }
}
