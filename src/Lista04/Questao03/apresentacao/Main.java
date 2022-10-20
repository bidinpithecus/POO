package Lista04.Questao03.apresentacao;

import Lista04.Questao03.dados.Qualidade;
import Lista04.Questao03.exceptions.NomeInvalidoException;
import Lista04.Questao03.negocio.SistemaArquivos;

public class Main {
	public static final SistemaArquivos sistemaArquivos = new SistemaArquivos();

	public static void main(String[] args) {
		try {
			sistemaArquivos.criarDocumento("comprasdasemana", "Desktop", "Banana\nMacarrão\nMolho de Tomate\nSabão em Pó\nPapel Higiênico");
		} catch(NomeInvalidoException exception) {
			System.out.println(exception.getMessage());
		}

		try {
			sistemaArquivos.criarDocumento("Notas", "Desktop", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sollicitudin arcu justo, a pellentesque lorem mollis sit amet. Vivamus ut lectus vitae dui iaculis auctor non eget est.");
		} catch(NomeInvalidoException exception) {
			System.out.println(exception.getMessage());
		}

		try {
			sistemaArquivos.criarMusica("All Star - Smash Mouth", "Downloads", 201);
		} catch(NomeInvalidoException exception) {
			System.out.println(exception.getMessage());
		}

		try {
			sistemaArquivos.criarMusica("Maresia - Adriana Calcanhoto", "Downloads", 217);
		} catch(NomeInvalidoException exception) {
			System.out.println(exception.getMessage());
		}

		try {
			sistemaArquivos.criarVideo("Shrek - Dreamworks", "Downloads", Qualidade.Q_1024P);
		} catch(NomeInvalidoException exception) {
			System.out.println(exception.getMessage());
		}

		try {
			sistemaArquivos.criarVideo("RickAndMortyS01E01 - Starburns", "Downloads", Qualidade.Q_1024P);
		} catch(NomeInvalidoException exception) {
			System.out.println(exception.getMessage());
		}

		System.out.println(sistemaArquivos);
	}
}
