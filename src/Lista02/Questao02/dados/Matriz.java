package Lista02.Questao02.dados;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Matriz<T> {
	private int line;
	private int col;
	private T[][] matriz;

	public Matriz(int n, int m) {
		if (n > 0 && m > 0) {
			this.line = n;
			this.col = m;
			for (int i = 0; i < this.line; i++) {
				for (int j = 0; j < this.col; j++) {
					this.matriz[i][j] = null;
				}
			}
		}
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
		return null;
	}


}
