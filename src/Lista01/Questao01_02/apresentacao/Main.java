package Lista01.Questao01_02.apresentacao;

import Lista01.Questao01_02.dados.*;
import Lista01.Questao01_02.negocio.Negocio;

public class Main {

    public static void main(String[] args) {
        Negocio sistema = new Negocio();

        Endereco endereco1 = new Endereco();
        Data data1 = new Data();
        Veiculo veiculo1 = new Veiculo();
        Cliente cliente1 = new Cliente();

        endereco1.setRua("Gov. Magalhães Barata");
        endereco1.setNumero("44");
        endereco1.setBairro("Nazaré");
        endereco1.setCidade("Belém");
        endereco1.setEstado("Pará");
        endereco1.setCep("66040170");

        data1.setDia("08");
        data1.setMes("12");
        data1.setAno("2022");

        veiculo1.setModelo("KE100");
        veiculo1.setMarca("KAWASAKI");
        veiculo1.setCor("Verde");
        veiculo1.setPlaca("HLA5349");
        veiculo1.setAno(2001);
        veiculo1.setDevolucao(data1);

        cliente1.setNome("Tomás");
        cliente1.setCpf("38132910818");
        cliente1.setEndereco(endereco1);
        cliente1.setVeiculoAlugado(veiculo1);

        sistema.setVeiculo(veiculo1);
        sistema.setCliente(cliente1);

        Endereco endereco2 = new Endereco("Luciano Pavarotti", "154", "Cachoeira", "Curitiba", "Paraná", "82220408");
        Data data2 = new Data("07", "03", "2022");
        Veiculo veiculo2 = new Veiculo("R1100S Boxer Cup Replica", "BMW", "Branco", "HYN3562", 2003, data2);
        Cliente cliente2 = new Cliente("Roberto", "41533968772", endereco2, veiculo2);
        sistema.setVeiculo(veiculo2);
        sistema.setCliente(cliente2);

        System.out.println("~~~ Veículos ~~~");
        for (Veiculo veiculo : sistema.getVeiculos()) {
            System.out.println(veiculo);
        }

        System.out.println("\n~~~ Clientes ~~~");
        for (Cliente cliente : sistema.getClientes()) {
            System.out.println(cliente);
        }
    }

}
