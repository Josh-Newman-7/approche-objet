package TP12.maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		//TODO Développements à réaliser ci-dessous
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		System.out.println("\nEnsemble des Clefs : ");
		for (Integer num : mapVilles.keySet()) {
            System.out.print(num + ", ");
        }
		
		System.out.println("\n\nEnsemble des valeurs : ");
		for (String ville : mapVilles.values()) {
            System.out.print(ville + ", ");
        }
		
		System.out.println("\n\nmapSalaires.size() : " + mapVilles.size());
}
}