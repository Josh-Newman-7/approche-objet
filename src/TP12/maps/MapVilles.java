package TP12.maps;

import java.util.HashMap;
import java.util.Map;
import TP10.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		Map<String, Ville> map = new HashMap<>();
		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);
		
		map.put(nice.getName(),nice);
		map.put(carcassonne.getName(),carcassonne);
		map.put(narbonne.getName(),narbonne);
		map.put(foix.getName(),foix);
		map.put(lyon.getName(),lyon);
		map.put(pau.getName(),pau);
		map.put(marseille.getName(),marseille);
		map.put(tarbes.getName(),tarbes);
		
        for (Map.Entry<String, Ville> entry : map.entrySet()) {
        	System.out.println(entry.toString());
        }
        
		int habitantsMin = Integer.MAX_VALUE;
        String nomVilleMin = null;

        for (Map.Entry<String, Ville> entry : map.entrySet()) {
            if (entry.getValue().getNbHabitants() < habitantsMin) {
                habitantsMin = entry.getValue().getNbHabitants();
                nomVilleMin = entry.getKey();
            }
        }

        if (nomVilleMin != null) {
            map.remove(nomVilleMin);
        }

        System.out.println();
        for (Map.Entry<String, Ville> entry : map.entrySet()) {
        	System.out.println(entry.toString());
        }
	}

}
