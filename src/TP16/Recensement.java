package TP16;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private List<Ville> villes;

    public Recensement() {
        villes = new ArrayList<>();
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void ajouterVille(Ville ville) {
        villes.add(ville);
    }
    
}
