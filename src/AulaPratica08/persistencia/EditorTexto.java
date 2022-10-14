package AulaPratica08.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class EditorTexto {
	public List<String> leTexto(String caminho) {
		List<String> dados = new LinkedList<>();

		FileReader fileReader;
		BufferedReader bufferedReader;

		try {
			fileReader = new FileReader(caminho);
			bufferedReader = new BufferedReader(fileReader);
			String buffer = bufferedReader.readLine();

			while (buffer != null) {
				dados.add(buffer);
				buffer = bufferedReader.readLine();
			}
			fileReader.close();
		} catch (Exception e) {
			System.err.println("Erro ao ler arquivo");
			System.exit(0);
		}

		return dados;
	}

	public void gravaTexto(String caminho, List<String> dados) {
		FileWriter file;
		try	{
			file = new FileWriter(caminho);
			for (String line : dados) {
				file.write(line);
				file.write("\n");
			}
			file.close();
		} catch (Exception e) {
			System.err.println("Erro ao gravar texto");
			System.exit(0);
		}
	}

	public void gravaTexto(String caminho, String line) {
		FileWriter file;
		try	{
			// Second parameter is for append
			file = new FileWriter(caminho, true);
			file.write(line);
			file.write("\n");
			file.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Erro ao gravar texto");
			System.exit(0);
		}
	}
}
