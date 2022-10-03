package Lista02.Questao02_03.dados;

import java.util.*;

public class Matriz<T> {
	private int line;
	private int col;
	private T[][] matriz;

	public Matriz(int n, int m) {
		if (n > 0 && m > 0) {
			this.line = n;
			this.col = m;
			matriz = (T[][]) new Object[n][m];
		}
	}

	public int getLine() {
		return line;
	}

	public int getCol() {
		return col;
	}

	public boolean set(T object, int i, int j) {
		if (i > this.line || j > this.col || i < 0 || j < 0) {
			return false;
		}
		this.matriz[i][j] = object;
		return true;
	}

	public T get(int i, int j) {
		if (i > this.line || j > this.col || i < 0 || j < 0) {
			return null;
		}
		return matriz[i][j];
	}

	public List<T> getLinha(int linha) {
		if (linha < 0 || linha > this.line) {
			return null;
		}

		List<T> line = new ArrayList<>();
		for (int i = 0; i < this.col; i++) {
			line.add(i, matriz[linha][i]);
		}
		return line;
	}

	public List<T> getColuna(int coluna) {
		if (coluna < 0 || coluna > this.col) {
			return null;
		}

		List<T> line = new ArrayList<>();
		for (int i = 0; i < this.line; i++) {
			line.add(i, matriz[i][coluna]);
		}
		return line;
	}

	public List<T> getElementsQuadrante(Quadrante quadrante) {
		List<T> quadr = new ArrayList<>();

		if (quadrante == Quadrante.PRIMEIRO) {
			for (int i = 0; i < Math.ceil((double) line / 2); i++) {
				quadr.addAll(Arrays.asList(matriz[i]).subList(0, (int) Math.ceil((double) col / 2)));
			}
		} else if (quadrante == Quadrante.SEGUNDO) {
			for(int i=0; i < Math.ceil((double)line/2); i++){
				quadr.addAll(Arrays.asList(matriz[i]).subList((int) Math.ceil((double) col / 2), col));
			}
		} else if (quadrante == Quadrante.TERCEIRO) {
			for(int i = (int) Math.ceil((double) line / 2); i < line; i++){
				quadr.addAll(Arrays.asList(matriz[i]).subList(0, (int) Math.ceil((double) col / 2)));
			}
		} else if (quadrante == Quadrante.QUARTO) {
			for(int i = (int) Math.ceil((double) line / 2); i < line; i++){
				quadr.addAll(Arrays.asList(matriz[i]).subList((int) Math.ceil((double) col / 2), col));
			}
		} else {
			return null;
		}
		return quadr;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				string.append(matriz[i][j]).append("\t");
			}
			string.append("\n");
		}
		return string.toString();
	}
}
