import interfaces.Cri;
import models.*;

public class Main {

    public static void main(String[] args) {

        Cri[] animauxQuiCrient = new Cri[3];
        animauxQuiCrient[0] = new Chien("toutou");
        animauxQuiCrient[1] = new Chat("alfred");
        animauxQuiCrient[2] = new Chien("toto");

        for (Cri animal : animauxQuiCrient){
            animal.crier();
        }

    }

}
