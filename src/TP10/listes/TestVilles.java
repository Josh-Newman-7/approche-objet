package TP10.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

	public static void main(String[] args) {
		List<Ville> listVilles = new ArrayList<Ville>();

        listVilles.add(new Ville("Nice", 343000));
        listVilles.add(new Ville("Carcassonne", 47800));
        listVilles.add(new Ville("Narbonne", 53400));
        listVilles.add(new Ville("Lyon", 484000));
        listVilles.add(new Ville("Foix", 9700));
        listVilles.add(new Ville("Pau", 77200));
        listVilles.add(new Ville("Marseille", 850700));
        listVilles.add(new Ville("Tarbes", 40600));
        
        Ville villeLongue = listVilles.get(0);
        for (Ville ville : listVilles) {
            if (ville.getNbHabitants() > villeLongue.getNbHabitants()) {
                villeLongue = ville;
            }
        }
        System.out.println("Ville avec le plus grand nombre d'habitants : " + villeLongue);
        System.out.println("\n");

        Ville villeBoom = listVilles.get(0);
        for (Ville ville : listVilles) {
            if (ville.getNbHabitants() < villeBoom.getNbHabitants()) {
                villeBoom = ville;
            }
        }
        listVilles.remove(villeBoom);
        System.out.println("Ville à exploser parce que trop peu d'habitants : " + villeBoom.toString());
        System.out.println("\n");
        
        for (Ville ville : listVilles) {
            if (ville.getNbHabitants() > 100000) {
                ville.setName(ville.getName().toUpperCase());
            }
        }
        
        for (Ville ville : listVilles) {
            System.out.println(ville.toString());
        }
	}
}
