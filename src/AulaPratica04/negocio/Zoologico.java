package AulaPratica04.negocio;

import AulaPratica04.dados.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Viveiro> viveiros;
    private ArrayList<Animal> animais;

    public Zoologico() {
        viveiros = new ArrayList<>();
        animais = new ArrayList<>();
    }

    public ArrayList<Viveiro> getViveiros() {
        return viveiros;
    }

    public void setViveiros(ArrayList<Viveiro> viveiros) {
        this.viveiros = viveiros;
    }

    public ArrayList<Viveiro> getOnlyViveiros() {
        ArrayList<Viveiro> onlyViveiros = new ArrayList<>();
        if (viveiros.size() > 0) {
            for (Viveiro viveiro : viveiros) {
                if (! (viveiro instanceof Aquario)) {
                    onlyViveiros.add(viveiro);
                }
            }
        }
        return onlyViveiros;
    }

    public ArrayList<Aquario> getOnlyAquarios() {
        ArrayList<Aquario> onlyAquarios = new ArrayList<>();
        if (viveiros.size() > 0) {
            for (Viveiro viveiro : viveiros) {
                if (viveiro instanceof Aquario) {
                    onlyAquarios.add((Aquario) viveiro);
                }
            }
        }
        return onlyAquarios;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public void cadastrarViveiro(Viveiro viveiro) {
        viveiros.add(viveiro);
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public boolean alocarAnimal(Animal animal, Viveiro viveiro) {
        if (viveiro instanceof Aquario) {
            if (animal instanceof Peixe) {
                return ((Aquario) viveiro).adicionaAnimal(animal);
            } else {
                return false;
            }
        } else {
            if (animal instanceof Peixe) {
                return false;
            } else {
                return viveiro.adicionarAnimal(animal);
            }
        }
    }
}
