package models;

import interfaces.Cri;
import utils.Utils;

public class Chien extends Animal implements Cri {

    public Chien(String name) {
        super(name);
    }

    @Override
    public void crier() {
        Utils.afficher("Le chien " + name + " : ouaf"); }

}
