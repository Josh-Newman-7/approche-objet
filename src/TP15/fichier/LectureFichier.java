package TP15.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/temp/recensement.csv");

		if(Files.exists(path) && Files.isRegularFile(path) && Files.isReadable(path)) {
			List<String> lignes = Files.readAllLines(path);
            for (String ligne : lignes) {
                //System.out.println(ligne);
            }
		}
		 
		ArrayList<Ville> list = new ArrayList<>();
		try (BufferedReader lecteur = new BufferedReader(new FileReader("C:/temp/recensement.csv"))) {
            String ligne;
            
            // Lire la première ligne (en-tête) pour la sauter
            lecteur.readLine();
            while ((ligne = lecteur.readLine()) != null) {
                String[] tokens = ligne.split(";");
                String nom = tokens[6];
                String codeDepartement = tokens[2];
                String nomRegion = tokens[1];
                int populationTotale = Integer.parseInt(tokens[9].replace(" ", ""));
                
                Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);
                //System.out.println(ville.toString());
                if(ville.getPopulation()>=25000) {
                	list.add(ville);
                }
            }

            for (Ville ville : list) {
                System.out.println(ville);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/temp/villes_plus_de_25000.csv"))) {
            // Écrire l'en-tête
            writer.write("Nom;Code Département;Nom de la Région;Population Totale\n");

            for (Ville ville : list) {
                if (ville.getPopulation() > 25000) {
                    // Écrire les informations de la ville dans le fichier de sortie
                    writer.write(String.format("%s;%s;%s;%d\n", ville.getName(), ville.getCodeDepartement(), ville.getNameRegion(), ville.getPopulation()));
                }
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
