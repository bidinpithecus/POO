package Lista02.Questao01.apresentacao;

import Lista02.Questao01.dados.Pessoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    private static Scanner input;

    static {
        try {
            input = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, List<Pessoa>> pessoas = new HashMap<>();

    private static void Pessoas(Map<String, List<Pessoa>> pessoas) {
        pessoas.put("Criancas", new ArrayList<>());
        pessoas.put("Adolescentes", new ArrayList<>());
        pessoas.put("Jovens", new ArrayList<>());
        pessoas.put("Adultos", new ArrayList<>());
        pessoas.put("Idosos", new ArrayList<>());
    }

    public static Pessoa novaPessoa() {
        Pessoa pessoa = new Pessoa();
        System.out.println("Nome:");
        pessoa.setNome(input.nextLine());
        System.out.println("Idade:");
        pessoa.setIdade(input.nextInt());
        System.out.println("Cpf:");
        pessoa.setCpf(input.nextLine());
        System.out.println("Cidade:");
        pessoa.setCidade(input.nextLine());

        return pessoa;
    }

    public static void adicionarPessoa(Pessoa pessoa) {
        int idade = pessoa.getIdade();
        if (idade >= 1 && idade <= 12) {
            pessoas.put("Criancas", pessoa);
            // add person to list on the set
        }
    }

}
