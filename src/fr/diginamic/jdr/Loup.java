package fr.diginamic.jdr;

public class Loup extends Creature {
    public Loup() {
        super(3 + (int) (Math.random() * 6), 5 + (int) (Math.random() * 6));
    }
}
