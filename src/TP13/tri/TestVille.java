package TP13.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        List<Ville> listVilles = new ArrayList<>();
        listVilles.add(new Ville("Nice", 343000));
        listVilles.add(new Ville("Carcassonne", 47800));
        listVilles.add(new Ville("Narbonne", 53400));
        listVilles.add(new Ville("Lyon", 484000));
        listVilles.add(new Ville("Foix", 9700));
        listVilles.add(new Ville("Pau", 77200));
        listVilles.add(new Ville("Marseille", 850700));
        listVilles.add(new Ville("Tarbes", 40600));

        Collections.sort(listVilles, new ComparatorNom());
        for (Ville ville : listVilles) {
            System.out.println("NomVille: " + ville.getName());
        }
        System.out.println("\n");
        Collections.sort(listVilles, new ComparatorHabitant());
        for (Ville ville : listVilles) {
            System.out.println("NbHabitants: " + ville.getNbHabitants());
        }
        
        
    }
}
