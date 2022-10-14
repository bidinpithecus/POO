package AulaPratica08.persistencia;

import AulaPratica08.dados.Contato;

import java.util.ArrayList;
import java.util.List;

public class ArquivoContatoDAO {
	private String caminho;
	private EditorTexto editorTexto = new EditorTexto();

	private String toCSV(Contato contato) {
		return "";
	}

	private Contato fromCSV(String string) {
		return new Contato();
	}

	public List<Contato> leContatos() {
		return new ArrayList<>();
	}

	public void salvaContatos(List<Contato> contatos) {
		// TODO document why this method is empty
	}
}
