package Lista02.Questao01.apresentacao;

import Lista02.Questao01.dados.Pessoa;
import Lista02.Questao01.negocio.Sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Sistema sistema = new Sistema();

    public static Pessoa novaPessoa() {
        Pessoa pessoa = new Pessoa();
        System.out.println("Nome:");
        pessoa.setNome(input.nextLine());
        System.out.println("Idade:");
        pessoa.setIdade(Integer.parseInt(input.nextLine()));
        if (pessoa.getIdade() < 1) {
            return null;
        }
        System.out.println("Cpf:");
        pessoa.setCpf(input.nextLine());
        System.out.println("Cidade:");
        pessoa.setCidade(input.nextLine());

        return pessoa;
    }

    public static void main(String[] args) {
        int opcao = 1;
        while (opcao != -1) {
            Pessoa tempPessoa = novaPessoa();
            if (Objects.isNull(tempPessoa)) {
                System.out.println("Erro ao criar pessoa");
            } else {
                sistema.adicionarPessoa(tempPessoa);
            }
            System.out.println("Para cadastrar outra pessoa, Digite 1. \nPara sair, -1");
            opcao = Integer.parseInt(input.nextLine());
        }
        sistema.ordenar();
        sistema.print();
    }

}
