package TP16;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le nom de la ville que vous souhaitez rechercher :");
        String nomVille = scanner.next();

        int populationVille = -1;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                populationVille = ville.getPopulationTotale();
                break;
            }
        }

        if (populationVille != -1) {
            System.out.println("La population de la ville de " + nomVille + " est de : " + populationVille + " habitants.");
        } else {
            System.out.println("Ville non trouvée.");
        }
	}
}
