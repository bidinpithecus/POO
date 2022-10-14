package AulaPratica08.persistencia;

import AulaPratica08.dados.Contato;

import java.util.LinkedList;
import java.util.List;

public class ArquivoContatoDAO {
	private final String caminho = "src/AulaPratica08/files/contatos.csv";
	private final EditorTexto editorTexto = new EditorTexto();

	private String toCSV(Contato contato) {
		return contato.getNome() + "," + contato.getTelefone();
	}

	private Contato fromCSV(String string) {
		Contato contato = new Contato();
		String[] atributos = string.split(",");

		contato.setNome(atributos[0]);
		contato.setTelefone(atributos[1]);

		return contato;
	}

	public List<Contato> leContatos() {
		List<Contato> listaContatos = new LinkedList<>();

		for (String line : editorTexto.leTexto(caminho)) {
			listaContatos.add(this.fromCSV(line));
		}

		return listaContatos;
	}

	public void salvaContato(Contato contato) {
		editorTexto.gravaTexto(caminho, toCSV(contato));
	}

	public void salvaContatos(List<Contato> contatos) {
		List<String> contatosString = new LinkedList<>();
		for (Contato contato : contatos) {
			contatosString.add(toCSV(contato));
		}
		editorTexto.gravaTexto(caminho, contatosString);
	}
}
