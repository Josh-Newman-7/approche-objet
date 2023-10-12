package TP12.maps;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> listPays = new ArrayList<>();

		listPays.add(new Pays("France","Europe",65000000));
		listPays.add(new Pays("Allemagne","Europe",80000000));
		listPays.add(new Pays("Belgique","Europe",10000000));
		listPays.add(new Pays("Russie","Asie",150000000));
		listPays.add(new Pays("Indonésie","Océanie",220000000));
		listPays.add(new Pays("Australie","Océanie",20000000));
		
		Map<String, Integer> compteurParContinent = new HashMap<>();
        
        for (Pays pays : listPays) {
            String continent = pays.getContinent();
            compteurParContinent.put(continent, compteurParContinent.getOrDefault(continent, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : compteurParContinent.entrySet()) {
            System.out.println("Continent : " + entry.getKey() + ", Nombre de pays : " + entry.getValue());
        }
	}

}
