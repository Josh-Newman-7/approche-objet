package fr.diginamic.jdr;

public class Troll extends Creature {
    public Troll() {
        super(10 + (int) (Math.random() * 6), 20 + (int) (Math.random() * 11));
    }
}
