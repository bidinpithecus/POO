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
        if (pessoa.getIdade() <= 0) {
            return null;
        }
        System.out.println("Cpf:");
        pessoa.setCpf(input.nextLine());
        System.out.println("Cidade:");
        pessoa.setCidade(input.nextLine());

        return pessoa;
    }

    public static void adicionarPessoa(Pessoa pessoa) {
        int idade = pessoa.getIdade();
        if (pessoa.equals(null)) {
            return;
        } else if (idade >= 1 && idade <= 12) {
            pessoas.put("Criancas", add(pessoa));
            // add person to list on the set
        } else if (idade >= 13 && idade <= 18) {
            pessoas.put("Adolescentes", add(pessoa));
            // add person to list on the set
        } else if (idade >= 19 && idade <= 25) {
        pessoas.put("Jovens", add(pessoa));
        // add person to list on the set
        } else if (idade >= 26 && idade <= 59) {
        pessoas.put("Adultos", add(pessoa));
        // add person to list on the set
        } else if (idade >= 60) {
        pessoas.put("Idosos", add(pessoa));
        // add person to list on the set
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (true) {
            opcao = input.nextInt();
            if (opcao == -1) {
                return;
            }
            adicionarPessoa(novaPessoa());
        }


    }

}
