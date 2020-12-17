package models;

import interfaces.Cri;
import utils.Utils;

public class Chat extends Animal implements Cri {

    public Chat(String name) {
        super(name);
    }

    @Override
    public void crier() {
        Utils.afficher("Le chat " + name + " : miaou");
    }
}
