package TP16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Recherche10Departement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		Map<String, Integer> departementsPopulation = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String nomDepartement = ville.getCodeDepartement();
            int population = ville.getPopulationTotale();
            
            departementsPopulation.put(nomDepartement, departementsPopulation.getOrDefault(nomDepartement, 0) + population);
        }

        // Convertir la map en une liste de paires (code département, population)
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(departementsPopulation.entrySet());

        // Trier la liste en fonction de la population (du plus élevé au plus bas)
        Comparator<Map.Entry<String, Integer>> byValue = Map.Entry.<String, Integer>comparingByValue();
        entries.sort(byValue.reversed());

        // Afficher les 10 régions les plus peuplées
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        int count = 0;
        while (iterator.hasNext() && count < 10) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue() + " habitants");
            count++;
        }
	}
}
