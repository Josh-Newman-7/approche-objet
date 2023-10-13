package TP16;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le code du département que vous souhaitez rechercher :");
        String codeDepartement = scanner.next();

        int populationDepartement = 0;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
                populationDepartement += ville.getPopulationTotale();
            }
        }

        if (populationDepartement > 0) {
            System.out.println("La population du département " + codeDepartement + " est de : " + populationDepartement + " habitants.");
        } else {
            System.out.println("Département non trouvé ou aucune ville dans ce département.");
        }
	}
}
