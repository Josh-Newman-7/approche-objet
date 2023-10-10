package fr.diginamic.jdr;

import java.util.Scanner;

public class JeuDeRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character character = null;

        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    character = createCharacter();
                    break;
                case 2:
                    if (character != null) {
                    	System.out.println("\n");
                        combattreCreature(character);
                    } else {
                        System.out.println("Veuillez créer un personnage d'abord.");
                    }
                    break;
                case 3:
                    if (character != null) {
                        character.afficherScore();
                    } else {
                        System.out.println("Veuillez créer un personnage d'abord.");
                    }
                    break;
                case 4:
                    System.out.println("Merci d'avoir joué !");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("Menu :");
        System.out.println("1. Créer le personnage (reset des scores)");
        System.out.println("2. Combattre une créature");
        System.out.println("3. Afficher score");
        System.out.println("4. Sortir");
        System.out.print("Choix : ");
    }

    private static Character createCharacter() {
        Character character = new Character();
        System.out.println("Personnage créé avec succès !\n");
        return character;
    }

    private static void combattreCreature(Character character) {
        Creature creature = chooseRandomCreature();

        System.out.println("Un combat débute !");
        System.out.println("Votre personnage (Force: " + character.getStrength() + ", Points de vie: " + character.getLifePoint() + ")");
        System.out.println("Contre une créature (" + creature.getClass().getSimpleName() + ") (Force: " + creature.getStrength() + ", Points de vie: " + creature.getLifePoint() + ")\n");

        character.combattre(creature);
    }

    private static Creature chooseRandomCreature() {
        int choix = (int) (Math.random() * 3);
        switch (choix) {
            case 0:
                return new Loup();
            case 1:
                return new Gobelin();
            default:
                return new Troll();
        }
    }
}
