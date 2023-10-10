package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Character {
    private int strength;
    private int lifePoint;
    private int score;

    public Character() {
        Random random = new Random();
        this.strength = random.nextInt(7) + 12; // Force entre 12 et 18
        this.lifePoint = random.nextInt(31) + 20; // Points de vie entre 20 et 50
        this.score = 0;
    }

    public void combattre(Creature creature) {
        Scanner scanner = new Scanner(System.in);

        while (lifePoint > 0 && creature.getLifePoint() > 0) {
            int attaquePersonnage = strength + new Random().nextInt(10) + 1;
            int attaqueCreature = creature.getStrength() + new Random().nextInt(10) + 1;

            if (attaquePersonnage > attaqueCreature) {
                int degats = attaquePersonnage - attaqueCreature;
                creature.setLifePoint(creature.getLifePoint() - degats);
                System.out.println("Votre personnage inflige " + degats + " dégâts à la créature.");
            } else {
                int degats = attaqueCreature - attaquePersonnage;
                lifePoint -= degats;
                System.out.println("La créature inflige " + degats + " dégâts à votre personnage.");
            }

            if (lifePoint <= 0) {
                System.out.println("Votre personnage est décédé. Il a obtenu le score de " + score + " points. Veuillez créer un nouveau personnage.");
            } else if (creature.getLifePoint() <= 0) {
                int gainScore = 0;
                if (creature instanceof Loup) {
                    gainScore = 1;
                } else if (creature instanceof Gobelin) {
                    gainScore = 2;
                } else if (creature instanceof Troll) {
                    gainScore = 5;
                }
                score += gainScore;
                System.out.println("Votre personnage a gagné le combat contre la créature (" + creature.getClass().getSimpleName() + ") avec un gain de score de " + gainScore + " points. Nouveau score : " + score);
            }

            System.out.println("\nPoints de vie restants de votre personnage : " + lifePoint);
            System.out.println("Points de vie restants de la créature : " + creature.getLifePoint());
            System.out.println("\nAppuyez sur Enter pour continuer...");
            scanner.nextLine();
        }
    }

    public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getLifePoint() {
		return lifePoint;
	}

	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


    public void afficherScore() {
        System.out.println("Score : " + score);
    }
}
