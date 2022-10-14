package AulaPratica08.negocio;

import AulaPratica08.dados.Contato;
import AulaPratica08.persistencia.ContatoDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaTelefonica {
	private ContatoDAO contatoDAO = new ContatoDAO();

	public void adicionarContato(Contato contato) {
		contatoDAO.insert(contato);
	}

	public void removerContato(Contato contato) {
		contatoDAO.delete(contato);
	}

	public List<Contato> buscarContatos(char letra) {
		return listarContatos().get(letra);
	}

	public Map<Character, List<Contato>> listarContatos() {
		return contatoDAO.getAll();
	}
}
