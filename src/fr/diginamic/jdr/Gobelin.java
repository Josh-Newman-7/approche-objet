package fr.diginamic.jdr;

public class Gobelin extends Creature {
    public Gobelin() {
        super(5 + (int) (Math.random() * 6), 10 + (int) (Math.random() * 6));
    }
}