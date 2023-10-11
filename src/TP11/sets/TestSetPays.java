package TP11.sets;

import java.util.HashSet;

public class TestSetPays {

	public static void main(String[] args) {
		
		HashSet<Pays> set = new HashSet<Pays>();
		set.add(new Pays("USA", 339000000, 62606.1));
        set.add(new Pays("France", 68042591, 41463.7));
        set.add(new Pays("Allemagne", 83860000, 46443.4));
        set.add(new Pays("UK", 67736802, 42943.9));
        set.add(new Pays("Italie", 59000000, 34483.2));
        set.add(new Pays("Japon", 122000000, 40961.2));
        set.add(new Pays("Chine", 1425700000, 10847.1));
        set.add(new Pays("Russie", 146142959, 10956.1));
        set.add(new Pays("Inde", 1428600000, 3750.0));
        
        System.out.println("Set de Base :");
        for (Pays pays : set) {
            System.out.println(pays.toString());
        }
        
        //PIB Max
        double maxPibParHabitant = Double.MIN_VALUE;
        Pays paysMaxPibParHabitant = null;
        for (Pays pays : set) {
            if (pays.getPib() > maxPibParHabitant) {
                maxPibParHabitant = pays.getPib();
                paysMaxPibParHabitant = pays;
            }
        }
        System.out.println("PIB Max : " + paysMaxPibParHabitant);
        
        //PIB Total Max
        double maxPibTotal = Double.MIN_VALUE;
        Pays paysMaxPibTotal = null;
        for (Pays pays : set) {
            double pibTotal = pays.getNbHabitants() * pays.getPib();
            if (pibTotal > maxPibTotal) {
                maxPibTotal = pibTotal;
                paysMaxPibTotal = pays;
            }
        }
        System.out.println("PIB Total Max : " + paysMaxPibTotal);

        // Maj pour le plus petit PIB
        double minPibTotal = Double.MAX_VALUE;
        Pays paysMinPibTotal = null;
        for (Pays pays : set) {
            double pibTotal = pays.getNbHabitants() * pays.getPib();
            if (pibTotal < minPibTotal) {
                minPibTotal = pibTotal;
                paysMinPibTotal = pays;
            }
        }
        if (paysMinPibTotal != null) {
            paysMinPibTotal.setName(paysMinPibTotal.getName().toUpperCase());
        }

        // Del plus petit PIB
        if (paysMinPibTotal != null) {
            set.remove(paysMinPibTotal);
        }

        //New Set
        System.out.println("New Set :");
        for (Pays pays : set) {
            System.out.println(pays.toString());
        }
	}

}
