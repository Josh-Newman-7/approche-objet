package TP16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Bienvenue !");
		System.out.println("- 1. Population d’une ville donnée\r\n"
				+ "- 2. Population d’un département donné\r\n"
				+ "- 3. Population d’une région donnée\r\n"
				+ "- 4. Afficher les 10 régions les plus peuplées\r\n"
				+ "- 5. Afficher les 10 départements les plus peuplés\r\n"
				+ "- 6. Afficher les 10 villes les plus peuplées d’un département\r\n"
				+ "- 7. Afficher les 10 villes les plus peuplées d’une région\r\n"
				+ "- 8. Afficher les 10 villes les plus peuplées de France\r\n"
				+ "- 9. Sortir");
		System.out.print("Choix : ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        Recensement recensement = new Recensement();
        Path path = Paths.get("C:/temp/recensement.csv");
        if(choix < 9 && choix >0) {
	        if (Files.exists(path) && Files.isRegularFile(path) && Files.isReadable(path)) {
	            List<String> lignes;
	            try {
	                lignes = Files.readAllLines(path);
	                for (int i = 1; i < lignes.size(); i++) {
	                    String ligne = lignes.get(i);
	                    String[] champs = ligne.split(";");
	
	                    if (champs.length >= 6) {
	                        Ville ville = new Ville(champs[0], champs[1], champs[2], champs[5], champs[6], Integer.parseInt(champs[9].replace(" ","")));
	                        recensement.ajouterVille(ville);
	                    }
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
        }
        switch (choix) {
            case 1:
            	RecherchePopulationVille recherchePopVille = new RecherchePopulationVille();
            	recherchePopVille.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 2:
            	RecherchePopulationDepartement recherchePopDep = new RecherchePopulationDepartement();
            	recherchePopDep.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 3:
            	RecherchePopulationRegion recherchePopReg = new RecherchePopulationRegion();
            	recherchePopReg.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 4:
            	Recherche10Region recherche10Reg = new Recherche10Region();
            	recherche10Reg.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 5:
            	Recherche10Departement recherche10Dep = new Recherche10Departement();
            	recherche10Dep.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 6:
            	Recherche10VillesParDepartement recherche10VilDep = new Recherche10VillesParDepartement();
            	recherche10VilDep.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 7:
            	Recherche10VillesParRegion recherche10VilReg = new Recherche10VillesParRegion();
            	recherche10VilReg.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 8:
            	Recherche10VillesFrance recherche10Vil = new Recherche10VillesFrance();
            	recherche10Vil.traiter(recensement,scanner);
            	System.out.println();
                break;
            case 9:
            	System.out.println("Au revoir!");
                System.exit(0);
            default:
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
        }
	}
}
