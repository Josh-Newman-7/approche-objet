package TP16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Recherche10VillesParRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le nom de la Région pour laquelle vous souhaitez rechercher les 10 villes les plus peuplées :");
        String nomRegion = scanner.next();

        List<Ville> villesDeLaRegion = new ArrayList<>();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                villesDeLaRegion.add(ville);
            }
        }

        if (villesDeLaRegion.isEmpty()) {
            System.out.println("Aucune ville trouvée pour le nom de Région spécifié.");
            return;
        }

        // Trier les villes par population (du plus élevé au plus bas)
        Comparator<Ville> comparator = Comparator.comparingInt(Ville::getPopulationTotale);

	    // Inversez l'ordre de tri (du plus élevé au plus bas).
	    comparator = comparator.reversed();
	
	    // Triez la liste des villes du département en utilisant le comparateur.
	    villesDeLaRegion.sort(comparator);


        int count = 0;
        for (Ville ville : villesDeLaRegion) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale() + " habitants");
            count++;
            if (count >= 10) {
                break;
            }
        }
	}
}
