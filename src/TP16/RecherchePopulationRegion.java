package TP16;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le nom de la région que vous souhaitez rechercher :");
        String nomRegion = scanner.next();

        int populationRegion = 0;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                populationRegion += ville.getPopulationTotale();
            }
        }

        if (populationRegion > 0) {
            System.out.println("La population de la Région " + nomRegion + " est de : " + populationRegion + " habitants.");
        } else {
            System.out.println("Région non trouvée ou aucune ville dans la région.");
        }
	}

}
