package AulaPratica09.negocio;

import AulaPratica09.dados.*;
import AulaPratica09.exceptions.EspacoIndisponivelException;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private final List<Viveiro> viveiros;
	private final List<Animal> animais;

	public Zoologico() {
		viveiros = new ArrayList<>();
		animais = new ArrayList<>();
	}

	public List<Viveiro> getViveiros() {
		return viveiros;
	}

	public List<Viveiro> getOnlyViveiros() {
		List<Viveiro> onlyViveiros = new ArrayList<>();
		if (!viveiros.isEmpty()) {
			for (Viveiro viveiro : viveiros) {
				if (! (viveiro instanceof Aquario)) {
					onlyViveiros.add(viveiro);
				}
			}
		}
		return onlyViveiros;
	}

	public List<Aquario> getOnlyAquarios() {
		List<Aquario> onlyAquarios = new ArrayList<>();
		if (!viveiros.isEmpty()) {
			for (Viveiro viveiro : viveiros) {
				if (viveiro instanceof Aquario) {
					onlyAquarios.add((Aquario) viveiro);
				}
			}
		}
		return onlyAquarios;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void cadastrarViveiro(Viveiro viveiro) {
		viveiros.add(viveiro);
	}

	public void cadastrarAnimal(Animal animal) {
		animais.add(animal);
	}

	public void alocarAnimal(Animal animal, Viveiro viveiro) throws EspacoIndisponivelException {
		viveiro.adicionarAnimal(animal);
	}
}
