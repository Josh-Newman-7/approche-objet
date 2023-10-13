package TP16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Recherche10VillesParDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le code du département pour lequel vous souhaitez rechercher les 10 villes les plus peuplées :");
        String codeDepartement = scanner.next();

        List<Ville> villesDuDepartement = new ArrayList<>();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equals(codeDepartement)) {
                villesDuDepartement.add(ville);
            }
        }

        if (villesDuDepartement.isEmpty()) {
            System.out.println("Aucune ville trouvée pour le code de département spécifié.");
            return;
        }

        // Trier les villes par population (du plus élevé au plus bas)
        Comparator<Ville> comparator = Comparator.comparingInt(Ville::getPopulationTotale);

	    // Inversez l'ordre de tri (du plus élevé au plus bas).
	    comparator = comparator.reversed();
	
	    // Triez la liste des villes du département en utilisant le comparateur.
	    villesDuDepartement.sort(comparator);


        int count = 0;
        for (Ville ville : villesDuDepartement) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale() + " habitants");
            count++;
            if (count >= 10) {
                break;
            }
        }
	}
}
