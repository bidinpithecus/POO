package AulaPratica05.negocio;

import AulaPratica05.dados.Contato;

import java.util.*;

public class ListaTelefonica {
    private Map<Character, List<Contato>> contatos = new HashMap<Character, List<Contato>>();

    public ListaTelefonica() {
        for (char i = 65; i < 91; i++) {
            List<Contato> listaTelefonica = new LinkedList<>();
            contatos.put(i, listaTelefonica);
        }
    }

    public void adicionaContato(Contato contato) {
        char letra = contato.getNome().toUpperCase().charAt(0);
        contatos.get(letra).add(contato);
    }

    public void removerContato(Contato contato) {
        char letra = contato.getNome().toUpperCase().charAt(0);
        contatos.get(letra).remove(contato);
    }

    public List<Contato> buscarContatos(char letra) {
        return contatos.get(letra);
    }

    public Map<Character, List<Contato>> buscarContatos() {
        return contatos;
    }
}
