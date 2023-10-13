package TP16;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Recherche10Region extends MenuService {

	@Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> regionsPopulation = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String nomRegion = ville.getNomRegion();
            int population = ville.getPopulationTotale();
            
            regionsPopulation.put(nomRegion, regionsPopulation.getOrDefault(nomRegion, 0) + population);
        }

        // Convertir la map en une liste de paires (nom de la région, population)
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(regionsPopulation.entrySet());

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
