package TP16;

import java.util.Comparator;
import java.util.Scanner;

public class Recherche10VillesFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Voici les 10 villes les plus peuplées de France :");

        // Trier les villes par population (du plus élevé au plus bas)
        Comparator<Ville> comparator = Comparator.comparingInt(Ville::getPopulationTotale);

	    // Inversez l'ordre de tri (du plus élevé au plus bas).
	    comparator = comparator.reversed();
	
	    // Triez la liste des villes du département en utilisant le comparateur.
	    recensement.getVilles().sort(comparator);


        int count = 0;
        for (Ville ville : recensement.getVilles()) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale() + " habitants");
            count++;
            if (count >= 10) {
                break;
            }
        }
	}

}
