package TP15.fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreerFichier {

	public static void main(String[] args) {
        String fichierSource = "C:/temp/recensement.csv";
        String fichierDestination = "C:/temp/100_premieres_lignes.csv";

        try (BufferedReader lecteur = new BufferedReader(new FileReader(fichierSource));
             BufferedWriter ecrivain = new BufferedWriter(new FileWriter(fichierDestination))) {
            String ligne;
            int lignesLues = 0;
            while ((ligne = lecteur.readLine()) != null && lignesLues < 100) {
                ecrivain.write(ligne);
                ecrivain.newLine();
                lignesLues++;
            }

            System.out.println("Les 100 premières lignes ont été extraites et enregistrées ici : " + fichierDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
