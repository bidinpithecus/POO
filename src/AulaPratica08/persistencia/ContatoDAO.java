package AulaPratica08.persistencia;

import AulaPratica08.dados.Contato;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ContatoDAO {
	private final ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();
	public void insert(Contato contato) {
		arquivoContatoDAO.salvaContato(contato);
	}

	public void delete(Contato contato) {
		List<Contato> contatos = arquivoContatoDAO.leContatos();
		contatos.remove(contato);
		arquivoContatoDAO.salvaContatos(contatos);
	}

	public Map<Character, List<Contato>> getAll() {
		Map<Character, List<Contato>> contatos = new HashMap<>();
		for (char i = 65; i < 91; i++) {
			List<Contato> lista = new LinkedList<>();
			contatos.put(i, lista);
		}
		List<Contato> listaContatos = arquivoContatoDAO.leContatos();

		for (Contato contato : listaContatos) {
			char inicialContato = contato.getNome().toUpperCase().charAt(0);
			List<Contato> temp = contatos.get(inicialContato);
			temp.add(contato);
		}
		return contatos;
	}
}
